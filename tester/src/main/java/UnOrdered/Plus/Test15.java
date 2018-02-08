package UnOrdered.Plus;

public class Test15 {


    public static void main(String[] args) throws Exception {
        A a = new A();
        System.out.println(a.getClass());
        AA aa = new AA();
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());
    }


}

class A {
}

class AA extends A {
}