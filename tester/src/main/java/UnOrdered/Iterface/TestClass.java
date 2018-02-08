package UnOrdered.Iterface;


class TestClass implements T1, T2 {
    public void m1() {
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.m1();
        System.out.println(VALUE);
    }
}

interface T1 {
//    int VALUE = 1;

    void m1();
}

interface T2 {
    int VALUE = 2;

    void m1();
}
