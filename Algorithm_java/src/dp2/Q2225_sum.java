package dp2;

import java.util.*;
import java.math.*;

public class Q2225_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[][] d = new long[k + 1][n + 1];
		d[0][0] = 1;
		for (int i = 1; i <= k; i++) {
			for (int j = 0; j <= n; j++) {
				for (int l = 0; l <= j; l++) {
					d[i][j] += d[i - 1][j - l];
					d[i][j] %= 1000000000;
				}
			}
		}
		System.out.println(d[k][n]);
	}
}