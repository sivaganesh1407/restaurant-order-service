package com.restaurant.restaurantorderservice.entity;

public class Order {
    private int orderId;
    private String itemName;
    private double price;

    public Order(int orderId, String itemName, double price) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
    }

    public int getOrderId() { return orderId; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
}