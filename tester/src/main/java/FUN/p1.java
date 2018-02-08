package FUN;

import com.sun.tools.classfile.Opcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class p1 {
    public static long max(long[] arr, int num) {
        long max = arr[0];
        long min = arr[0];
        long length = arr.length;
        Set<Long> myset = new HashSet<>();



        for (long c : arr) {
            myset.add(c);
            if(c > max){
                max = c;
            } else if (c < min){
                min = c;
            }
        }
        long uniques = myset.size();
        System.out.println(myset);
        Set myTreeSet = new TreeSet(myset);
        System.out.println(myTreeSet);
        return uniques;
    }

    public static void main(String[] srg) {

        long[] arr = {11, 22, 33, 123, 321, 45, 2655, 6, 66, 444, 32, 4, 2, 4, 9, 0, 0, 0};
        int i = 5;
        System.out.println(max(arr, i));
    }

}