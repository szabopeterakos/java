package UnOrdered.Plus;

public class Test13 {

    Test13() {
    }

    public void print() {
        System.out.println("A");
    }


}

class B extends Test13 {
    B() {
    }

    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new B();
    }
}