package HackerRank_DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {


    int score;
    String name;

    public JavaComparator(String size) {
        this.name = size;
    }

    @Override
    public String toString() {
        return "JavaComparator{" +
                "score=" + score +
                '}';
    }

    public static void main(String[] args) {
        JavaComparator[] jc = {new JavaComparator("b"), new JavaComparator("a"), new JavaComparator("c")};
        Arrays.sort(jc, new Comparator<JavaComparator>() {
            @Override
            public int compare(JavaComparator a, JavaComparator b) {
                if (a.score - b.score != 0) {
                    return a.score - b.score;
                } else {
                    return a.name.compareTo(b.name);
                }
            }
        });

        System.out.println(Arrays.toString(jc));

    }

}
