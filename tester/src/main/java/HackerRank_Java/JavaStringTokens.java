package HackerRank_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStringTokens {

    public static void main(String[] args) {

        String s = "  ";
        // Write your code here.
        String sTrim = s.trim();
        System.out.println(sTrim.length()==0);

        String[] strarr = sTrim.split("[    !,?._'@]+");

        if(sTrim.length()==0){
            System.out.println("0");
        } else{
            System.out.println(strarr.length);
        }


        for(int i = 0 ; i < strarr.length; i++){
            System.out.println(strarr[i]);
        }

    }




}
