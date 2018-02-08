package HackerRank_Algorithms_Warmup;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc = new Scanner("6\n -4 3 -9 0 4 1");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int counterZero = 0;
        int counterPozitive = 0;
        int counterNegative = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            counterZero += (arr[i] == 0 ? 1:0);
            counterPozitive += (arr[i] > 0 ? 1:0);
            counterNegative += (arr[i] < 0 ? 1:0);
        }

        BigDecimal s1 = new BigDecimal(counterZero).divide(new BigDecimal(size),6,BigDecimal.ROUND_HALF_UP);
        BigDecimal s2 = new BigDecimal(counterPozitive).divide(new BigDecimal(size),6,BigDecimal.ROUND_HALF_UP);
        BigDecimal s3 = new BigDecimal(counterNegative).divide(new BigDecimal(size),6,BigDecimal.ROUND_HALF_UP);

        System.out.println(Arrays.toString(arr));
        System.out.println(counterZero+" "+counterPozitive+" "+counterNegative+" "+size);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
