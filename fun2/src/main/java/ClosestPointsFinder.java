import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPointsFinder {

    private File f = new File("/Users/szabop/after_yellowroad/java/fun2/src/main/resources/sample_input_2_8.tsv");
    private File f2 = new File("/Users/szabop/after_yellowroad/java/fun2/src/main/resources/sample_input_10_100.tsv");
    private LineScanner lineScanner = new LineScanner();
    private EuclideanDistance euclideanDistance = new EuclideanDistance();

    private List<List<Double>> closestDoubles(List<List<Double>> lists) {

        List<Double> first = lists.get(0);
        List<Double> second = lists.get(1);
        double distance = Double.MAX_VALUE;

        for (int i = 0; i < lists.size(); i++) {
            for (int j = i + 1; j < lists.size(); j++) {
                double currentDistance = Math.abs(euclideanDistance.CalculateDistanceWithList(lists.get(i), lists.get(j)));
                //System.out.println("i==: " + i + currentDistance);
                if (currentDistance < distance) {
                    distance = currentDistance;
                    first = lists.get(i);
                    second = lists.get(j);
                }
            }
        }

        //System.out.println(distance);

        List<List<Double>> resoult = new ArrayList<>();
        resoult.add(first);
        resoult.add(second);
        return resoult;
    }

    private String findClosestPoints() {
        List<List<Double>> listOfDoublesLists = lineScanner.arrayCreator(f2);
        System.out.println(closestDoubles(listOfDoublesLists));

        return "ok";
    }

    public static void main(String[] args) {
        ClosestPointsFinder cpf = new ClosestPointsFinder();
        cpf.findClosestPoints();

    }
}
