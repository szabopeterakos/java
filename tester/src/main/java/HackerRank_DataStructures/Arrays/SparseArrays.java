package HackerRank_DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner("4\n" +
                "aba\n" +
                "baba\n" +
                "aba\n" +
                "xzxb\n" +
                "3\n" +
                "aba\n" +
                "xzxb\n" +
                "ab");
        String[] a1 = new String[sc.nextInt()];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.next();
        }

        String[] a2 = new String[sc.nextInt()];

        for (int j = 0; j < a2.length; j++) {
            a2[j] = sc.next();
            int c = 0;

            for (int x = 0; x < a1.length; x++) {
                if (a2[j].equals(a1[x])) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
