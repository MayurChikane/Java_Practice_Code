package DSA;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter First Year :");
		int a =sc.nextInt();
		
		System.out.print("Enter Second Year :");
		int b =sc.nextInt();
		
		int count=0;
		while(a<b) {
			if(a%4==0 && a%100!=0 || a%400==0) {
				System.out.println(a);
				count ++;
			}
			a++;
		}
		System.out.println("Total no of leap years : "+count);
	}
}
