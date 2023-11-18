package com.eats.eats.food.service;

import com.eats.eats.food.dto.FoodDTO;
import com.eats.eats.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {
    private final FoodRepository FoodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodMapRepository) {
        this.FoodRepository = foodMapRepository;
    }

    @Override
    public Collection<FoodDTO> getAllFoods() {
        return FoodRepository.getAllFoods();
    }

    @Override
    public Optional<FoodDTO> getFoodById(Long id) {
        return FoodRepository.getFoodById(id);
    }

    @Override
    public FoodDTO addFood(Long id, FoodDTO food) {
        return FoodRepository.addFood(id, food);
    }

    @Override
    public FoodDTO updateFood(Long id, FoodDTO food) {
        return FoodRepository.updateFood(id, food);
    }

    @Override
    public void deleteFood(Long id) {
        FoodRepository.deleteFood(id);
    }
}
