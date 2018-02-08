package Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unio {

    public int[] UnioMaker(int[] a, int[] b) {
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            out.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            int k = 0;

            // if a[current] != b[i] we will need another a[current++]
            while (a[k] != b[i] && k < a.length - 1) {
                k++;
            }
            // if a.length-1 equal k means the current b[i] element is unique
            if (k == a.length - 1) {
                out.add(b[i]);
            }
        }

        int[] outArray = new int[out.size()];
        for (int i = 0; i < out.size(); i++) {
            outArray[i] = out.get(i);
        }

        return outArray;
    }

    public List<Integer> UnioMakerList(int[] a, int[] b) {
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            out.add(a[i]);
        }

        int k = a.length;

        for (int i = 0; i < b.length; i++) {
            int c = 0;
            while (c < a.length && a[c] != b[i]) {
                c++;
            }
            if (c >= a.length) {
                out.add(b[i]);
            }
        }

        return out;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4, 6};
        Unio unio = new Unio();

        System.out.println("First:\n" + Arrays.toString(unio.UnioMaker(arr1, arr2)));
        System.out.println("Second:\n" + unio.UnioMakerList(arr1, arr2));

    }

}
