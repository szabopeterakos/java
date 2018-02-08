package FUN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pega01 {

    public static void main(String[] args) {


        int[] a = {1};

        if (a == null) {
            System.out.println("-1");

        }
        int max = a[0];
        int min = a[0];
        int count = 0;
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                count = i;
            }

        }

        System.out.println("MAX:" + max + " COUNT:" + count);

        for (int j = 0; j < count; j++) {
            if (a[j] < min) {
                min = a[j];
            }

            if (j > 0) {
                if (a[j - 1] < a[j]) {
                    d++;
                }
            }

        }

        if (max == Integer.MIN_VALUE || min == Integer.MAX_VALUE || max == a[0]) {
            System.out.println("-1");
        } else {

            System.out.println(max - min);
        }
    }

}
