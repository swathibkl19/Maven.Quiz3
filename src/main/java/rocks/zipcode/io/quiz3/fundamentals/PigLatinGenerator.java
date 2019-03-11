package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                // str.startsWith
               // str.endsWith("ay");
               // System.out.println(ch);
                String str1 = str.substring(i);
                //str1.endsWith("ay");
                System.out.println(str1.endsWith(str1));



            }

        }
        return null;
    }
}
