package dp1;
import java.util.Arrays;
import java.util.Scanner;
 
public class Q2156_dp3 {
 
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
         
        int p[] = new int[n+1];
        int dp[] = new int[n+1];
         
        for(int i=1; i<=n; i++){
            p[i] = sc.nextInt();
        }
        //��ȭ�Ŀ��� i-3���� ���⶧���� 1,2�� ���ǻ� �ʱ�ȭ ���ش�.
        dp[1] = p[1];
        if(n > 1) // 1�� ��� ������ ������ ����ó��
        dp[2] = p[1] + p[2];        
        for(int i=3; i<=n; i++){
            //���� 0 �� ���Ű��   //���� 1�� ���Ű�� //���� 2������ ���
            dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+p[i],dp[i-3]+p[i-1]+p[i]));
 
        }
         
        System.out.println(dp[n]);
         
         
 
    }
 
}
