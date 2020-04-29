import java.util.Scanner;

public class Q2156_dp3 {
	static int[] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		dp=new int[x];
		
		for(int i=0;i<x;i++) {
			dp[i]=s.nextInt();
		}
		
		int sum = Math.max(one(x), two(x));
		
		System.out.println(sum);
	}

	public static Integer two(int x) {
		int sum = 0; int limit=0;
		for(int i=0;i<x;i++) { //처음부터 2개씩 선택
			if(limit<2) {
				sum +=dp[i];
				limit++;
			}
			else limit=0;
		}
		return sum;
	}
	
	public static Integer one(int x) {
		int sum = 0; int limit=1;
		for(int i=0;i<x;i++) { //처음부터 1개씩 선택
			if(limit<2) {
				sum +=dp[i];
				limit++;
			}
			else limit=0;
		}
		return sum;
		
	}
}
