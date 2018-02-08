package HR_Algorithms_String;

import java.util.HashSet;
import java.util.Scanner;

public class Gemstones {

    static int gemstones(String[] arr) {
        if (arr.length == 1) {
            return 0;
        }

        String first = arr[0];
        int min = Integer.MAX_VALUE;

        for (String c : arr) {
            if (c.length() < min) {
                min = c.length();
                first = c;
            }
        }

        HashSet<Character> distinct = new HashSet<>();
        for (int i = 0; i < first.length(); i++) {
            distinct.add(first.charAt(i));
        }

        first = distinct.toString();


        int counter = 0;
        for (int i = 0; i < first.length(); i++) {
            String current = String.valueOf(first.charAt(i));
            int everyline = 0;
            for (String c : arr) {
                if (!c.contains(current)) {
                    continue;
                }
                everyline++;
            }
            if (everyline == arr.length) {
                counter++;
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("4\n" +
                "aaaaa\n" +
                "aabbkb\n" +
                "abk\n" +
                "aa\n");
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }

}
