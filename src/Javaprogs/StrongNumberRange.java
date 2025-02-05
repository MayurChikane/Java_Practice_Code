package DSA;

public class StrongNumberRange {
	
	public static boolean isHappy(int num) {
		while(num>9) {
			int sum=0;
			while(num !=0) {
				int r=num % 10;
				sum=sum + r*r;
				num =num / 10;
			}
			num=sum;
		}
		
		return false;
	}
	
	public static boolean isStrong(int num) {
		int n = num;
		int sum=0;
		while(num!=0) {
			int r =num%10;
			int fact=1;
			while(r>1) {
				fact=fact*r;
				r--;
			}
			sum=sum+fact;
			num=num/10;
		}
		return n==sum;
	}
	
	public static void main(String[] args) {
		int num=500;
		System.out.println(isStrong(500));
		for(int i=1;i<=500;i++) {
			if(isStrong(i)) {
				System.out.println(i);
			}
		}
	}
}
