package HR_GRAPH;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Graph {

    private LinkedHashMap<String, LinkedList<Node>> lhm = new LinkedHashMap<>();

    public static void main(String[] args) {
        Graph g = new Graph();
        g.init();

    }

    private void init() {
        LinkedList<Node> lln = new LinkedList<>();
        lln.add(new Node("1", 100)); // first child node
        lln.add(new Node("2", 200)); // second child node

        lhm.put("one", lln); // added this linked list to "one"

        lln = new LinkedList<>();
        lln.add(new Node("2", 333));
        lhm.put("two", lln);
        System.out.println(lhm);

    }

    private class Node {
        private String name;
        private int cost;

        public Node(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return " node{" +
                    "name='" + name + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }

}
