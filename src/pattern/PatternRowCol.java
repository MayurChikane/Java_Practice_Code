package DSA;

public class PatternRowCol {
	public static void main(String[] args) {
		int n=4;
		int count=1;
		int temp;
		for(int i=0;i<n;i++) {
			temp=count;
			for(int j=0;j<n;j++) {
				System.out.print(temp +" ");
				temp+=n;
			}
			count++;
			System.out.println();
		}
	}
}
