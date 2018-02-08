package sample;

import sun.misc.Regexp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChriteriaMsh implements Chritertia {
    Set<String> msh = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u", "á"));

    @Override
    public boolean isAble(String c) {


        Pattern p = Pattern.compile("^[^aeuio\\d\\s\\?\\.\\,\\;\\:]");
        Matcher m = p.matcher(c);
        boolean match = m.matches();

        return match;
    }
}
