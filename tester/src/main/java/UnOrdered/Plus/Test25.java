package UnOrdered.Plus;


import java.util.List;

class Test25 {


    private int value = 1;
    private Test25 link;

    public Test25(int val) {
        this.value = val;
    }

    public static void main(String[] args) throws Exception {
        final Test25 a = new Test25(5);
        Test25 b = new Test25(10);
        a.link = b;
        b.link = setIt(a, b);
        System.out.println(a.value + " " + b.value);
        List list;
        byte bbb = 121;
        switch (bbb) {
            case 2:
                break;
            default:
            case 'm':
            case -2:
                break;

        }

        String k = "ggg";
        String r = new StringBuilder("vrrrr") + k.substring(0, 3);
        System.out.println(r);
    }

    public static Test25 setIt(Test25 x, Test25 y) throws Exception {
//        x.value = y.value + 22;
        return x;
    }


}
