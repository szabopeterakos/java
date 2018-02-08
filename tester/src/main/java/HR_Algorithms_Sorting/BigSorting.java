package HR_Algorithms_Sorting;

import java.math.BigDecimal;
import java.util.*;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner("6\n" +
                "31415926535897932384626433832795\n" +
                "1\n" +
                "3\n" +
                "10\n" +
                "3\n" +
                "5");
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted[unsorted_i] = in.next();
        }

        //first version NUMBER
        List<BigDecimal> set = new ArrayList<>();
        for (int i = 0; i < unsorted.length; i++) {
            set.add(new BigDecimal(unsorted[i]));
        }

        Collections.sort(set, (BigDecimal o1, BigDecimal o2) -> o1.compareTo(o2));
        for (BigDecimal c : set) {
            System.out.println(c);
        }

        //second version STRING
        Arrays.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                else if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) > o2.charAt(i))
                            return 1;
                        if (o1.charAt(i) < o2.charAt(i))
                            return -1;
                    }
                }
                return 0;
            }
        });
        for (String c : unsorted) {
            System.out.println(c);
        }

    }

}
