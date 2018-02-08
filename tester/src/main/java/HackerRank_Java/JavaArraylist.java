package HackerRank_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner("5\n" +
                "5 41 77 74 22 44\n" +
                "1 12\n" +
                "4 37 34 36 52\n" +
                "0\n" +
                "3 20 22 33\n" +
                "5\n" +
                "1 3\n" +
                "3 4\n" +
                "3 1\n" +
                "4 3\n" +
                "5 5");
        int n = in.nextInt(); // lines
        int d;
        ArrayList[] arr = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            d = in.nextInt();
            arr[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                arr[i].add(in.nextInt());
            }
        }

        System.out.println(Arrays.toString(arr));

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            try {
                System.out.println(arr[x - 1].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }

}
