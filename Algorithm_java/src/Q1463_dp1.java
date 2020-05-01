import java.util.Scanner;

public class Q1463_dp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int x = s.nextInt();
		int[] dp=new int[x+1]; //배열은 0부터 시작하지만 숫자는 1부터 시작하는 걸로 할 것이기 때문

		dp[0]=dp[1]=0;
		
		for(int i=2;i<=x;i++) {
			dp[i]=dp[i-1]+1;
			if(i%2==0) dp[i]=Math.min(dp[i/2]+1, dp[i]);
			if(i%3==0) dp[i]=Math.min(dp[i/3]+1, dp[i]);
			 //여기서 else-if를 쓰지 않는 이유는 2로도 나눠지고 3으로도 나눌 수 있는 숫자가 있을 수도 있기때문에 모든 경우의 수를 고려해야 함.
		}
		//
		
		System.out.println(dp[x]);
	}

}
