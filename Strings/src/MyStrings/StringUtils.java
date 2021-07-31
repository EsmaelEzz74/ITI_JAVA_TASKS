package MyStrings;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class StringUtils {
    public static String betterString(String word1, String word2, BiPredicate<String, String> p) {
        if (p.test(word1, word2)) {
            return word1;
        } else {
            return word2;
        }
    }

    public static boolean haveNumbers(String word, Predicate<String> p) {
        if(p.test(word)){
            return true;
        }
        return false;
    }
}