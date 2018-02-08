package HackerRank_Algorithms_Warmup;

import java.util.*;

public class TimeConversion {

    static String timeConversion(String s) { //19:05:45
        // Complete this function
        String res = "";
        if(s.substring(s.length()-2).equals("AM")){
            int hour = Integer.parseInt(s.substring(0,2));
            String h = s.substring(0,2);
            if(hour == 12){
                h = "00";
            }
            res= h+s.substring(2,s.length()-2);
        }
        if(s.substring(s.length()-2).equals("PM")){
            int hour = Integer.parseInt(s.substring(0,2));
            hour += 12;
            String h = Integer.toString(hour);
            if(hour == 24){
                h = "12";
            }
            res= h+s.substring(2,s.length()-2);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("12:45:54PM");
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
