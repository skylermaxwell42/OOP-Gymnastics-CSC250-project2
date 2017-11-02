/** Tests WeirdList Section of Project 2
 *  @author Skyler Maxwell
 */
import java.io.IOException;

public class WeirdListTest {

    public static void main(String[] args) throws IOException {

        System.out.println("This will Test my WeirdList");

        WeirdList list0 = new WeirdList(5, WeirdList.EMPTY);
        WeirdList list1 = new WeirdList(10, list0);

        System.out.println("The list we are testing contains two elements");
        System.out.println("List[0] = 10; List[1] = 5");

        System.out.println("Testing length() method");
        int length = list1.length();
        System.out.printf("Output: %d%n",length);

        System.out.println("Testing print() method\nOutput: ");
        list1.print();
        System.out.println();

        System.out.println("Testing SUM function\nOuput: ");
        int sum = WeirdListClient.sum(list1);
        System.out.println(sum);

        System.out.println("Testing ADD function (adding 20 to each elem.)\nOutput: ");
        WeirdList listADD = WeirdListClient.add(list1, 20);
        listADD.print();
        System.out.println();
    }
}
