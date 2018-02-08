package hello;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class p5 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(354);
        set.add(4);
        set.add(52);
        set.add(1111);
        set.add(35231111);
        set.add(9875);

        System.out.println(set);


        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(2);
        q.add(40);
        q.add(76);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q);

        LinkedList<Integer> linkedList = new LinkedList<>();

    }
}
