package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    double price;
    LocalDate date;
    String name;

    public Order(double price, LocalDate date, String name) {
        this.price = price;
        this.date = date;
        this.name = name;
    }

    public Order() {

    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 &&
                Objects.equals(date, order.date) &&
                Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, date, name);
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
