package UnOrdered.Plus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test24 {


    void m1() {
        Test24.m2();  // 1
        m4();             // 2
//        Test24.m3();  // 3
        m3();

    }

    static void m2() {
    }  // 4

    void m3() {
        m1();            // 5
        m2();            // 6
//        Test24.m1(); // 7
    }

    static void m4() {
    }

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }

}
