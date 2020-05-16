package dp3_etc;

import java.util.*;

public class Q3036_ring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []x = new int[n];

		x[0]= sc.nextInt();
		
		for(int i=1;i<n;i++) {
			x[i]= sc.nextInt();
			int gcd= getGCD(x[0], x[i]);
			
			System.out.println(x[0]/gcd + " / "+ x[i]/gcd);
		}
	}
	
	public static int getGCD(int a, int b) {
		while(b>0) {
			int tmp = a;
			a = b;
			b = tmp%b;
		}
		return a;
	}

}
