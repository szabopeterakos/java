package HR_Algorithms_String;

import java.util.*;

public class TwoCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner("2\n" +
                "ab");
        int len = in.nextInt();
        String s = in.next();

        List<Character> list = new ArrayList();
        for (char c : s.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }
//        System.out.println(list);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                String tempS = "";
                int c1 = 0;
                int c2 = 0;
                for (char cc : s.toCharArray()) {
                    if (cc == list.get(i).charValue() || cc == list.get(j).charValue()) {
                        tempS += cc;
                        if (cc == list.get(i).charValue()) {
                            c1++;
                        }
                        if (cc == list.get(j).charValue()) {
                            c2++;
                        }
                    }
                }


                for (int x = 1; x < tempS.length(); x++) {
                    if (tempS.charAt(x) == tempS.charAt(x - 1)) {
                        continue;
                    }
                }

//                System.out.println(tempS);


                if (tempS.length() < min) {
                    min = tempS.length();
                }

            }
        }

        if (list.size() < 2) {
            min = 0;
        } else if (s.length() <= min) {
            min = s.length();
        }
        System.out.println(min);

    }

}
