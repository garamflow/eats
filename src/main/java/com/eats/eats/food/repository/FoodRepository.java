package com.eats.eats.food.repository;

import com.eats.eats.food.dto.FoodDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

public interface FoodRepository extends JpaRepository<FoodDTO, Long> {
    Collection<FoodDTO> getAllFoods();
    Optional<FoodDTO> getFoodById(Long id);
    FoodDTO addFood(Long id, FoodDTO food);
    FoodDTO updateFood(Long id, FoodDTO food);
    void deleteFood(Long id);
}
