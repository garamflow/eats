package com.eats.eats.food.service;

import com.eats.eats.food.dto.FoodDTO;
import com.eats.eats.food.repository.FoodMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {
    private final FoodMapRepository foodMapRepository;

    @Autowired
    public FoodServiceImpl(FoodMapRepository foodMapRepository) {
        this.foodMapRepository = foodMapRepository;
    }

    @Override
    public Collection<FoodDTO> getAllFoods() {
        return foodMapRepository.getAllFoods();
    }

    @Override
    public Optional<FoodDTO> getFoodById(Long id) {
        return foodMapRepository.getFoodById(id);
    }

    @Override
    public FoodDTO addFood(Long id, FoodDTO food) {
        return foodMapRepository.addFood(id, food);
    }

    @Override
    public FoodDTO updateFood(Long id, FoodDTO food) {
        return foodMapRepository.updateFood(id, food);
    }

    @Override
    public void deleteFood(Long id) {
        foodMapRepository.deleteFood(id);
    }
}
