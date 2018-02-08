package HackerRank_Algorithms_Warmup;

import java.util.*;

public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        int sum = 0;
        for(int c: ar){
            sum+= c;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner("6\n" +
                "1 2 3 4 10 11");
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
