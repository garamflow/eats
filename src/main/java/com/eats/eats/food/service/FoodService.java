package com.eats.eats.food.service;

import com.eats.eats.food.dto.FoodDTO;

import java.util.Collection;
import java.util.Optional;

public interface FoodService {
    Collection<FoodDTO> getAllFoods();
    Optional<FoodDTO> getFoodById(Long id);
    FoodDTO addFood(Long id, FoodDTO food);
    FoodDTO updateFood(Long id, FoodDTO food);
    void deleteFood(Long id);
}