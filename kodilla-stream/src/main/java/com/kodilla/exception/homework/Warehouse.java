package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(String order) {
        orders.add(new Order(order));
        return orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrder(String number) throws Exception {
        Predicate<Order> orderPredicate = o -> o.getNumber().equals(number);
        return orders.stream()
                .filter(orderPredicate).findFirst().orElseThrow(OrderDoesntExistException::new);
    }
}
