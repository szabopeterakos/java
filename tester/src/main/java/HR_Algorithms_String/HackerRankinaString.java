package HR_Algorithms_String;

import java.util.Scanner;

public class HackerRankinaString {

    public static boolean validator(String ss) {
        String temple = "hackerrank";

        int n = 0;
        for (int i = 0; i < temple.length(); i++) {
            n = 0;
            for (int j = 0; j < ss.length(); j++) {
                if (n >= 10) {
                    break;
                }
                if (ss.charAt(j) == temple.charAt(n)) {
                    n++;
                    continue;
                }
            }
        }
        if (n == 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("2\n" +
                "hereiamstackerranksufgusdfsdjbfisudfosdnslfpsdbob\n" +
                "hackerworld");
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();

            System.out.println(validator(s) ? "YES" : "NO");

        }
    }

}
