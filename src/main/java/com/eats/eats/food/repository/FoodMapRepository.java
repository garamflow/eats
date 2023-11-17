package com.eats.eats.food.repository;

import com.eats.eats.food.dto.FoodDTO;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FoodMapRepository {
    private final Map<Long, FoodDTO> db;

    public FoodMapRepository() {
        this.db = new HashMap<>();
    }

    // 상품 전체 조회
    public Collection<FoodDTO> getAllFoods() {
        return db.values();
    }

    // 상품 하나 조회
    public Optional<FoodDTO> getFoodById(Long id) {
        return Optional.ofNullable(db.get(id));
    }

    // 상품 등록
    public FoodDTO addFood(Long id, FoodDTO food) {
        return db.put(id, food);
    }

    // 상품 수정
    public FoodDTO updateFood(Long id, FoodDTO food) {
        if(db.containsKey(id)) {
            db.put(id, food);
            return food;
        }
        return null;
    }

    // 상품 삭제
    public void deleteFood(Long id) {
        db.remove(id);
    }
}
