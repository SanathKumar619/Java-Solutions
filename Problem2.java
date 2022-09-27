import java.util.*;
class Problem2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input:");
		int n=sc.nextInt();
		System.out.println("Output:");
		for(int i=1;i<=n;i++){
			System.out.print(" "+(2*i-1));
		}	
	}
}