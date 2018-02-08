package UnOrdered.Plus;

public class Test4 {

    public Test4() {
        s1 = sM1("1");
    }

    static String s1 = sM1("a");
    String s3 = sM1("2");

    {
        s1 = sM1("3");
    }

    static {
        s1 = sM1("b");
    }

    static String s2 = sM1("c");
    String s4 = sM1("4");

    public static void main(String args[]) {
        Test4 it = new Test4();
    }

    private static String sM1(String s) {
        System.out.print(s+" ");
        return s;
    }

}
