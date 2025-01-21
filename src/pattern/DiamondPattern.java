package DSA;

public class DiamondPattern {
	public static void main(String[] args) {
		int n=5;
		
		for (int i=0;i<n;i++) 
		{
			for(int spaces=0;spaces< 2*((n-1)-i);spaces++) {
				System.out.print("_");
			}
			
			for(int alphabet=0;alphabet<=2*i;alphabet++) {
				if(alphabet==2*i) {
					System.out.print("*");
				}
				else {
					System.out.print("*_");
				}
			}
			for(int space=0;space< 2*((n-1)-i);space++) {
				System.out.print("_");
			}
			
			System.out.println();
		}
		
		for (int i=n-2;i>=0;i--) 
		{
			char ch='i';
			for(int spaces=0;spaces< 2*((n-1)-i);spaces++) {
				System.out.print("_");
			}
			
			for(int alphabet=0;alphabet<=2*i;alphabet++) {
				if(alphabet==2*i) {
					System.out.print("*");
				}
				else {
					System.out.print("*_");
				}
			}
			for(int space=0;space< 2*((n-1)-i);space++) {
				System.out.print("_");
			}
			
			System.out.println();
		}
	}
}
