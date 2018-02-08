package UnOrdered.Plus;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

class Test28 {
    int k = 5;

    public boolean checkIt(int q) {
        return q-- > 0 ? true : false;
    }

    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k--);
        }
    }


    public static void main(String[] args) {
        new Test28().printThem();

        System.out.println();

        int c = 0;
        A:
        for (int i = 0; i < 2; i++) {
            B:
            for (int j = 0; j < 2; j++) {
                C:
                for (int k = 0; k < 3; k++) {
                    c++;
                    if (k > j) break;
                }
            }
        }
        System.out.println(c);

        boolean flag = true;

        if (flag)
            if (flag) System.out.println("True False");


            else System.out.println("True True");
        else System.out.println("False False");

        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(LocalDate.of(1990, 03, 23).with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).toString().substring(LocalDate.now().toString().length() - 2));
        boolean b = new Boolean("tRue");
        int ik = new Integer(44);
        System.out.println(b);
    }

}


