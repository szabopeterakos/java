package HR_Algorithms_String;

import java.util.Scanner;

public class SeparateTheNumbers {

    static void separateNumbers(String s) {

        String firstElement = "";
        boolean valid = false;

        for (int i = 1; i < (s.length() / 2)+1; i++) {
            Long a = Long.parseLong(s.substring(0, i));
            String cString = a.toString();

            while (cString.length() < s.length()) {
                cString += ++a;
            }

            if (cString.equals(s)) {
                valid = true;
                firstElement = s.substring(0, i);
                break;
            }
        }

        System.out.println(valid ? "YES " + firstElement : "NO");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(
                "1\n" +
                        "10001001");
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }

}
