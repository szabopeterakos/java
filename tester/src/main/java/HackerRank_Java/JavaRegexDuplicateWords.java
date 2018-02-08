package HackerRank_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexDuplicateWords {

    /*

    \b start of word word boundary
    \W+ any word character
    \1 same word matched already
    \b end of word
    ()* Repeating again
    () are used for grouping of regex phrases.
    Listgroup(1) contains the string that is between parenthesis (.) so . Item
    m.group(0) contains whole matched string.

     */

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner("5\n" +
                "Goodbye bye bye world world world\n" +
                "Sam went went to to to his business\n" +
                "Reya is is the the best player in eye eye game\n" +
                "in inthe\n" +
                "Hello hello Ab aB");
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

}
