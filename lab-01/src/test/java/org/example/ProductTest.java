package org.example;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",250, LocalDate.parse("2024-11-02"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",230, LocalDate.parse("2024-11-08"));
        Product p3 = new FoodProduct (2106, 4.50, "Linguine Pasta", 180, LocalDate.parse("2024-11-11"));
        assertEquals(p3.getTotalQuantity(), 3);
    }
}
