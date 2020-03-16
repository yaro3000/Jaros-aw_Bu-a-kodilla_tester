package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws Exception {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("Pizza");
        warehouse.addOrder("Tomato soup");
        warehouse.addOrder("Strips");
        warehouse.addOrder("Chicken");
        warehouse.addOrder("Fish");

        warehouse.getOrder("Oil");
    }
}
