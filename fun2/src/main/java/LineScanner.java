import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LineScanner {

    public List<List<Double>> arrayCreator(File file) {
        List<List<Double>> resoultList = new ArrayList();
        Scanner scn = null;
        try {
            scn = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("The file is not founded : " + file);
        }

        while (scn.hasNextLine()) {
            String line = scn.nextLine();
            Scanner scannerInner = new Scanner(line);
            List<Double> currentList = new ArrayList<>();
            while (scannerInner.hasNextDouble()) {
                currentList.add(scannerInner.nextDouble());
            }

            resoultList.add(currentList);
        }

        return resoultList;
    }

    public static void main(String[] args) {
        LineScanner ls = new LineScanner();
        File f = new File("/Users/szabop/after_yellowroad/java/fun2/src/main/resources/sample_input_2_8.tsv");
        System.out.println(ls.arrayCreator(f));
    }

}
