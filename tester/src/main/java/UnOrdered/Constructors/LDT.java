package UnOrdered.Constructors;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LDT {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.parse("2012 03 23",DateTimeFormatter.ofPattern("yyyy MM dd"));
        String out = ld.format(DateTimeFormatter.ofPattern("@ YYYY MM dd - EEEE"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY--MM--dd");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(ld);
        System.out.println(out);

        Date d = new Date();
        System.out.println(d);

        System.out.println("Adja meg a kedesett dátumot ÉÉÉÉHHNN formátumban");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        LocalDate tellme = LocalDate.parse(line, DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(tellme.format(DateTimeFormatter.ofPattern("EEEE")));
    }
}
