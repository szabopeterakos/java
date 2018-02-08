package _HARD;

import java.util.*;

public class JavaDequeue {

    //Consider the sample 5 3 5 2 3 2 when we are trying to maintain a deque of size 3.
    // while moving from (5,3,5) to (3,5,2) we are removing 5 from the head and adding 2 to the tail.bu
    // if we remove the 5 from the hashset too..we'll be left with only 3 and 2,
    // thereby the size of has set size is 2 which is wrong.Hope my explaination is clear.

    public static void main(String[] args) {
        Scanner in = new Scanner("14 4\n" +
                "1 1 2 3 1 3 1 3 3 5 5 5 4 1");
        int n = in.nextInt(); // arr size
        int m = in.nextInt(); // sub arr size

        int max = 0;
        Deque deque = new ArrayDeque<>();
        HashSet hs = new HashSet();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            hs.add(num);

            System.out.print("Total : " + deque + " ");
            System.out.println("Uniq : " + hs);

            if (deque.size() == m + 1) {

                int q_out = (int) deque.remove();

                if (!deque.contains(q_out)) {
                    hs.remove(q_out);
                }

            }

            max = hs.size() > max ? hs.size() : max;



        }
        System.out.println(max);
    }

}
