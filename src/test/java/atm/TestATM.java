package atm;

import org.junit.Test;

public class TestATM {
    @Test
    public void testValidAmount() {
        new ATM().process(235);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAmount() {
        new ATM().process(27);
    }
}