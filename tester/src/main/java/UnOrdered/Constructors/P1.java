package UnOrdered.Constructors;

import com.sun.org.apache.xpath.internal.operations.Bool;


public class P1 {
    static int tomi = 333;

    static Integer[] intomb = {new Integer(1)};


    static void tomolo(Integer[] iii) {
        iii[0] = new Integer(111);
        String titi = null;
        P1 p1 = null;
        System.out.println(p1.tomi);
    }


    public static void main(String[] args) {
        boolean bol = false;
        byte b = 1;     // 8bit
        short s = 1;    // 16
        int i = 1;      // 32
        long l = 1;     // 64
        float f = 1;    // 32
        double d = 1;   // 64
        char c = 1;     // 16 || utf8 8bit || utf16 16 v 32 bit

        Boolean bolW = false;
        Byte bW = new Byte("1");
        Short sW = 1;
        Integer iW = 1;
        Long lW = new Integer(i).longValue(); // 1L
        Float fW = 1F;// 1F
        Double dW = 100_0.;
        Character cW = 1;

        System.out.println(sW == s);
        System.out.println(sW.equals(s));
        System.out.println(sW == i);
        System.out.println(s == iW);
        System.out.println(iW.equals(sW));
        iW.equals(dW);
        fW.equals(f);
        fW.equals(dW);
        fW.equals(d);
        System.out.println(d == f);

        short s2 = 3;

        tomolo(intomb);
        System.out.println(intomb[0]);

    }


}


class M {
    int i;

    public M() {
    }

    public M(int i) {
        this.i = i;
    }
}

class N {
    private M m = new M();

    public void makeItNull(M pM) {
        pM = new M(10);
    }

    public void makeThisNull() {
        makeItNull(m);
    }

    public M getM() {
        return m;
    }

    public static void main(String[] args) {
        N n = new N();
        n.makeThisNull();
        System.out.println(n.getM().i);
        Short s = 1;
        Byte b = 1;
        Long l = 1L;
        Long l2 = (Long) new Long((byte) 1);
        Float f = 1f;
        Double ddd = 32d;
        System.out.println(ddd);

        Character c = 1;
        System.out.println(c);
        Boolean bd = new Boolean("tRue");

    }
}

