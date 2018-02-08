package HackerRank_Java;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {


    public static void main(String[] args) {
        //Input
        String input = "9\n" +
                "-100\n" +
                "50\n" +
                "0\n" +
                "56.6\n" +
                "90\n" +
                "0.12\n" +
                ".12\n" +
                "02.34\n" +
                "000.000";
        Scanner sc = new Scanner(input);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

        Arrays.sort(s, 0, n, (String o1, String o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1)));
        //Arrays.sort(s,0,n);


        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

    }
}
