package com.eats.eats.food.dto;

import com.eats.eats.food.Food;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;
@Builder
@Getter
public class FoodDTO {
    private Long id;
    private String name;
    private int price;
    private String description;
    private Date createdDate;
    private Date updatedDate;

    public Food toEntity() {
        return Food.builder()
                .id(id)
                .name(name)
                .price(price)
                .description(description)
                .build();
    }

    public FoodDTO toDTO(Food food) {
        return FoodDTO.builder()
                .id(getId())
                .name(food.getName())
                .price(food.getPrice())
                .description(food.getDescription())
                .createdDate(food.getCreatedDate())
                .updatedDate(food.getUpdatedDate())
                .build();
    }
}
