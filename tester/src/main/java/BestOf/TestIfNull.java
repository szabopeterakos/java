package BestOf;

import java.util.ArrayList;
import java.util.List;


import static java.lang.Integer.numberOfTrailingZeros;
import static java.lang.Integer.parseInt;


public class TestIfNull {
    void cucc() {
        int i = 0;
        int j = 11;

        while (++i < 5) {
            if (i > j) {
                break;
            }
            j--;
        }

        Object iA[] = {2, 3};
        System.out.println("THIS");
        System.out.println('a' + 1);
        System.out.println("i=" + i + " j=" + j);
    }


    public static void nullEr(StringBuilder o) {
        o = new StringBuilder("tomi");
//        try {
//            RuntimeException runtimeException = null;
//
//            throw runtimeException;
//        } catch (Exception e) {
//            System.out.println(e);
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        int i = 0;
        String s = "";
        System.out.println(s.charAt(3));

        s = null;
        if ((s == null) || (i == s.length())) {
            // s null != egyenlo null? = false = gyors kiertekelesu vagy megy tovabb
        }
        System.out.println("C");
        int anInt = parseInt("345");

        StringBuilder stringBuilder = new StringBuilder("d");

        nullEr(stringBuilder);
        System.out.println(stringBuilder);

        int grossIncome = 17000;

        double taxRate = grossIncome <= 18000 ? 0 : (grossIncome <= 36000) ? .1 : .2;
        System.out.println(taxRate);

        new TestIfNull().cucc();

        int iiii = 'k';
        char c = 'd';
        c++;
        System.out.println(c);

    }
}

class Testff {
    public static void main(String[] args) {
        int iiii = 'k';
        char c = 'd';
        c++;
        System.out.println(c);
    }
    void cucc() {
        System.out.println(Testff.this);
    }
}

