package DSA;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int num1=0,num2=1,res;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the year to print for fibonacci");
		int n=sc.nextInt();
		
//		boolean b=false;
//		for(int i=0;i<n;i++) {
//			res= num1+num2;
//			if(res==n) {
//				b=true;
//				break;
//			}
//			num1=num2;
//			num2=res;
//		}
//		
//		if(b) {
//			System.out.println("Fibonacci number");
//		}
//		else {
//			System.out.println("Not a fibonacci number");
//		}
		if(n%4==0 && n%100!=0 || n%400==0) {

			while(n>num2) {
				res=num1+num2;
				num1=num2;
				num2=res;
			}
			if(num2==n) {
				System.out.println("Fibonacci Number");
			}
			else {
				System.out.println("Not a Fibonacci Number");
			}
		}
	}
}
