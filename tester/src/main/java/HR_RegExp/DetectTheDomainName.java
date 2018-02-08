package HR_RegExp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectTheDomainName {

    public static void main(String[] args) {
        System.out.println(regExpMatcher());
    }

    public static HashSet<String> regExpMatcher() {
        Scanner sc = new Scanner("1\nwww.kami.com ieurghe hisj gs <ief es> www.mani.com ko.com");
        int i = sc.nextInt();
        Pattern p = Pattern.compile("(ww[w2]\\.)?(([a-zA-Z0-9\\-]+\\.)+([a-zA-Z\\-])+)");
        HashSet<String> out = new HashSet<>();

        while (i-- >= 0) {
            Matcher match = p.matcher(sc.nextLine());
            while (match.find()) {
                out.add(match.group(2));
            }
        }

        return out;
    }


}
