package HackerRank_Algorithms_Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scan = new Scanner("3\n" +
                "11 2 4\n" +
                "4 5 6\n" +
                "10 8 -12");
        int n = Integer.parseInt(scan.nextLine());
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] str = scan.nextLine().split(" ");
            arr[i] = new int[n];
            for (int x = 0; x < str.length; x++) {
                arr[i][x] = Integer.parseInt(str[x]);
            }

        }

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-1-i];
        }
        System.out.println(Math.abs(sum1-sum2));
    }

}
