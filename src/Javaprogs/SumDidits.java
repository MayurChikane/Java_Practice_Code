package DSA;

public class SumDidits {
	public static void main(String[] args) {
		int n=33676;
		int product=1;
		int sum=0;
		
		while(n>0) {
			if(n%2==0) {
				sum=sum+(n%10);
			}
			else {
				product=product*(n%10);
			}
			n=n/10;
		}
		System.out.println(sum);
		System.out.println(product);
	}
}
