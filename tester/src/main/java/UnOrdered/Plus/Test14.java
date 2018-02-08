package UnOrdered.Plus;

public class Test14 {
    public static int getSwitch(String str) {
        return (int) Math.round(Double.parseDouble(str.substring(1, str.length() - 1)));
    }


    public static void main(String[] args) {
        String str1 = "one";
        String str2 = "two";
        System.out.println(str1.equals(str1 = str2));
        System.out.println(str1.equals(str1 = str2));
        Test14 iiufg = new Test14();


        String[] sa = {"a", "b", "c"};
        for (String s : sa) {
            if ("b".equals(s)) continue;
            System.out.println(s);
            if ("b".equals(s)) break;
            System.out.println(s + " again");

        }


        switch (getSwitch("--0.50")) {
            case 0:
                System.out.print("Hello ");
            case 1:
                System.out.print("World");
                break;
            default:
                System.out.print("Good Bye");
        }


//        boolean b1 = false;
//        boolean b2 = false;
//        if (b2 != b1 = !b2) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        System.out.println();
        System.out.println("HELLL");
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, " + sw);
        System.out.println("Hello, " + sb);


        int kk = (Integer) 11;
        byte kkk = -128;


        Integer imi = 1;
        Long m = 1L;
        if (imi.equals(m)) System.out.println("equal");
        else System.out.println("not equal");


        boolean bbb = (11>2);
    }
}


class StringWrapper {
    private String stt;

    public StringWrapper(String stt) {
        this.stt = stt;
    }
}






