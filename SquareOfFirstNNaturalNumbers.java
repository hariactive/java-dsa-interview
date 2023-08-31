
public class SquareOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        printSquares(n, 1);
    }

    static void printSquares(int n, int currentNumber) {
        if (n <= 0) {
            return;
        }

        System.out.println("Square of " + currentNumber + " is: " + (currentNumber * currentNumber));
        printSquares(n - 1, currentNumber + 1);
    }
}
