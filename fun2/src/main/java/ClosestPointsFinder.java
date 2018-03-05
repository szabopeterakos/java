import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
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

                if (currentDistance < distance) {
                    distance = currentDistance;
                    first = lists.get(i);
                    second = lists.get(j);
                }
            }
        }

        List<List<Double>> resoult = new ArrayList<>();
        resoult.add(first);
        resoult.add(second);
        return resoult;
    }

    private List<List<Double>> parseDoubleListsOfList() {
        List<List<Double>> listOfDoublesLists = lineScanner.arrayCreator(f2);
        return listOfDoublesLists;
    }

    private int findNumberOfLines(List<Double> list, List<List<Double>> lists) {
        int number = -1;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) == list) {
                number = i + 1;
            }
        }
        return number;
    }

    private void printer(List<List<Double>> lists, int[] indexes) {
        for (int i = 0; i < indexes.length; i++) {
            System.out.print(indexes[i] + ":");
            for (Double c : lists.get(i)) {
                BigDecimal currentValue = new BigDecimal(c.doubleValue()).setScale(0, RoundingMode.HALF_UP);
                System.out.print(" " + currentValue);
            }
            System.out.println("");
        }
    }

    public void mainLogic() {
        List<List<Double>> allList = lineScanner.arrayCreator(f2);
        List<List<Double>> resultLists = closestDoubles(allList);
        int[] indexes = new int[2];
        indexes[0] = findNumberOfLines(resultLists.get(0), allList);
        indexes[1] = findNumberOfLines(resultLists.get(1), allList);
        printer(resultLists, indexes);
    }


    public static void main(String[] args) {
        ClosestPointsFinder cpf = new ClosestPointsFinder();
        cpf.mainLogic();
    }
}
