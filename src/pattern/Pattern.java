package DSA;

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		char ch='a';
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		for(int i=0;i<4;i++) {
			char c='a';
			for(int j=1;j<=4;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		int count=1;
		char chh='a';
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(j%2==0) {
					System.out.print(count+ " ");
				}
				else {
					System.out.print(chh+ " ");
				}
			}
		count++;
      	chh++;
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		int ct=1;
		char chhh='a';
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i%2==0) {
					System.out.print(ct+ " ");
					ct++;
				}
				else {
					System.out.print(chhh+ " ");
					chhh++;
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
	}
}
