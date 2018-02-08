package HackerRank_DataStructures.Arrays;

import java.util.Scanner;

public class LeftRotation {

    static int[] leftRotation(int[] a, int d) {
        int s = (d % a.length);
        System.out.println(s);
        int[] arr1 = new int[a.length];
        for (int j = 0; j < a.length; j++) {
            if (a.length > j + s) {
                arr1[j] = a[j + s];
            } else {
                arr1[j] = a[(j + s) - a.length];
            }
        }

        return arr1;
    }

    // result : 5 1 2 3 4
    public static void main(String[] args) {
        Scanner in = new Scanner("6 41\n" +
                "1 2 3 4 5 6");
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
