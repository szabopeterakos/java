package HR_Algorithms_String;

import java.util.HashSet;
import java.util.Scanner;

public class WeightedUniformStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner("abccddde\n" +
                "6\n" +
                "12\n" +
                "3\n" +
                "1\n" +
                "5\n" +
                "9\n" +
                "10");
        String s = in.next();
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            System.out.println(hasIt(s, x) ? "Yes" : "No");
        }
    }

    public static boolean hasIt(String s, int n) {
        if (s.contains(Character.valueOf((char) (n + 96)).toString())) {
            return true;
        } else {

            int c = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    c++;
                }
            }
            if (c > 1 && n % c == 0) {
                if (s.contains(Character.valueOf((char) ((n / c) + 96)).toString())) {
                    c = 0;
                    return true;
                }
            }

            return false;
        }
    }

    public static void printArray(Object[] o) {
        for (Object obj : o) {
            System.out.println(obj);
        }
    }
}

class S {
    public static void main(String[] args) {
        Scanner in = new Scanner("abccddde\n" +
                "6\n" +
                "12\n" +
                "3\n" +
                "1\n" +
                "5\n" +
                "9\n" +
                "10");
        String s = in.next();
        int l = s.length();
        int n = in.nextInt();
        HashSet<Integer> al = new HashSet<>();

        int count = 1;
        int pos = s.charAt(0) - 96;
        al.add(pos * count);
        for (int i = 1; i < l; i++) {
            pos = s.charAt(i - 1) - 96;
            al.add(pos * count);
            if (s.charAt(i) != s.charAt(i - 1)) {
                count = 1;
                pos = s.charAt(i) - 96;
                al.add(pos * count);
            } else {
                count++;
                pos = s.charAt(i) - 96;
                al.add(pos * count);

            }
        }
        //System.out.println(al);
        for (int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            if (al.contains(x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
