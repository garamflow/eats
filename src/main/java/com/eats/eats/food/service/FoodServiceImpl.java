package com.eats.eats.food.service;

import com.eats.eats.food.Food;
import com.eats.eats.food.repository.FoodMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private final FoodMapRepository foodMapRepository;

    public FoodServiceImpl(FoodMapRepository foodMapRepository) {
        this.foodMapRepository = foodMapRepository;
    }

    @Override
    public Collection<Food> getAllFoods() {
        return foodMapRepository.getAllFoods();
    }

    @Override
    public Optional<Food> getFoodById(Long id) {
        return foodMapRepository.getFoodById(id);
    }

    @Override
    public Food addFood(Long id, Food food) {
        return foodMapRepository.addFood(id, food);
    }

    @Override
    public Food updateFood(Long id, Food food) {
        return foodMapRepository.updateFood(id, food);
    }

    @Override
    public void deleteFood(Long id) {
        foodMapRepository.deleteFood(id);
    }
}
