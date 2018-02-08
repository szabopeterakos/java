package HR_Algorithms_String;

import java.util.Scanner;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner("SOSSOT");
        String s = in.next();

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 0) {
                //System.out.println("1");
                if (s.charAt(i) != 'S') {
                    c++;
                }
            } else if (i % 3 == 1) {
                //System.out.println("2");
                if (s.charAt(i) != 'O') {
                    c++;
                }

            } else if (i % 3 == 2) {
                //System.out.println("3");
                if (s.charAt(i) != 'S') {
                    c++;
                }

            } else {
                System.out.println("ERROR");
            }
        }

        System.out.println(c);

    }

}
