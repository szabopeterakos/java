package HackerRank_DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
//        another();

        String str = "5 3\n" +
                "1 2 100\n" +
                "2 5 100\n" +
                "3 4 100";

        Scanner in = new Scanner(str);

        int n = in.nextInt();
        int m = in.nextInt();

        long[] arrStart = new long[n];
        long max = Long.MIN_VALUE;

        while (m-- > 0) {

            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            int k = in.nextInt();
            arrStart[a] += k;
            if (b >= a && b < n) {
                while (b > a) {
                    arrStart[b] += k;
                    --b;
                }
            }
            System.out.println(Arrays.toString(arrStart));
        }

        for (long l : arrStart) {
            if (l > max) max = l;
        }
        in.close();

        System.out.println(max);

    }

    public static void another() {
        String str = "5 3\n" +
                "1 2 100\n" +
                "2 5 100\n" +
                "3 4 100";

        Scanner in = new Scanner(str);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        int a;
        int b;
        int k;
        while (M-- > 0) {
            a = in.nextInt() - 1;
            b = in.nextInt();
            k = in.nextInt();

            arr[a] += k;
            if (b < N) arr[b] -= k;
        }
        in.close();

        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int value : arr) {
            sum += value;
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}

