package algos_and_data_structures;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class SieveOfEratosthenesTest {
    @Test
    public void generateAllPrimesUpTo_shouldCorrectlyGeneratePrimes() {
        ArrayList<Integer> expected = new ArrayList<>();
        addAllPrimesFromUpTo50ToList(expected);

        ArrayList<Integer> actual = SieveOfEratosthenes.generateAllPrimesUpTo(50);

        for(int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    private void addAllPrimesFromUpTo50ToList(ArrayList<Integer> arrayList) {
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(17);
        arrayList.add(19);
        arrayList.add(23);
        arrayList.add(29);
        arrayList.add(31);
        arrayList.add(37);
        arrayList.add(41);
        arrayList.add(43);
        arrayList.add(47);
    }
}
