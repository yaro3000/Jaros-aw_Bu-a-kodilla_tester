package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 5.20);
    Item bread = new Item("Bread", 3.80);
    Item butter = new Item("Butter", 6.50);

    @Test
    public void shouldAddNewItemsAndListLengthIsCorrect() {

        int numberOfItems = invoice.getSize();

        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {

        Item result = invoice.getItem(2);

        assertEquals("Butter", result.getName());
        assertEquals(6.50, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {

        Item result = invoice.getItem(-3);

        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeItem() {

        Item result = invoice.getItem(5);

        assertNull(result);
    }

    @Test
    public void shouldCorrectClearInvoice() {

        invoice.clear();

        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(bread);
        invoice.addItem(butter);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
