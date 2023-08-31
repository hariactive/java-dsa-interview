import java.util.Scanner;
public class n_NaturalNumber
{
	public static void main(String[] args) {
	    f(5);
	}
	static void f(int n){
        if(n<=0){
            return;
        }
        
	 f(n-1);
     System.out.println("the n natural number is "+n);  
    }
}
