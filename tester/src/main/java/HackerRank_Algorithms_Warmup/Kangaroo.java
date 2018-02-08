package HackerRank_Algorithms_Warmup;

import java.util.Scanner;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        String res="";

        int c1 =x1;
        int c2 = x2;


        do {
            if(c1==c2){
                res = "YES";
                break;
            }
            c1+=v1;
            c2+=v2;
        } while (c2 > c1-v2);


        return res==""? "NO":res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("0 3 4 2");
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
