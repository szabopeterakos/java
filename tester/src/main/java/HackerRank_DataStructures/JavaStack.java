package HackerRank_DataStructures;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(
                "[]");

        while (sc.hasNext()) {
            String input = sc.next();

            System.out.println(validator(input));

        }

    }

    public static boolean validator(String s) {

        if (s.charAt(0) == '{' || s.charAt(0) == '[' || s.charAt(0) == '(') {
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{') {
                    c1++;
                } else if (s.charAt(i) == '}') {
                    c1--;
                } else if (s.charAt(i) == '[') {
                    c2++;
                } else if (s.charAt(i) == ']') {
                    c2--;
                } else if (s.charAt(i) == '(') {
                    c3++;
                } else if (s.charAt(i) == ')') {
                    c3--;
                }
            }
            if (c1 == 0 && c2 == 0 && c3 == 0) {
                return true;
            }

        }
        return false;
    }

}
