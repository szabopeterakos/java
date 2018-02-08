package UnOrdered.Iterface;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

    }
}


//    Which statements concerning the following code are true?

class A {
    public A() {
    } // A1

    public A(String s) {
        this();
        System.out.println("A :" + s);
    }  // A2
}

class B extends A {
    public int B(String s) {
        System.out.println("B :" + s);
        return 0;
    } // B1
}

class C extends B {
    private C() {
        super();
    } // C1

    public C(String s) {
        this();
        System.out.println("C :" + s);
    } // C2

    public C(int i) {
    } // C3
}


class Test {
    static String j = "";

    public static void method(int i) {
        try {
            if (i == 2) {
                throw new RuntimeException();
            }
            j += "1";
        } catch (RuntimeException e) {
            j += "2";
            return; // this is awesome
        } finally {
            j += "3";
        }
        j += "4";
    }

    public static void main(String args[]) {
        method(1);
        method(2);
        System.out.println(j);
    }
}