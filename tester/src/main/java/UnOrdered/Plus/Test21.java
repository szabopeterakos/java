package UnOrdered.Plus;

public class Test21 {


    static double percent;
    int offset = 10, base = 50;

    public static double calc(double value) {
        int coupon, offset, base;
        if (percent < 10) {
            coupon = 15;
            offset = 20;
            base = 10;
        } else {
            coupon = 15;
            offset = 20;
            base = 10;
        }


        return coupon * offset * base * value / 100;

    }

    public static void main(String[] args) {
        System.out.println(calc(100));


        int k = 1;
        int[] a = {1};

        k = (k + 2) * (k = 4);
        System.out.println("k=" + k);

        k = (k = 4) * (k + 2);
        System.out.println("k=" + k);

        System.out.println("a=" + a[0]);

        a[0] += (a[0] = 4) * (a[0] + 2);
        System.out.println(k + " , " + a[0]);


        int i = 0, j = 5;
        int counter = 0;

        lab1:
        for (; ; i++) {
            for (; ; --j) {

                if (i > j) {
                    System.out.println("counter ="+counter);
                    break lab1;
                }
                counter++;
            }
        }
        System.out.println(" i = " + i + ", j = " + j);
        System.out.println();

    }
}


