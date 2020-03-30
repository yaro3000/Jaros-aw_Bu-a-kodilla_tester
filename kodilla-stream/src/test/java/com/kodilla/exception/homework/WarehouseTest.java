package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class WarehouseTest {

    Warehouse warehouse = new Warehouse();

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("dupa");
        System.out.println(warehouse.getOrders());
    }

    @Test
    public void getOrderTest() throws Exception {
        System.out.println("Test for method getOrder(). \n"
                + "given - order numbers 1234, 432, 9876, 567890\n"
                + "when - ask for order that exists\n"
                + "then - return order number\n");
        warehouse.addOrder("1234");
        warehouse.addOrder("432");
        warehouse.addOrder("9876");
        warehouse.addOrder("567890");
        Order order = warehouse.getOrder("12ee34");
        assertTrue(order instanceof Order);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void getOrderTest_withException() throws Exception {
        System.out.println("Test for exception in method getOrder(). \n"
                + "given - order numbers 1234, 432, 9876, 567890\n"
                + "when - ask for order that doesn't exists\n"
                + "then - throw OrderDoesntExistsException\n");
        warehouse.addOrder("1234");
        warehouse.addOrder("432");
        warehouse.addOrder("9876");
        warehouse.addOrder("567890");
        Order order = warehouse.getOrder("dasdasd");
        System.out.println("dupa blada");
        assertNull(order);
    }
}