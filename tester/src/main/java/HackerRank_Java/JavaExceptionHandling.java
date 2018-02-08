package HackerRank_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int res = n1/n2;
            System.out.println(res);
        } catch (ArithmeticException a){
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException n){
            System.out.println("java.util.InputMismatchException");
        }

    }

}
