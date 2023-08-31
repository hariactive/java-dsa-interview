import java.util.Scanner;
public class Odd_n_NaturalNumber
{
	public static void main(String[] args) {
        int currentN = 1;
	    f(3,currentN);
	}
	static void f(int n,int currentN){
        
        if(n<=0){
            return;
        }
        if(currentN %2 != 0){
            System.out.println("currentN = " + currentN);
            f(n-1, currentN+2);
        }else{
            f(n, currentN+1);
        }
    }
}
