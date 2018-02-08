package HackerRank_Algorithms_Warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner sc = new Scanner("6");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

}
