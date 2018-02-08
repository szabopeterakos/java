package HR_Algorithms_String;

import java.util.Scanner;

public class FunnyString {


    static String funnyString(String s) {
        for (int i = 1; i < s.length(); i++) {

            int a1 = s.charAt(i) - s.charAt(i - 1);
            int a2 = s.charAt(s.length() - 1 - i) - s.charAt(s.length() - i);

            if (Math.abs(a1) != Math.abs(a2)) {
                return "Not Funny";
            }


//            System.out.print(s.charAt(s.length() - 1 - i));
//            System.out.print(" " + s.charAt(i) + "\n");
        }
        return "Funny";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner("1\nivvkx");
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }

    }

}
