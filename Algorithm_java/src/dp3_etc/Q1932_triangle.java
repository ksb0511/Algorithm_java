package dp3_etc;

import java.util.*;

public class Q1932_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max= 0, n = sc.nextInt();
		int[][] dp = new int[n][n];
		
		dp[0][0] = sc.nextInt();
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				dp[i][j] = sc.nextInt();
				
				if(j == 0)
					dp[i][j] += dp[i-1][j];
				else if(j == i)
					dp[i][j] += dp[i-1][j-1];
				else
					dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
				
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}

}
