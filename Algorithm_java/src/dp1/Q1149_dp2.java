package dp1;
import java.util.Scanner;
public class Q1149_dp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] price = new int[n][3];
		int[][] dp = new int[n][3];
		
		for(int i = 0; i < price.length; i++) {
			price[i][0] = sc.nextInt();
			price[i][1] = sc.nextInt();
			price[i][2] = sc.nextInt();
		}
		
		dp[0][0] = price[0][0];
		dp[0][1] = price[0][1];
		dp[0][2] = price[0][2];
		for(int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + price[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + price[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + price[i][2];
		}
		
		System.out.println(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
	}
}