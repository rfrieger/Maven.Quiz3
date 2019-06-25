package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(indexToCapitalize) + str.charAt(indexToCapitalize) + str.substring(indexToCapitalize +1);

    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                set.add(string.substring(i, j));

            }
        }
        String[] array = set.stream().toArray(String[]::new);

        return array;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
