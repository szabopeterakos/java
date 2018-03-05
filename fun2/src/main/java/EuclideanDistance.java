import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EuclideanDistance {

    private double CalculateDistance2cordinates(double[] a, double[] b) {
        double distance = Math.sqrt(Math.pow(b[0] - a[0], 2) + Math.pow(b[1] - a[1], 2));
        return new BigDecimal(distance).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    private double CalculateDistance3cordinate(double[] a, double[] b) {
        // calculate a useable array legth with stater value: 0
        int arraySize = a.length >= b.length ? a.length : b.length;
        double[] aa = new double[arraySize];
        double[] bb = new double[arraySize];

        System.arraycopy(a, 0, aa, 0, a.length);
        System.arraycopy(b, 0, bb, 0, b.length);

        // store every cordinate calculated value
        double sum = 0;

        //I. n cordinate pow calculated value
        double cordinateRaw1 = Math.pow(aa[0] - bb[0], 2);
        double cordinateRaw2 = Math.pow(aa[1] - bb[1], 2);
        double cordinateRaw3 = Math.pow(aa[2] - bb[2], 2);

        sum += cordinateRaw1;
        sum += cordinateRaw2;
        sum += cordinateRaw3;

        double distance = Math.sqrt(sum);

        System.out.println(Arrays.toString(bb));
        System.out.println(Arrays.toString(aa));

        return new BigDecimal(distance).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    private double CalculateDistance(double[] a, double[] b) {
        // calculate a useable array legth with stater value: 0
        int arraySize = a.length >= b.length ? a.length : b.length;
        double[] aa = new double[arraySize];
        double[] bb = new double[arraySize];

        System.arraycopy(a, 0, aa, 0, a.length);
        System.arraycopy(b, 0, bb, 0, b.length);

        // store every cordinate calculated value
        double sum = 0;

        //I. n cordinate pow calculated value
        for (int i = 0; i < arraySize; i++) {
            double cordinateRaw = Math.pow(aa[i] - bb[i], 2);
            sum += cordinateRaw;
        }

        double distance = Math.sqrt(sum);

        return new BigDecimal(distance).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    // more precise solution
    private double CalculateDistance2(double[] a, double[] b) {
        // calculate a useable array legth with stater value: 0
        int arraySize = a.length >= b.length ? a.length : b.length;
        double[] aa = new double[arraySize];
        double[] bb = new double[arraySize];

        System.arraycopy(a, 0, aa, 0, a.length);
        System.arraycopy(b, 0, bb, 0, b.length);

        // store every cordinate calculated value
        BigDecimal sum = new BigDecimal(BigInteger.ZERO);

        //I. n cordinate pow calculated value
        for (int i = 0; i < arraySize; i++) {
            BigDecimal cordinateRaw =
                    (
                            new BigDecimal(aa[i])
                                    .subtract(new BigDecimal(bb[i]))
                    ).pow(2);

            sum = sum.add(cordinateRaw);

        }

        BigDecimal distance = new BigDecimal(Math.sqrt(sum.doubleValue()));

        return distance.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double CalculateDistanceWithList(List<Double> a, List<Double> b) {
        // calculate a useable array legth with stater value: 0
        int arraySize = a.size() >= b.size() ? a.size() : b.size();
        double[] aa = new double[arraySize];
        double[] bb = new double[arraySize];

        for (int i = 0; i < a.size(); i++) {
            aa[i] = a.get(i);
        }
        for (int i = 0; i < b.size(); i++) {
            bb[i] = b.get(i);
        }

        // store every cordinate calculated value
        double sum = 0;

        //I. n cordinate pow calculated value
        for (int i = 0; i < arraySize; i++) {
            double cordinateRaw = Math.pow(aa[i] - bb[i], 2);
            sum += cordinateRaw;
        }

        double distance = Math.sqrt(sum);

        return new BigDecimal(distance).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        EuclideanDistance ed = new EuclideanDistance();
        List<Double> a = new ArrayList<>();
        a.add(1.0);
        a.add(2.0);
        a.add(3.0);
        List<Double> b = new ArrayList<>();
        b.add(0.0);
        b.add(2.0);
        b.add(2.0);

//        System.out.println(ed.CalculateDistance(a, b));
        System.out.println(ed.CalculateDistanceWithList(a, b));
    }

}
