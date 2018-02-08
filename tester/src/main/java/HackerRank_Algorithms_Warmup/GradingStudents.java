package HackerRank_Algorithms_Warmup;

import java.util.Scanner;

public class GradingStudents {


    static int[] solve(int[] grades) {
        int[] res = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                res[i] = grades[i];
            } else if ((grades[i] % 5) < 3) {
                res[i] = grades[i];
            } else if ((grades[i] % 5) >= 3) {
                System.out.println("this" + (5 - (grades[i] % 5)));
                res[i] = grades[i] + (5 - grades[i] % 5);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("4\n" +
                "73\n" +
                "67\n" +
                "38\n" +
                "33");
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : "."));
        }
        System.out.println("");


    }


}
