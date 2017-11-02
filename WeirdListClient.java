/** This is a class to define functions for the WeirdList Class
 *  @author Skyler Maxwell
 */
public class WeirdListClient {

    //  Function to add an integer n to each element in the funtion
    static WeirdList add(WeirdList list, int n) {
       ADD function = new ADD(n);
       return list.map(function);
    }

    //  Function to sum all the elements in a WeirdList
    static int sum(WeirdList list) {
        SUM function = new SUM(list);
        list.map(function);
        return function.getSum();
    }

    //  The Add function that implements IntUnaryFunction
    private static class ADD implements IntUnaryFunction {
        private int num;

        public ADD(int num) {
            this.num = num;
        }

        // listVal + num
        public int apply(int listVal) {
            return this.num + listVal;
        }

        int getNum() {
            return this.num;
        }
    }

    //  The Sum function that implenents IntUnaryFunctipon
    private static class SUM implements IntUnaryFunction {
        private WeirdList list;
        private int sumVal;

        public SUM(WeirdList list) {
            this.list = list;
            this.sumVal = 0;
        }

        //  Sums up all elements in a WeirdList
        public int apply(int listVal) {
            this.sumVal = this.sumVal + listVal;
            return this.sumVal;
        }

        public int getSum() {
            return this.sumVal;
        }
    }
}
