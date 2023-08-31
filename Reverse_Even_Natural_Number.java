public class Reverse_Even_Natural_Number {
    public static void main(String[] args) {
        int n = 4;
        int currentN = n * 2; // Calculate the last even number based on 'n'
        f(n, currentN);
    }

    static void f(int n, int currentN) {
        if (n <= 0) {
            return;
        }

        if (currentN % 2 == 0) {
            System.out.println("currentN = " + currentN);
            f(n - 1, currentN - 2); // Decrement currentN to get the previous even number
        } else {
            f(n, currentN - 1);
        }
    }
}
