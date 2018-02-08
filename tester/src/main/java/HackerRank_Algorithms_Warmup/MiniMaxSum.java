package HackerRank_Algorithms_Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner("1 2 3 4 5");
        long sum = 0L;
        long[] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
            sum+=arr[i];
        }

        System.out.println(Arrays.toString(arr));

        long min = Long.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            long current_sum = sum - arr[j];
            if(current_sum < min){
                min = current_sum;
            }
        }

        long max = Long.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            long current_sum = sum - arr[j];
            if(current_sum > max){
                max = current_sum;
            }
        }

        System.out.println(min+" "+max);
    }

}
