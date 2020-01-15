package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticWithOnlyAddTest {

    ArithmeticWithOnlyAdd arithmeticWithOnlyAdd;

    @Before
    public void setup() {
        arithmeticWithOnlyAdd = new ArithmeticWithOnlyAdd();
    }

    @Test
    public void multiplyTest() {
        assertEquals(32, arithmeticWithOnlyAdd.multiply(4, 8));
        assertEquals(-35, arithmeticWithOnlyAdd.multiply(-1, 35));
        assertEquals(-60, arithmeticWithOnlyAdd.multiply(-5, 12));
        assertEquals(25305, arithmeticWithOnlyAdd.multiply(35, 723));
        assertEquals(54, arithmeticWithOnlyAdd.multiply(-6, -9));
        assertEquals(-989, arithmeticWithOnlyAdd.multiply(43, -23));
    }

    @Test
    public void subtractTest() {
        assertEquals(-4, arithmeticWithOnlyAdd.subtract(4, 8));
        assertEquals(-36, arithmeticWithOnlyAdd.subtract(-1, 35));
        assertEquals(-17, arithmeticWithOnlyAdd.subtract(-5, 12));
        assertEquals(-688, arithmeticWithOnlyAdd.subtract(35, 723));
        assertEquals(3, arithmeticWithOnlyAdd.subtract(-6, -9));
        assertEquals(66, arithmeticWithOnlyAdd.subtract(43, -23));
    }

    @Test
    public void divideTest() {
        assertEquals(0, arithmeticWithOnlyAdd.divide(4, 8));
        assertEquals(0, arithmeticWithOnlyAdd.divide(-1, 35));
        assertEquals(7, arithmeticWithOnlyAdd.divide(36, 5));
        assertEquals(6, arithmeticWithOnlyAdd.divide(36, 6));
        assertEquals(-3, arithmeticWithOnlyAdd.divide(-37, 12));
        assertEquals(30, arithmeticWithOnlyAdd.divide(723, 24));
        assertEquals(0, arithmeticWithOnlyAdd.divide(-6, -9));
        assertEquals(75, arithmeticWithOnlyAdd.divide(-676, -9));
        assertEquals(-1, arithmeticWithOnlyAdd.divide(43, -23));
    }
}
