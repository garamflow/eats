package com.eats.eats.food;

public class Food {
    private String name;
    private int price;
    private String foodDescription;

    public Food(String name, int price, String foodDescription) {
        this.name = name;
        this.price = price;
        this.foodDescription = foodDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
}
