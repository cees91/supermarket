package App.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobijnTest {

    @Test
    public void calculateDiscount() {
        Robijn robijn = new Robijn("Robijn", 3);
        double cost = robijn.calculateDiscount(4);
        assertEquals(2.76, cost, 2);
        double costUneven = robijn.calculateDiscount(5);
        assertEquals(5.76, costUneven, 2);
    }
}