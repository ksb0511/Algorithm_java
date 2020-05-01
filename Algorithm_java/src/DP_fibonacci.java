
public class DP_fibonacci {
	static int[] data= new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(5));

	}
	
	private static int fibonacci(int x) {
		if(x<=0) 
			return 0;
		else if(x<2) // 첫 번째와 두 번째 수는 항상 1로 고정되어 있기 때문에..
			return 1;
		if(data[x]!=0) { // 이미 계산 했던 값이 있을 경우
			return data[x];
		}
		else {
			data[x]=fibonacci(x-1)+fibonacci(x-2);
			return data[x];
		}
	}

}
