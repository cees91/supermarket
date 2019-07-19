package App.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class KwarkTest {

    @Test
    public void calculateDiscount() {
        Kwark kwark = new Kwark("Kwark", 2);
        double cost = kwark.calculateDiscount(4);
        assertEquals(8, cost, 2);
    }
}