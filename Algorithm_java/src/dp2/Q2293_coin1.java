package dp2;

import java.util.*;

public class Q2293_coin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, k, coin;
		n = sc.nextInt();
		k = sc.nextInt();
		int[] dp = new int[k + 1];

		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			coin = sc.nextInt();
			for (int j = 1; j < k + 1; j++) {
				if (j >= coin)
					dp[j] += dp[j - coin];
			}
		}
		System.out.println(dp[k]);
	}
}
