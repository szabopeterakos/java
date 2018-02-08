package HackerRank_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i = 0;

        try {
            while (i <= game.length && game[i] == 0) {
                game[i] = 1;

                if (game[i + 1] == 0) {
                    i = i + 1;
                    continue;
                } else if (game[i + leap] == 0) {
                    i = i + leap;
                    continue;
                } else if (i - 1 >= 0 && game[i - 1] == 0) {
                    i = i - 1;
                    continue;
                } else {
                    return false;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return true;
        }

        if (i >= game.length) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input04.txt"));
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();

    }

}
