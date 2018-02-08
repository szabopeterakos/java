package sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChriteriaMgh implements Chritertia {

    Set<String> mgh = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u", "á"));

    @Override
    public boolean isAble(String c) {
        if (mgh.contains(c)) {
            return true;
        }

        return false;
    }
}
