/** TrReader Class
 *  @author Skyler Maxwell
 */

import java.io.Reader;
import java.io.IOException;

/** Translating Reader: a stream that is a translation of an
 *  existing reader. */
public class TrReader extends Reader {
    /** A new TrReader that produces the stream of characters produced
     *  by STR, converting all characters that occur in FROM to the
     *  corresponding characters in TO.  That is, change occurrences of
     *  FROM.charAt(0) to TO.charAt(0), etc., leaving other characters
     *  unchanged.  FROM and TO must have the same length. */

    private Reader reader;
    private String from;
    private String to;

    //  Default Constructor for TrReader Class
    public TrReader(Reader str, String from, String to) {
        this.reader = str;
        this.from = from;
        this.to = to;
    }

    //  read() method that reads a single char
    public int read() throws IOException {
        int c = reader.read();
        if (c == -1) {
            return c;
        }
        else {
            return translate((char) c);
        }
    }

    //  read() method to read string
    public int read(char[] cBuffer) throws IOException {
        int n = reader.read(cBuffer);
        for (int i = 0; i < n; ++i) {
            cBuffer[i] = translate(cBuffer[i]);
        }
        return n;
    }

    //  read() method to read specified section of a string
    public int read(char[] cBuffer, int off, int length) throws IOException {
        int c =  reader.read(cBuffer, off, length);
        for (int i = off; i < c; ++i) {
            cBuffer[i] = translate(cBuffer[i]);
        }
        return c;
    }

    //  private method used to translate from one char to another
    private char translate(char c) {
        int n = from.length();
        for (int i = 0; i < n; ++i) {
            if (c == from.charAt(i)) {
                return to.charAt(i);
            }
        }
        return c;
    }

    //  The following methods are needed to make this class abstract
    public void close() throws IOException {
        reader.close();
    }

    public void mark(int lim) throws IOException {
        reader.mark(lim);
    }

    public boolean markSupported() {
        return reader.markSupported();
    }

    public boolean ready() throws IOException {
        return reader.ready();
    }

    public void reset() throws IOException {
        reader.reset();
    }

    public long skip(long n) throws IOException {
        return reader.skip(n);
    }
}


