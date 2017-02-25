package com.solveet.ganesh.foodiesfeast;

/**
 * Created by Ganesh on 24-02-2017.
 */

public class CartItem extends Dish {
    public int quantity ;
    public CartItem(String dishName, double price, String description, double averageRating,int quantity) {
        super(dishName, price, description, averageRating);
        this.quantity=quantity ;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
