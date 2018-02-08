package FUN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class f1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner("1 tomi\n2 zoli\n3 mani");
        Map<Integer, String> map01 = new HashMap<>();


        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            String[] c = s.split(" ");
            System.out.println(c[1]);
            map01.put(Integer.parseInt(c[0]), c[1]);
        }


        System.out.println(map01);
    }

}
