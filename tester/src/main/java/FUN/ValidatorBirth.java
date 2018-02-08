package FUN;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class ValidatorBirth {

    public void ValidDATA() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("navos.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            toBox(sc.nextLine());
        }
    }

    private void toBox(String input) {
        String[] line = input.split("[\\|]{2}");

        if (!isValid(line[0], line[1], line[2], line[3])) {
            System.out.print("FALSE : ");
            System.out.println(Arrays.toString(line));

        } else {
            System.out.print("CORRECT : ");
            System.out.println(Arrays.toString(line));
        }
    }

    private boolean isValid(String id, String consumer, String sellingDate, String kind) {
        if (idChecker(id) && dateChecker(sellingDate)) {
            return true;
        }

        return false;
    }

    private boolean idChecker(String id) {
        if (!id.trim().matches("\\d{4}")) {
            System.out.println("  Problem with ID below: " + id);
            return false;
        }
        return true;
    }

    private boolean dateChecker(String sellingDate) {
        try {
            LocalDate currentDate = LocalDate.parse(sellingDate.trim());
        } catch (DateTimeParseException dte) {
            System.out.println("  Problem with selling date below: " + sellingDate);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        ValidatorBirth vb = new ValidatorBirth();
        vb.ValidDATA();
    }

}
