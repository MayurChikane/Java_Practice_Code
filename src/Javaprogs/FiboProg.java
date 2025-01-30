package DSA;

public class FiboProg {
	
	public static void fibonacciwithin() {
		int n=7;
		int n1=0;
		int n2=1;
		
		int temp=0;
		
		while (n1<=n) {
			temp=n1+n2;
			
			System.out.println(n1);
			n1=n2;
			n2=temp;
		}
	}

	public static void fibonacciforn() {
		int n=5;
		int n1=0;
		int n2=1;
		int temp=0;
		for(int i=0;i<n;i++) {
			temp=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=temp;
		}
	}
	
	public static void fibonaccinth() {
		int n=8;
		int n1=0;
		int n2=1;
		int temp=0;
		for(int i=1;i<=n;i++) {
			temp=n1+n2;
			if(i==n) {
				System.out.println(n1);
			}
			n1=n2;
			n2=temp;
		}
	}
	
	public static void main(String[] args) {
//		fibonacciwithin();
//		fibonacciforn();
		fibonaccinth();
	}
}
