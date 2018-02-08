package HR_Algorithms_String;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner("bB");
        String s = in.next();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(Integer.toString(s.charAt(i)));
            if(s.substring(i,i+1).equals(s.substring(i,i+1).toUpperCase())){
                c++;
            }
        }

        System.out.println(c);

    }

}
