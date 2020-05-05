package dp1;
import java.util.*;

public class Q1912_dp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] d = new int[100001];
	        int[] a = new int[100001];
	 
	        for(int i=0; i<n; i++){
	            a[i]=sc.nextInt();
	            d[i]=a[i];
	        }
	    
	        for(int i=1; i<n ; i++){       
	           if(d[i-1]+a[i]>=d[i]){
	                  d[i]=d[i-1]+a[i];
	            }
	        }
	        
	        int max=d[0];
	        for(int i=1; i<n ; i++){
	            if(d[i]>max)
	                max=d[i];
	        }
	 
	        System.out.println( max ); 
	}

}
