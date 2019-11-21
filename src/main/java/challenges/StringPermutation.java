/*
This class checks if 2 strings are permutations of one another.
 */

package challenges;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

    public boolean isPermutation(String string1, String string2) {
        if (string1 == null || string2 == null) {
            throw new IllegalArgumentException("Null arguments are not allowed!");
        }
        if (string1.length() != string2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        addAllCharactersToMap(string1, map);
        return containsSameCharacters(string2, map);
    }

    private void addAllCharactersToMap(String input, Map<Character, Integer> map) {
        for (int i = 0; i < input.length(); i++) {
            Integer numberOfCharacters = map.get(input.charAt(i));
            if (numberOfCharacters == null) {
                numberOfCharacters = 0;
            }
            map.put(input.charAt(i), numberOfCharacters + 1);
        }
    }

    private boolean containsSameCharacters(String input, Map<Character, Integer> map) {
        /*
        I considered using a HashSet instead of a Hashmap. If I had done that, I could
        have created a new HashSet for string2 inside of this method and then checked to
        see if the two HashSets were equal. That would have been more expressive. However,
        I went with this approach because it uses constant extra space inside this method.
        */
        for (int i = 0; i < input.length(); i++) {
            Integer numberOfCharacters = map.get(input.charAt(i));
            if (numberOfCharacters == null) {
                return false;
            }
            if (numberOfCharacters == 1) {
                map.remove(input.charAt(i));
            } else {
                map.put(input.charAt(i), numberOfCharacters - 1);
            }
        }
        return map.size() == 0;
    }
}