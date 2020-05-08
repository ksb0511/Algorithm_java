package dp2;

import java.util.*;

public class Q9461_wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] dp = new long[101];
        
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            dp[1]=1; dp[2]=1; dp[3]=1; dp[4]=2; dp[5]=2;
            for(int j=6; j<=n; j++){
                if ( dp[j]!=0 ) continue;
                dp[j]=dp[j-1]+dp[j-5];
            }
            System.out.println(dp[n]);
        }
    }

}
