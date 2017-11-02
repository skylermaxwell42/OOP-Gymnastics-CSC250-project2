/** Translate Class to translate characters from "from"
 *  to "to" within a string "S"
 *  @author Skyler Maxwell
 */

import java.io.IOException;
import java.io.StringReader;

/** String translation. */
public class Translate {
    static String translate(String S, String from, String to) {
        /* NOTE: The try {...} catch is a technicality to keep Java happy. */
        char[] buffer = new char[S.length()];
        try {

            StringReader strReader = new StringReader(S);
            TrReader trReader = new TrReader(strReader , from, to);
            char [] str = new char[S.length()];

            //  Translates characters from "from" to "to"
            trReader.read(str);
            return new String(str);
        } catch (IOException e) { return null; }
    }
}
