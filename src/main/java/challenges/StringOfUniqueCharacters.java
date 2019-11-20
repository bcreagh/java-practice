package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOfUniqueCharacters {

    public static boolean charactersAreUnique(String input) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) != null) {
                return false;
            }
            map.put(input.charAt(i), true);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String input = stdin.next();
        if (charactersAreUnique(input)) {
            System.out.println("All characters in the input are unique!");
        } else {
            System.out.println("Not all characters in the input are unique");
        }
    }

}
