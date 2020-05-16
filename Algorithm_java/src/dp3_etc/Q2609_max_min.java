package dp3_etc;

import java.util.Scanner;

public class Q2609_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int n1, n2, lcd=0, gcd=0;
		
		n1=sc.nextInt();
		n2=sc.nextInt();

		for(int i=2; i<n1 && i<n2; i++)
			if(n1%i==0 && n2%i==0)
				gcd=i;
	
		lcd=n1*n2/gcd;
		
		System.out.println(gcd+"\n"+lcd);
	}

}
