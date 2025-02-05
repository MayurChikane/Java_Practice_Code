package DSA;

public class AlternateDigits {

	public static void main(String[] args) {
		int n =4442225;
		int count=1;
		int rev=0;
		
		System.out.println(n);
		
		int m=n;
		while(m>0) {
			rev=rev*10+(m%10);
			m=m/10;
		}
		System.out.println(rev);
		while(rev>0) {
			if (count%2==0) {
				System.out.println(rev%10);
			}
			rev=rev/10;
			count++;
		}
	}
}
