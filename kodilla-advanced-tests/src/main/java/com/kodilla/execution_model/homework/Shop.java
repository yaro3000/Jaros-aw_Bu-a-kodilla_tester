package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

//    public List<Order> dateList(LocalDate min, LocalDate max) {
//        if ()
//            return orderList;
//    }
}
