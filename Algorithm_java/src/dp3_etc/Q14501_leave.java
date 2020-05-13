package dp3_etc;

import java.util.Scanner;

public class Q14501_leave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] t = new int[n+10];
		int[] p = new int[n+10];
		int[] dp = new int[n+10];
		
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
			p[i]=sc.nextInt();
		}
		
		int max=0;

		for(int i=0;i<n;i++) {
			dp[i]=Math.max(max, dp[i]);
			if((i+t[i])<=(n+1)) {
				dp[i+t[i]]=Math.max(dp[i+t[i]], dp[i]+p[i]);
			}
			if(max<dp[i]) max=dp[i];
		}
		System.out.println(max);

	}

}
