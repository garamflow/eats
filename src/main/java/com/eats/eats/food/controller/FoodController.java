package com.eats.eats.food.controller;

import com.eats.eats.food.Food;
import com.eats.eats.food.service.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class FoodController {
    @Autowired
    private final FoodServiceImpl foodServiceImpl;

    public FoodController(FoodServiceImpl foodServiceImpl) {
        this.foodServiceImpl = foodServiceImpl;
    }

    // 상품 전체 조회
    @GetMapping("/foods")
    public Collection<Food> getAllFoods() {
        return foodServiceImpl.getAllFoods();
    }

    // 상품 하나 상세 조회
    @GetMapping("/foods/{id}")
    public Optional<Food> getFoodById(@PathVariable Long id) {
        return foodServiceImpl.getFoodById(id);
    }

    // 상품 등록
    @PostMapping("/foods/{id}")
    public Food addFood(@PathVariable Long id,@PathVariable Food food) {
        return foodServiceImpl.addFood(id, food);
    }

    // 상품 수정
    @PutMapping("/foods/{id}")
    public Food updateFood(@PathVariable Long id, @PathVariable Food food) {
        return foodServiceImpl.updateFood(id, food);
    }

    // 상품 삭제
    @DeleteMapping("/foods/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodServiceImpl.deleteFood(id);
    }
}
