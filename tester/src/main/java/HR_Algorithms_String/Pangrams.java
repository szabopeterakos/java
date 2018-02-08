package HR_Algorithms_String;

import java.util.Scanner;

public class Pangrams {

    public static String Pangram(String ss) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int n = 0;
        for (int i = 0; i < ss.length(); i++) {
            n = 0;
            for (int j = 0; j < ss.length(); j++) {

                if (n >= 26) {
                    return "pangram";
                }
                if (ss.contains(alphabet.substring(n, n + 1))) {
                    n++;
                    continue;
                }
            }
        }

        return "not pangram";
    }

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner("We promptly judged antique ivory buckles for the next prize   ");
        String temp = sc.nextLine().toLowerCase();
        System.out.println(temp);

        System.out.println(Pangram(temp));
    }

}
