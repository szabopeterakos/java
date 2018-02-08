package SaltTech;

public class SaltTechJavaProblem {

    public static int MinDifferece(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int difMax = 0;

        for (int i = 0; i < arr.length; i++) {

            // Minimum set
            if (min > arr[i]) {
                min = arr[i];
            }

            // Maximum set
            if (max < arr[i]) {
                max = arr[i];

                // reset if dif change
                if (difMax < max - min) {
                    difMax = max - min;
                    min = Integer.MAX_VALUE;
                    max = Integer.MIN_VALUE;
                }
            }

        }

        return difMax;
    }

    public static void main(String[] args) {
        int[] testArr = {5, 1, 2, 33, 4, 5, 6, -20, 2, -2, 23};

        System.out.println(MinDifferece(testArr));
    }

}
