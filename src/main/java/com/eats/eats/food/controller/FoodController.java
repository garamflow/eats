package com.eats.eats.food.controller;

import com.eats.eats.food.Food;
import com.eats.eats.food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    private final FoodService foodService;

    // 상품 전체 조회
    @GetMapping("/foods")
    public List<Food> foods() {
        return foodService.getAllFoods();
    }

    // 상품 하나 상세 조회
    @GetMapping("/foods/{id}")
    public Food getFood(@PathVariable Long id) {
        return foodService.getFood(id);
    }

    // 상품 등록
    @PostMapping("/foods/{id}")
    public Food addFood(@PathVariable Long id, @PathVariable Food food) {
        return foodService.addFood(id, food);
    }

    // 상품 수정
    @PutMapping("/foods/{id}")
    public Food updateFood(@PathVariable Long id, @PathVariable Food food) {
        return foodService.updateFood(id, food);
    }

    // 상품 삭제
    @DeleteMapping("/foods/{id}")
    public Food deleteFood(@PathVariable Long id) {
        return foodService.deleteFood(id);
    }
}
