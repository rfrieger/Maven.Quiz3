package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.stream.Stream;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.*;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] strings = str.split(" ");
        String[] pigStrings = new String[strings.length];
        String returnString = "";
        for (int i = 0; i <strings.length ; i++) {
            pigStrings[i] = wordTrans(strings[i]);
        }

        for (int i = 0; i <pigStrings.length ; i++) {
            returnString += pigStrings[i];
            if (i < pigStrings.length -1 ){
                returnString += " ";
            }
        }

        return returnString;
    }

    public String wordTrans(String string) {
        String pigString ;
        if (startsWithVowel(string)){
            pigString = string + "way";
        } else {

            String firstPart = string.substring(0, getIndexOfFirstVowel(string));


            pigString = string.substring(getIndexOfFirstVowel(string)) + firstPart + "ay";
        }
        return pigString;
    }









        public static Boolean startsWithVowel(String word){
        if (isVowel(word.charAt(0))){
            return true;
        }
        return false;
    }

}