package UnOrdered.Abstract;

import java.util.Arrays;
import java.util.List;

public class MagicTest {
    public static int out1() {
        return 2;
    }


    public static int out2(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static float totom() {
        return 7f;
    }

    public static void main(String[] args) {
        A1 abstractA1 = new A2();
        B1 abstractB1 = new B2();
        B1 abstractB1another = new B3();

        List<B1> b1List = Arrays.asList(new B2(), new B2(), new B3(), new B3());
        for (B1 c : b1List) {
            System.out.println(c.getClass());
        }

        System.out.println(abstractB1 instanceof B2);
        System.out.println(abstractB1another instanceof B2);


        int i = 10;
        System.out.println((i < 20) ? out1() : out2(3,2));
        System.out.println(totom());


    }
}
