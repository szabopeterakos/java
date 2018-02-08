package HackerRank_Algorithms_Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class AppleandOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner("7 11\n" +
                "5 15\n" +
                "3 2\n" +
                "-2 2 1\n" +
                "5 -6");
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }

        System.out.println("house beetween " + s + " " + t);
        System.out.println("apple tree in : " + a);
        System.out.println("orange tree in : " + b);
        System.out.println("apples: " + m + " oranges: " + n);
        System.out.println("apples distances: " + Arrays.toString(apple));
        System.out.println("oranges distances: " + Arrays.toString(orange));

        int countApple = 0;
        int countOrange = 0;
        for (int c : apple) {
            if(a+c >= s && a+c <= t ){
                countApple++;
            }
        }
        for (int c : orange) {
            if(b+c >= s && b+c <= t ){
                countOrange++;
            }
        }

        System.out.println("apples in the house"+countApple);
        System.out.println("apples in the house"+countOrange);


    }

}
