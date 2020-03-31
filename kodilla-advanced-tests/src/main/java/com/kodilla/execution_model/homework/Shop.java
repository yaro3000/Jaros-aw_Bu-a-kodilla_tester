package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    Order order = new Order();
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    public List<Order> getDateList(LocalDate min, LocalDate max) {
        return orderList.stream().filter(order -> order.getDate().isAfter(min.minusDays(1))
                && order.getDate().isBefore(max.plusDays(1))).collect(Collectors.toList());
    }

    public List<Order> getOrderList(int max, int min) {
        return orderList.stream().filter(order -> order.getPrice() < max && order.getPrice() > min).collect(Collectors.toList());
    }

    public int getSumOrders() {
        return orderList.size();
    }

    public int orderPriceSum() {
        int sum = 0;
        for (int i = 0; i <= orderList.size(); i++) {
            sum += order.getPrice();
        }
        return sum;
    }
}