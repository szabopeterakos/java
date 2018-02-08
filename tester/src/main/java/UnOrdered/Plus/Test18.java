package UnOrdered.Plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test18 {
//    final boolean k;
//    final static boolean k2;
//
//    static {
//        k = false;
//        k2 = false;
//    }


    public static void main(String[] args) {
        if (args == null) {
            System.out.println("STAR");
        } else if (args.length == 0) {
            System.out.println("WARS");
        }
        List l = new ArrayList();
        int iff[] = new int[44];
        System.out.println(iff.length);
        System.out.println(Arrays.toString(args));
        int[] ik = new int[0];
        System.out.println(ik.length);
        System.out.println(Arrays.toString(ik));

        switch ("b") {
            case "b":
            case "c":
                System.out.println("ok");
                break;
            case "d":
                System.out.println("ok");
            case "e":
                System.out.println("ok");
            default:
                System.out.println("default");

        }

    }
}
