package HR_GRAPH;

import java.util.*;

public class MiniGraph {

    public static void main(String[] args) {
        Map<String, LinkedList<Integer>> linkedListMap = new LinkedHashMap<>();


        for (int k = 0; k < 5; k++) {
            LinkedList<Integer> container = new LinkedList();
            int[] arr = {1, 3, 5, 7};
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                container.add(arr[i] * k);
            }

            linkedListMap.put("node" + k, container);
        }

        System.out.println(linkedListMap);

        System.out.println(linkedListMap.keySet());

    }

}
