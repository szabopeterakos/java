import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.Arrays;
import java.util.Iterator;

public class AnArray {

    private int[] palindrom(int[] arr) {
        int[] resultArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[arr.length-i-1];
        }

        return resultArr;
    }

    public static void main(String[] args) {
        AnArray anArray = new AnArray();
        int[] testArr = {2, 3, 455, 212};
        System.out.println(Arrays.toString(anArray.palindrom(testArr)));
    }

}
