package UnOrdered.Constructors;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class T1 {


    public static void main(String[] args) {
        Duration d = Duration.ofDays(5);
        Period p = Period.ofDays(5);
        LocalDateTime ld = LocalDateTime.parse("20170323 0100", DateTimeFormatter.ofPattern("yyyyMMdd HHmm"));
        ZonedDateTime zdt = ZonedDateTime.of(ld, ZoneId.of("Europe/Budapest"));
        System.out.println(ld);
        System.out.println(ld.plus(d));
        System.out.println(ld.plus(p));
        System.out.println();
        System.out.println(zdt);
        System.out.println(zdt.plus(d));
        System.out.println(zdt.plus(p));
    }
}
