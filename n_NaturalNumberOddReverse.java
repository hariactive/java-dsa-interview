import java.util.Scanner;

public class n_NaturalNumberOddReverse {
    public static void main(String[] args) {
        int n = 10;
        int currentN = n * 2 - 1; // Calculate the last odd number based on 'n'
        f(n, currentN);
    }

    static void f(int n, int currentN) {
        if (n <= 0) {
            return;
        }

        if (currentN % 2 != 0) {
            System.out.println("currentN = " + currentN);
            f(n - 1, currentN - 2); // Decrement currentN to get the previous odd number
        } else {
            f(n, currentN - 1);
        }
    }
}
