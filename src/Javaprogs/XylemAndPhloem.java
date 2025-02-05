package DSA;

public class XylemAndPhloem {
	public static void main(String[] args) {
		int n=4321;
		
		int l=n%10;
		int rev=0;
		int sum=0;
		
		while(n!=0) {
			rev=rev*10+(n%10);
			sum=sum+(n%10);
			n=n/10;
		}
		int f=rev%10;
		int fadd = l+f;
		
		if(sum-fadd==fadd) {
			System.out.println("Xylem");
		}
		else {
			System.out.println("Phloem");
		}
	}
}
