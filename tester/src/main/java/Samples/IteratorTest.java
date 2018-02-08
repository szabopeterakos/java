package Samples;

import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 5, 5, 4, 3));

        Iterator<Integer> currentIterator = list.iterator();
        while (currentIterator.hasNext()) {
            int value = currentIterator.next();
            System.out.println(value);
        }



    }


}
