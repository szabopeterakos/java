package mainer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nHY I WILL WIRTE AN AWESOME HEADER JUST FOR YOU!");
        System.out.println("Tell me what is the message and what is the header length");
        System.out.println("example: message 14");

        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int number = 0;

        Pattern p = Pattern.compile("([a-zA-Zöüóőúűéáí\\s]+)(\\d{1,3})$");
        Matcher matcher = p.matcher(message);
        if (matcher.find()) {
            message = matcher.group(1).trim();
            number = Integer.parseInt(matcher.group(2));

        }

        if (message.length() % 2 != 0) {
            message = " " + message;
        }

        int pos = 0;
        for (int i = 0; i < 3; i++) {

            if (number < message.length()) {
                number = message.length() + 1;
            }
            int length = number;


            if (length % 2 != 0) {
                length += 1;
            }
            for (int j = 1; j <= length; j++) {

                if (i == 1 && (j > length / 2 - (message.length() / 2) && j < length / 2 + (message.length() / 2) + 1)) {
                    System.out.print(message.charAt(pos));
                    pos++;
                } else {
                    System.out.print("-");
                }
            }

            System.out.println();
        }

    }

}
