package UnOrdered.Plus;

public class Test30 {
    int kk = 8;

    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(java.io.FileNotFoundException s) {
        System.out.println("java.io.FileNotFoundException Version");
    }

//    public void method(NullPointerException n) {
//        System.out.println("NullPointerException Version");
//    }

    public void method(java.io.IOException s) {
        System.out.println("IOException Version");
    }

    public static void main(String args[]) {
        Test30 tc = new Test30();
        tc.method(null);
        int kk = 4;
        StringBuilder sb = new StringBuilder("world").append("hello ", 0, 6);
        System.out.println(sb);

        int ikjh = Integer.valueOf("3");
        System.out.println(ikjh);


        boolean b1 = false;
        boolean b2 = false;

        if (b2 = 5 > 3) {
            System.out.println("true");
            int i = 77, k;
            System.out.println("WHERE:");
            System.out.println(k = 77);
            System.out.println(k++);
            System.out.println("MATH:");
            System.out.println((k = 1) + ++k);
            System.out.println(k);

        } else {
            System.out.println("false");

        }

        String tomi = "tomi";
        String tomi2 = new String("tomi");
        System.out.println(tomi.intern());
        System.out.println(tomi2.intern());
        System.out.println("" + (tomi == tomi2) + " " + tomi.equals(tomi2) + " " + tomi.intern().equals(tomi2.intern()));
    }

}
