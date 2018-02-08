package HR_GRAPH;

import java.util.Set;
import java.util.TreeMap;

public class Graph2 {

    static TreeMap<PNode, PNode> tree = new TreeMap<>();


    public static void main(String[] args) {
        Graph2 graph2 = new Graph2();


    }

    private class PNode {
        private PNode parent;
        private Set<PNode> children;

        public PNode(PNode parent, Set<PNode> children) {
            this.parent = parent;
            this.children = children;
        }
    }
}
