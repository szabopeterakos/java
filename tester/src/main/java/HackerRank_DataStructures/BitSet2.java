package HackerRank_DataStructures;

import java.util.BitSet;

public class BitSet2 {

    public static void main(String[] args) {
        BitSet bs = new BitSet(10);
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println(bs.get(i) + " " + i);
            }
        }
    }

}
