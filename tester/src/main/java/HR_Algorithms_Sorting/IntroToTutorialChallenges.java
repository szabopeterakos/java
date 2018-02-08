package HR_Algorithms_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class IntroToTutorialChallenges {

    static int introTutorial(int V, int[] arr) {

        int[] arr2 = arr;

        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                int temp = arr2[i];
                arr2[i] = arr2[i + 1];
                arr2[i + 1] = temp;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] == V) {
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("40\n5\n1 3 1 40 22");
        int V = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = introTutorial(V, arr);
        System.out.println(result);
        in.close();
    }

}
