package UnOrdered.Plus;

public class Test27 {


    public static void main(String args[]) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);


        boolean b = true;
        while (b = !b) {
            System.out.println(b);
        }

        Float fuiyg = Float.valueOf("12.3f");
        System.out.println(fuiyg);


        int ia[][] = {{1, 2}, {4, 5, 3}};

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println(ia[i][j]);

        for(int[] c:ia) System.out.println();

        if (true) System.out.println();
        else if (true) System.out.println();
        else System.out.println();

        do System.out.println(); while (false);

        while (true) {
        }

    }

}
