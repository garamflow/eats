package com.eats.eats.food;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
    private String description;
    private Date createdDate;
    private Date updatedDate;

    @Builder
    public Food(Long id, String name, int price, String description, Date createdDate, Date updatedDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
