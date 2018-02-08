package HackerRank_Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaPrimalityTest {


    public static void main(String[] args) {
        Scanner in = new Scanner("13");
        BigInteger n = in.nextBigInteger();
        in.close();

        System.out.println(n.isProbablePrime(5));
        // Write your code here.
    }


}
