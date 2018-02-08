package HackerRank_Java;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {
        String template = "99.66.55.44\n100.111.111.1\n1.1.1.249\n250.1.1.1";
        Scanner in = new Scanner(template);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    /*
    1-9, 01-09,
    10-99 --> \d{1,2}
    000-009, 010-099, 100-199 --> {0|1}\d{2}
    200-249 --> 2[0-4]\d
    250-255 --> 25[0-5]
    \d <=> [0-9]
     */

}

class MyRegex {
    String num = "([0-9]{1,2}|[0-1][0-9]{2}|[2][0-4][0-9]|25[0-5])";

    //HR_Algorithms_String num = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

    public String pattern = num + "." + num + "." + num + "." + num;
}