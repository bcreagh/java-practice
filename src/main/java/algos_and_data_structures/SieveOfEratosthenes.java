package algos_and_data_structures;

import java.util.ArrayList;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = s.nextInt();
        ArrayList<Integer> primes = generateAllPrimesUpTo(max);
        System.out.println(primes);
    }

    public static ArrayList<Integer> generateAllPrimesUpTo(int max) {
        boolean[] isPrime = new boolean[max + 1];
        ArrayList<Integer> primes;
        int squareRootOfMax = (int) Math.sqrt(max);

        setIndicesGreaterThanOneToTrue(isPrime);

        for (int i = 2; i <= squareRootOfMax; i++) {
            crossOutAllMultiples(i, isPrime);
        }

        primes = getArrayListOfAllElementMarkedAsPrime(isPrime);

        return primes;

    }

    private static void setIndicesGreaterThanOneToTrue(boolean[] booleans) {
        for(int i = 2; i < booleans.length; i++) {
            booleans[i] = true;
        }
    }

    private static void crossOutAllMultiples(int divisor, boolean[] isPrime) {
        int endOfLoop = (isPrime.length - 1) / divisor;

        for (int i = divisor; i <= endOfLoop; i++) {
            isPrime[divisor * i] = false;
        }
    }

    private static ArrayList<Integer> getArrayListOfAllElementMarkedAsPrime(boolean[] isPrime) {
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 2; i < isPrime.length; i++) {
            if(isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
