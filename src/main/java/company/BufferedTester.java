package com.company;

import java.io.*;
import java.util.Arrays;

public class BufferedTester {

    public static void main(String[] args) {
        System.out.println("BUFFERED-TESTER");

        File file = new File("testfile.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("1,2,3,4,5,6,7");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("testfile.txt"));
            System.out.println(new File("testfile.txt").exists());
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] temp = line.split(",");
                System.out.println(temp.length);
                System.out.println(Arrays.toString(temp));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
