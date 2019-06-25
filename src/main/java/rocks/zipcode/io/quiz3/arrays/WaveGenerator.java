package rocks.zipcode.io.quiz3.arrays;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
         String string = str.toLowerCase();

         String toAdd = "";
        Integer length = 0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                length++;
            }
        }

        String[] arr = new String[length];

        int counter = 0;
        for (int i = 0; i <string.length() ; i++) {
            if (Character.isLetter(str.charAt(i))) {
                arr[counter] = string.substring(0, i) + Character.toUpperCase(string.charAt(i)) + string.substring(i + 1);
                counter++;
            }
        }
//
        return arr;
    }

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(indexToCapitalize) + str.charAt(indexToCapitalize) + str.substring(indexToCapitalize +1);

    }
}
