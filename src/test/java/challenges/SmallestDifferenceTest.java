package challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestDifferenceTest {

    @Test
    public void test() {

        SmallestDifference sd = new SmallestDifference();

        int[] array1 = new int[] {1, 3, 15, 11, 2};
        int[] array2 = new int[] {23, 127, 235, 19, 8};

        assertEquals(3, sd.smallestDifference(array1, array2));

    }

}
