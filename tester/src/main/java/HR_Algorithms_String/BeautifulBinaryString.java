package HR_Algorithms_String;

import java.util.Scanner;

public class BeautifulBinaryString {

    static int beautifulBinaryString(String b) {
        StringBuilder sb = new StringBuilder(b);
        int count = 0;
        for (int i = 0; i < b.length() - 2; i++) {
            if(sb.substring(i,i+3).equals("010")){
                sb.replace(i+2,i+3,"1");
//                System.out.println(sb);
                count++;
            }
        }
        System.out.println(sb);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("1\n090");
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }

}
