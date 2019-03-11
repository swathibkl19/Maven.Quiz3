package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        return null;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        String loweredWord = word.toLowerCase();

        for (int index = 0; index < loweredWord.length(); index++)
        {

                switch(word.charAt(index)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':


                return index;
            }
        }
        return null;
    }

    public static Boolean startsWithVowel(String word) {



              //  return "AEIOUaeiou".startsWith(word.startsWith("AEIOUaeiou") != -1;
        return  null;
        }



    public static Boolean isVowel(Character character) {

        return "AEIOUaeiou".indexOf(character) != -1;

    }
}
