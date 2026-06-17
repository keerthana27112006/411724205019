public class recursion {

    public static void main(String[] args) {
        int n = 10;
        printEven(1, n);
    }

    static void printEven(int i, int n) {

        // base case
        if (i > n) {
            return;
        }

        // check even
        if (i % 2 == 0) {
            System.out.println(i);
        }

        // recursive call
        printEven(i + 1, n);
    }
}