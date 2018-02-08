package HackerRank_DataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] argh) {
        Scanner in = new Scanner("3\n" +
                "uncle sam\n" +
                "99912222\n" +
                "tom\n" +
                "11122222\n" +
                "harry\n" +
                "12299933\n" +
                "uncle sam\n" +
                "uncle tom\n" +
                "harry");
        int n = in.nextInt();
        in.nextLine();
        HashMap map = new HashMap();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            //System.out.println(name + " " + phone);
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(map.get(s) == null ? "Not found" : s + "=" + map.get(s));
        }
    }

}
