package UnOrdered.Plus;

public class Test20 {

    /*
    If evaluation of a dimension expression completes abruptly,
    no part of any dimension expression to its right will appear to have been evaluated.
    Thus, while evaluating a[val()][i=1]++,  val() throws an exception and i=1 will not be executed.
    Therefore, i remains 99 and a[1][1] will print 11.
     */

    int main;

    public static void main(String[] args) {
        Test20 test20 = new Test20();

        if (true) {
            System.out.println("1");

        } {
            System.out.println("no else");
        }


        System.out.println(test20.main);
        int[][] a = {{00, 01}, {10, 11}};
        int i = 99;
        Integer k = null;
        try {
            a[k][i = 1]++;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(i + ", " + a[1][1]);
            System.out.println('4' + 0);
            System.out.println(0 + '0');
            System.out.println(1.1 + 1.1); //double
            System.out.println(1.1f + 1.1f);// float

            System.out.println(1.1f + 1.1); // float + double
            System.out.println((double) (1.1f + 1.1)); // float + double
            System.out.println((float) (1.1f + 1.1)); // float + double
        }
    }

    static int val() throws Exception {
        throw new Exception("unimplemented");
    }

}
