package FUN;

import sun.misc.Regexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class f2beta1 {

    public static void main(String[] args) {
        //Calculator
        System.out.println("\nCALCULATOR\n");
        System.out.println("    subtraction : - \n    addition + \n    multiplication * \n    division /");
        System.out.println("\n    example : (13+55+22+23)*2=");
        System.out.println("\nTYPING HERE:");

        Scanner sc = new Scanner("2+2*4");
        String line = sc.nextLine();
        f2 first = new f2();
        first.CalulateON(line);

    }

    public void CalulateON(String line) {

        printToScreen(line, calc(line));
    }

    private void printToScreen(String input, int resoult) {
        String pre = "YOUR PROBLEM SOLVED:\n";
        String message = input;
        if (input.charAt(input.length() - 1) != '=') {
            message += "=";
        }
        System.out.println(pre + message + resoult);
    }

    private int calc(String line) {


        String[] numbers = line.split("(\\+|-|/|\\*)"); // create num array

        //numbers array to numList
        List<Integer> numList = new ArrayList<>();
        for (String c : numbers) {
            numList.add(Integer.parseInt(c));
        }

        String[] operations = line.split("\\d"); // create operations array
        List<String> op = new ArrayList<>();

        // fix "" operators , deleting
        for (int i = 1; i < operations.length; i++) {
            if (operations[i].matches("(\\+|-|/|\\*)")) {
                op.add(operations[i]);
            }

        }
        System.out.println(op.size());


        int sum = 0;
        for (int i = 0; i < op.size(); i++) {

            int innerSum = i == 0 ? numList.get(i) : sum;
            if (op.get(i).equals("+")) {
                //innerSum += numList.get(i + 1);

            } else if (op.get(i).equals("-")) {
                //innerSum -= numList.get(i + 1);

            } else if (op.get(i).equals("*")) {
                innerSum *= numList.get(i + 1);

            } else if (op.get(i).equals("/")) {
                innerSum /= numList.get(i + 1);
            }

            sum = innerSum;

        }

        return sum;
    }


}
