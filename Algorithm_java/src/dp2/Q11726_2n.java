package dp2;

import java.util.*;

public class Q11726_2n {

	static public void main(String args[]){
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

   		int[] dp = new int[n+1];

    	dp[0] = 1;
    	dp[1] = 1;

    	if(n>=2){
        	for(int i = 2; i <= n; i++){
            	dp[i] = (dp[i-1] + dp[i-2]);
                dp[i] %= 10007;
        	}
    	}
    	System.out.println(dp[n]);
	}
 }