package UnOrdered.Constructors;

public final class F1 {
    public static void main(String[] args) {

        System.out.println(1 + 5 < 3 + 7);
        System.out.println((2 + 2) >= 2 + 3);
        if (true == 3 > 2) System.out.println("OK");
        ;
    }
}

//class NK extends F1{
//
//}


class TestClass {
    void probe(Object x) {
        System.out.println("In Object");
    } //3

    void probe(Number x) {
        System.out.println("In Number");
    } //2

    void probe(Integer x) {
        System.out.println("In Integer");
    } //2

    void probe(Long x) {
        System.out.println("In Long");
    } //4

    public static void main(String[] args) {
        double a = 10;
        new TestClass().probe(a);
    }
}


interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House {
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {
}

class TestClass33 {


    void test(byte x) {
        switch (x) {
            case 'a':   // 1
            case 56:   // 2
            case 0:     // 3
            default:   // 4
            case 80:    // 5
        }
    }

    public static void main(String[] args) {
        House ci = new MyHouse();  //1
        System.out.println(ci.getAddress()); //2
        long x = 0b10_000L;
        StringBuilder hh = new StringBuilder();


//        short s = 10;
//        char c = s;
//        int dd = (double) 1;
//        switch (4);



    }


    }


    class TestClassklj {
        public static void methodX() throws Exception {
            throw new AssertionError();
        }

        public static void main(String[] args) {
            try {
                methodX();
            } catch (Exception e) {
                System.out.println("EXCEPTION");
            }
        }
    }