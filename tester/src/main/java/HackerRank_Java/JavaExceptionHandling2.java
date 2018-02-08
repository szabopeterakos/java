package HackerRank_Java;

import java.util.Scanner;

public class JavaExceptionHandling2 {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner("10 0\n" +
            "0 10\n" +
            "-1 4\n" +
            "2 -3\n" +
            "-2 -2\n" +
            "5 6\n" +
            "3 3\n" +
            "8 0\n" +
            "2 3\n" +
            "3 -3");

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

class MyCalculator {
    public long power(int n, int m) throws Exception {
        isValid(n, m);
        long res = 1;
        for (int i = 0; i < m; i++) {
            res *= n;
        }
        return res;
    }

    private void isValid(int x, int y) throws Exception {
        if (x < 0 || y < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (x == 0 && y == 0) {
            throw new Exception("n and p should not be zero.");
        }

    }

}

