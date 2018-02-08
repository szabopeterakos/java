package HackerRank_DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner("5\n" +
                "12 0 1 78 12\n" +
                "2\n" +
                "Insert\n" +
                "5 23\n" +
                "Delete\n" +
                "0");
        int a = Integer.parseInt(sc.nextLine());
        String[] b = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(b));
//        System.out.println("LIST: " + list);
        int c = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < (c); i++) {
            String temp = sc.nextLine();
            if (temp.toUpperCase().equals("INSERT")) {
                String[] ab = sc.nextLine().split(" ");
                int index = Integer.parseInt(ab[0]);
                list.add(index, ab[1]);

            } else if (temp.toUpperCase().equals("DELETE")) {
                int d = Integer.parseInt(sc.nextLine());
                list.remove(d);
//                System.out.println("DELETE : " + d);
            }

        }

        for (String cc : list) {
            System.out.print(cc + " ");
        }

    }

}
