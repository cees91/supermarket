package App.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiapersTest {

    @Test
    public void calculateDiscount() {
        Diapers diapers = new Diapers("Luiers", 10);
        double cost = diapers.calculateDiscount(4);
        assertEquals(30, cost, 2);
        double noDiscountCost = diapers.calculateDiscount(5);
        assertEquals(40,noDiscountCost, 2);
    }
}