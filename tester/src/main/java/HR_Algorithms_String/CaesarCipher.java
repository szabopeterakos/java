package HR_Algorithms_String;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner("10\n" +
                "www.abc.xy\n" +
                "87"); //bmgb
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();

        if (k > 26) {
            k = k % 26;
        }

        String temp = "";

        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90) { // uppercase
                if (c + k > 90) {
                    temp += (char) ((c + k) - 90 + 65 + 1);
                } else {
                    temp += (char) (c + k);
                }

            } else if (c >= 97 && c <= 122) {
                if (c + k > 122) {
                    temp += (char) ((c + k) - 122 + 97 + 1);
                } else {
                    temp += (char) (c + k);
                }
            } else {
                temp += c;
            }

        }

        System.out.println(temp);
    }
}
