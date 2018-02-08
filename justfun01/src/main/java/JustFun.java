import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JustFun {

    static int anInt = 22;

    public static void main(String[] args) {
        String fileName = "newfile";
        int sum = 0;
        int c = 0;
        Scanner scannerc=null;
        try {
            scannerc = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("this file is not found, sorry");
        }

        while(scannerc.hasNext()){
            String line = scannerc.nextLine();
            Pattern p = Pattern.compile("\\d");
            for (int i = 0; i < line.length(); i++) {
                Matcher matcher = p.matcher(String.valueOf(line.charAt(i)));
                boolean matches = matcher.matches();
                if(matches){
                sum+=Integer.parseInt(String.valueOf(line.charAt(i)));
                c++;}
            }

            String m1="I found "+ c +" number the sum is : "+ sum;
            String m2="I didnt find numbers in this text.";

            System.out.println(c==0?m2:m1);

            System.out.println(Numi.I.getValue());
            System.out.println(Arrays.toString(Numi.values()));


            JustFun justFun = new JustFun();
            justFun.anInt = 33;
            System.out.println(justFun.anInt);
            JustFun justFun2 = new JustFun();
            System.out.println(justFun2.anInt);

            int[] arr;

        }


    }

}
