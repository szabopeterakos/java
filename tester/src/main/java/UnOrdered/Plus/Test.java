package UnOrdered.Plus;

import java.util.*;

public class Test {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String aa = a.toUpperCase();
        String bb = b.toUpperCase();
        char[] charr = aa.toCharArray();

        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < charr.length; i++) {
            list.add(charr[i]);
        }

        System.out.println(list);

        for (int j = 0; j < bb.length(); j++) {
            if (list.contains(bb.charAt(j))) {
                Character current = bb.charAt(j);
                list.remove(current);
                System.out.println(list);
            }
        }

        // Complete the function
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Tomika", "Akitom"));
        char irr = 77;
        System.out.println(irr);


        int i = 0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
    }

}

