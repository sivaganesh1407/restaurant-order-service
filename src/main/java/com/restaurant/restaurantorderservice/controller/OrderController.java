package com.restaurant.restaurantorderservice.controller;

import com.restaurant.restaurantorderservice.entity.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    // Temporary in-memory list (mock data)
    private final List<Order> orders = new ArrayList<>(List.of(
            new Order(101, "Pizza", 12.50),
            new Order(102, "Burger", 8.00),
            new Order(103, "Pasta", 10.25)
    ));

    // ✅ 1) Get all orders
    @GetMapping
    public List<Order> getAllOrders() {
        return orders;
    }

    // ✅ 2) Get order by id
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orders.stream()
                .filter(o -> o.getOrderId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Order not found: " + id));
    }

    // ✅ 3) Create a new order
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody Order newOrder) {
        orders.add(newOrder);
        return newOrder;
    }
}