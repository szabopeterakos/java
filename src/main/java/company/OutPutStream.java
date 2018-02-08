package com.company;

import java.io.*;

public class OutPutStream {

    public static void main(String[] args) {
        byte[] bb = {0, 1, 1, 0, 0, 0, 0, 0, 0, 1};
        try {
            OutputStream os = new BufferedOutputStream(new FileOutputStream("byte.imi"));
            os.write(bb, 0, bb.length); // byte tömb, honnantól kezdjen el a tömbből írni, menyit,
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream("byte.imi"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(outputStream.toString());
    }


}
