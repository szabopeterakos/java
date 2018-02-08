package UnOrdered.Inheritence;

public class AB {


    public static void main(String[] args) {

        AK a = new AK();//1
        BK b = new BK();//2
        b.f();
        a.f();
        System.out.println(b.i);
    }

}

class AK {
    public int i = 10;

    public void f() {
        System.out.println("nice");
    }

    public void g() {
    }
}

class BK extends AK {
    public int i = 20;

    public void g() {
    }
}