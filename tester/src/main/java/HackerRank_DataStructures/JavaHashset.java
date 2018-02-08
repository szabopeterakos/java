package HackerRank_DataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner("5\n" +
                "john tom\n" +
                "john mary\n" +
                "john tom\n" +
                "mary anna\n" +
                "mary anna");
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set set = new HashSet();

        for (int ii = 0; ii < t; ii++) {
            set.add(pair_left[ii] + pair_right[ii]);
            System.out.println(set.size());
        }
    }
}
