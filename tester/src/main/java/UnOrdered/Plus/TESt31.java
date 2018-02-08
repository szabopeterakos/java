package UnOrdered.Plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TESt31 {
    String[] i1() {
        char[] m = {'o', 'k'};
        String ok = Arrays.toString(m);
        System.out.println(ok);
        System.out.println("tomi".contains(Arrays.toString(m)));
        List l = new ArrayList();
        l.add(0, 3);
        l.add(1, new StringBuilder().append("jeah"));
        StringBuilder sb = new StringBuilder().append(true);
        System.out.println(sb.append(33).replace(0, 2, "WWWW").indexOf("W", 4));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.reverse().append(456789));
        System.out.println();
        int ii = (int) Float.valueOf(2f).longValue();
        System.out.println(ii);
        return null;

    }

}

class TEST32 extends TESt31 {
    String[] i1() {
        return new String("this is").split(" ");
    }

    public static void main(String[] args) {
        TESt31 teSt31 = new TESt31();
        teSt31.i1();
        System.out.println(Arrays.toString(new TEST32().i1()));

        Integer integer = 44;
        Integer integer0 = 44;
        Integer integer1 = 44;
        Integer integer2 = 44;
        int i4=44;
        double d4 = 44.000000000000001;

        Double doub = (double) 44;
        Double doub2 = new Double(44);
        Double doub3 = new Double(44);

        Float flo = 44F;
        Float flo0 = new Float((int)44);
        Float flo1 = new Float(44.0);
        Float flo2 = new Float("44");
        System.out.println(flo0);



        Character ch = 44;
        Character ch2 = new Character('d');

        int int0 = 44;
        double d0 = (int) 44;

        char ch0 = 44;

        System.out.println("EQUALS:");
        System.out.println(integer.intValue() == doub.doubleValue());
        System.out.println(i4 == d4);
        Integer.parseInt("55");

    }
}