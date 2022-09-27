import java.util.*;
class Problem3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input:");
		int n=sc.nextInt();
		if(n%2==0){
			n=n-1;
		}
		System.out.println("Output:");
		for(int i=1;i<=n;i++){
			System.out.print(" "+(2*i-1));
		}	
	}
}