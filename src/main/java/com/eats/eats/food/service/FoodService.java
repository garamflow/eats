package com.eats.eats.food.service;

import com.eats.eats.food.Food;

import java.util.Collection;
import java.util.Optional;

public interface FoodService {
    Collection<Food> getAllFoods();
    Optional<Food> getFoodById(Long id);
    Food addFood(Long id, Food food);
    Food updateFood(Long id, Food food);
    void deleteFood(Long id);
}