package com.solveet.ganesh.foodiesfeast;

/**
 * Created by Ganesh on 24-02-2017.
 */

public class Dish {
    String DishName ;
    double price ;
    String description ;
    double averageRating ;

    public Dish(String dishName, double price, String description, double averageRating) {
        DishName = dishName;
        this.price = price;
        this.description = description;
        this.averageRating = averageRating;
    }

    public String getDishName() {
        return DishName;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
