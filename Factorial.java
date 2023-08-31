import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args) {
	    int n = 5;
		int r = fact(n);
		System.out.println("fact is = "+ r);
	}
	static int fact(int n){
	   if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
	    
}
}
