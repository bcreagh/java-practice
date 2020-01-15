/*
Challenge: Implement subtract, multiply and divide operations without using
the -, * or / operators
 */

package challenges;

public class ArithmeticWithOnlyAdd {

    public int multiply(int x, int y) {
        boolean negateNeeded = signsAreDifferent(x, y);

        int positiveX = Math.abs(x);
        int positiveY = Math.abs(y);

        int biggerNum = Math.max(positiveX,positiveY);
        int smallerNum = Math.min(positiveX,positiveY);

        int answer = 0;

        for (int i = 0; i < smallerNum; i++) {
            answer += biggerNum;
        }

        if (negateNeeded) {
            answer = negate(answer);
        }
        return answer;
    }

    public int subtract(int x, int y) {
        return x + negate(y);
    }

    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Tried to divide by zero");
        }
        boolean negateNeeded = signsAreDifferent(x, y);

        int positiveX = Math.abs(x);
        int positiveY = Math.abs(y);

        int answer = 0;

        for (int i = positiveY; i <= positiveX; i += positiveY) {
            answer++;
        }

        if (negateNeeded) {
            answer = negate(answer);
        }
        return answer;
    }

    private int negate(int num) {
        return (~num) + 1;
    }

    private boolean signsAreDifferent(int x, int y) {
        return (x > 0 && y < 0) || (x < 0 && y > 0);
    }
}
