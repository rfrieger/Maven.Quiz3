package rocks.zipcode.io.quiz3.fundamentals;

import java.util.stream.Stream;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.getIndexOfFirstVowel;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String firstPart = str.substring(0, getIndexOfFirstVowel(str));


        String pigString = str.substring(getIndexOfFirstVowel(str)) + firstPart + "ay";
        return pigString;
    }

}