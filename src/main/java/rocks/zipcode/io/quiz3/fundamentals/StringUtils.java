package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.toUpperCase;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
   // String str="";
    //Integer indexToCapitalize;

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {



           // return str.toUpperCase(indexToCapitalize);
return null;

    }




    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
      //  return baseString.substring(characterToCheckFor,indexOfString);
    return  null;
    }

    public static String[] getAllSubStrings(String string) {
        int i = 0;
        int j = 1;
        String[] result;

        for (i = 0; i < string.length(); i++)
            if (j < string.length()) {
                String.format("\"" + (string.substring(i, j) + "\","));

            }
        //return String[i];
        return null;
    }


    public static Integer getNumberOfSubStrings(String input){


            int n = input.length();
            return (n * (n + 1) / 2)-1;

    }
}
