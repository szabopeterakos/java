package closestPairOfPoints;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineScanner {

    static final LineScanner SCANNER = new LineScanner();

    private LineScanner() {
    }

    public static LineScanner getScannerInstance() {
        return SCANNER;
    }

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
            List<Double> currentList;
            try (Scanner scannerInner = new Scanner(line)) {
                currentList = new ArrayList<>();
                while (scannerInner.hasNextDouble()) {
                    currentList.add(scannerInner.nextDouble());
                }
            }
            resoultList.add(currentList);
        }
        scn.close();

        return resoultList;
    }

}
