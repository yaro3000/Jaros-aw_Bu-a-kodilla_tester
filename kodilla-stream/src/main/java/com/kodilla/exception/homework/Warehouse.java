package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Warehouse {

    List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(String order) {
        orders.add(new Order(order));
        return orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> getOrder(String number) throws Exception {
        Predicate<Order> orderPredicate = o -> o.getNumber().equals(number);
        Order orderList = orders.stream()
                .filter(orderPredicate).findFirst().orElseThrow(() -> new OrderDoesntExistException());
        System.out.println(orderList);
        return orders;
    }
}
