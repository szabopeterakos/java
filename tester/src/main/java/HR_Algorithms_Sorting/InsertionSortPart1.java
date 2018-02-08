package HR_Algorithms_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortPart1 {

    static void insertionSort1(int n, int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i;

            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }

            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("4\n" +
                "4 2 3 -1");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }

}
