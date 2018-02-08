package HackerRank_Algorithms_Warmup;

import java.util.Scanner;

public class ComparetheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {

        int ca = (a0>b0?1:0 + a1>b1?1:0 + a2>b2?1:0);
        int cb = (a0<b0?1:0 + a1<b1?1:0 + a2<b2?1:0);

        int[] r = {ca,cb};
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("5 6 7\n" +
                "3 6 10");
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }

}
