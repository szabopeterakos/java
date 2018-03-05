package closestPairOfPoints;

import java.util.Arrays;

public class ClosestNumbers {

    private double[] closestDoubles(double[] arr) {
//        Arrays.sort(arr);

        double first = arr[0];
        double second = arr[1];
        double distance = Double.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double currentDistance = Math.abs(arr[i] - arr[j]);
                System.out.println("i==: " + i + currentDistance);
                if (currentDistance < distance) {
                    distance = currentDistance;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }

        System.out.println(distance);

        double resoult[] = {first, second};
        return resoult;
    }

    public static void main(String[] args) {
        ClosestNumbers cn = new ClosestNumbers();
        double a[] = {1, 2, 6, -2, 12};
        System.out.println(Arrays.toString(cn.closestDoubles(a)));
    }

}
