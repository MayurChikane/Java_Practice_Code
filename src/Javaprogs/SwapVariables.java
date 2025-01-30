package DSA;
import java.util.Scanner;
public class SwapVariables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Year :");
		int a =sc.nextInt();
		
		System.out.print("Enter Second Year :");
		int b =sc.nextInt();
		
		int temp=0;
		
		temp =a;
		a=b;
		b=temp;
		System.out.println("First number : "+a);
		System.out.println("Second number : "+b);
	}
}
