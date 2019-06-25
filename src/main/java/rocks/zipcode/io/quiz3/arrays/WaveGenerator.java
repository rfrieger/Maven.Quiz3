package rocks.zipcode.io.quiz3.arrays;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
         String string = str.toLowerCase();
         String[] arr = new String[str.length()];
         String toAdd = "";
        Integer legth = 0;

        for (int i = 0; i <str.length() ; i++) {
            ///need to handle for non letter chars.
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <str.length() ; j++) {
                if(j == i) {
                    toAdd += Character.toUpperCase(string.charAt(j));
                }else{
                    toAdd+= string.charAt(j);
                }
            }
            arr[i] = toAdd;
            toAdd = "";
        }
        return arr;
    }

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(indexToCapitalize) + str.charAt(indexToCapitalize) + str.substring(indexToCapitalize +1);

    }
}
