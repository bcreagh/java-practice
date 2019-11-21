package challenges;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringPermutationTest {

    @Test
    public void isPermutation_test() {
        StringPermutation stringPermutation = new StringPermutation();
        assertTrue(stringPermutation.isPermutation("abcdef", "defacb"));
        assertTrue(stringPermutation.isPermutation("abcdeef", "defacbe"));
        assertTrue(stringPermutation.isPermutation("a", "a"));
        assertTrue(stringPermutation.isPermutation("", ""));

        assertFalse(stringPermutation.isPermutation("abdcdef", "defacb"));
        assertFalse(stringPermutation.isPermutation("d", "e"));
        assertFalse(stringPermutation.isPermutation("", "e"));
        assertFalse(stringPermutation.isPermutation("wao;fihoehwfa", "sdfs"));
    }
}
