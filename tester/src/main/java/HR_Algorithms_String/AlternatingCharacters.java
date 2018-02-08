package HR_Algorithms_String;

import java.util.Scanner;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int needDelete = 0;
        System.out.println(s);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                needDelete++;
            }
        }

        return needDelete;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("1\nABABAB"); // delete : 3
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }

}
