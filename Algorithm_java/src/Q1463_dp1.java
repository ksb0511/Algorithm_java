import java.util.Scanner;

public class Q1463_dp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int x = s.nextInt();
		int[] dp=new int[x+1]; //�迭�� 0���� ���������� ���ڴ� 1���� �����ϴ� �ɷ� �� ���̱� ����

		dp[0]=dp[1]=0;
		
		for(int i=2;i<=x;i++) {
			dp[i]=dp[i-1]+1;
			if(i%2==0) dp[i]=Math.min(dp[i/2]+1, dp[i]);
			if(i%3==0) dp[i]=Math.min(dp[i/3]+1, dp[i]);
			 //���⼭ else-if�� ���� �ʴ� ������ 2�ε� �������� 3���ε� ���� �� �ִ� ���ڰ� ���� ���� �ֱ⶧���� ��� ����� ���� ����ؾ� ��.
		}
		//
		
		System.out.println(dp[x]);
	}

}
