package HackerRank_DataStructures;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaBitSet {


    public static void main(String[] args) {
        Scanner sc = new Scanner("5 4\n" +
                "AND 1 2\n" +
                "SET 1 4\n" +
                "FLIP 2 2\n" +
                "OR 2 1");

        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet b1 = new BitSet(m);
        BitSet b2 = new BitSet(m);

        for (int j = 0; j < m; j++) {
            String s = sc.next();
            int set1 = sc.nextInt();
            int set2 = sc.nextInt();

            if (s.equals("AND")) {
                if (set1 == 1) b1.and(b2);
                else b2.and(b1);
            } else if (s.equals("OR")) {
                if (set1 == 1) b1.or(b2);
                else b2.or(b1);
            } else if (s.equals("XOR")) {
                if (set1 == 1) b1.xor(b2);
                else b2.xor(b1);
            } else if (s.equals("FLIP")) {
                if (set1 == 1) b1.flip(set2);
                else b2.flip(set2);
            } else if (s.equals("SET")) {
                if (set1 == 1) b1.set(set2);
                else b2.set(set2);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        sc.close();


    }

}
