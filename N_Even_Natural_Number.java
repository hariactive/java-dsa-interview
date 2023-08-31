
public class N_Even_Natural_Number {
    public static void main(String[] args) {
        int n = 4;
        f(n, 2);
    }

    static void f(int n, int currentN) {
        if (n <= 0) {
            return;
        }

        System.out.println("currentN = " + currentN);
        f(n - 1, currentN + 2);
    }
}
