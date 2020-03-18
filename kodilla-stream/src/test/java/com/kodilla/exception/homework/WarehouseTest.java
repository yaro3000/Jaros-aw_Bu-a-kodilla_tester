package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class WarehouseTest {

    @Test (expected = OrderDoesntExistException.class)
    public void testIsWarehouseThrowCorrect() throws Exception {
        // given
        Warehouse warehouse = new Warehouse();
        List<Order> orders = warehouse.addOrder("Pizza");
        // when
        Order isOrderInList = (Order) warehouse.getOrder("Oil");
        // then
        assertEquals(orders, isOrderInList.getNumber());
    }
}