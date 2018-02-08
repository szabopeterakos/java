package UnOrdered.Plus;

import java.util.Collection;
import java.util.Collections;

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }


    public static void main(String[] args) {
        System.out.println("// START //");
        Baap b = new Beta();

        System.out.println("// 1 //");
        System.out.println(b.h + " " + b.getH());
        System.out.println();

        if (args[0].equals("open")) {
            if (args[1].equals("someone")) System.out.println("Hello!");
        } else System.out.println("Go away " + args[1]);


        Object o = null;
        Collection c = Collections.EMPTY_LIST;
        int[][] ia = new int[4][4];

        for (Object o2 : c) {
            System.out.println();
        }
        for (final Object o2 : c) {

        }
        for (int[] i : ia) {

        }
        for (int i : ia[0]) {

        }

    }
}
