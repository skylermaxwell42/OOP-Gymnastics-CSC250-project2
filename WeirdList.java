/** WeirdList Class
 *  @author Skyler Maxwell
 **/
public class WeirdList {

    public static final WeirdList EMPTY = new EmptyList();

    private int head;
    private WeirdList tail;

    //  Default constructor
    public WeirdList(int head, WeirdList tail) {
        this.head = head;
        this.tail = tail;
    }

    //  Returns the length of the WierdList
    public int length() {
        return this.tail.length() + 1;  // '+1' because of the head element
    }

    // Prints each element in the WeirdList followed by a new line
    public void print() {
        System.out.print(this.head + " ");
        this.tail.print();
        System.out.print(" ");
    }

    /** This method applies a fucntion to a WeirdList and its outputs
     *  are a new WeirdList. This is acheived by applying a function to the
     *  head of the wierd list, then recursively applying this function to
     *  the tail of the WeirdList
     */
    public WeirdList map(IntUnaryFunction function) {
        return new WeirdList(function.apply(this.head), this.tail.map(function));
    }

    private static class EmptyList extends WeirdList {

        //  Default constructor that creates an empty list with
        //  head and a tail
        public EmptyList() {
            super(0,null);
        }

        //  List is called EmptyList so length() returns 0
        public int length() {
            return 0;
        }

        //  List is empty so nothing to print
        public void print() {
        }

        /** This method applies a fucntion to an EmptyList therefore
         *  it returns an EmptyList
         */
        public WeirdList map(IntUnaryFunction function) {
            return new EmptyList();
        }
    }
}
