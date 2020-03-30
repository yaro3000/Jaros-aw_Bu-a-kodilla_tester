package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    Order order = new Order();
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

//    public List<Order> getDateList(LocalDate min, LocalDate max) {
//        if()
//            return orderList;
//    }

    public List<Order> getOrderList(int max, int min) {
        return orderList;
    }

    public int getSumOrders() {
        return orderList.size();
    }

//    public int orderPriceSum() {
//        int sum = 0;
//        int i = 0;
//        for(i <= orderList.size(), i++) {
//            Order price = orderList.get(i);
//            sum += price.getPrice();
//        }
//        return sum;
//    }
}
