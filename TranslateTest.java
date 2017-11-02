import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
import java.util.Arrays;

/** Tests the TrReader class
 *  @author Skyler Maxwell
 */

public class TranslateTest {
    /** Tests the Translate class
     */

    public static void main(String[] args) throws IOException {

        String str  = "My name is skyler";
        String from = "skyler";
        String to   = "SKYLER";

        System.out.println("This test the Translate.java");
        System.out.println(str);
        System.out.printf("from = %s%n",from);
        System.out.printf("to   = %s%n",to);

        String output = Translate.translate(str, from, to);
        System.out.println(output);
    }
}
