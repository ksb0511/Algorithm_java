
public class DP_fibonacci {
	static int[] data= new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(5));

	}
	
	private static int fibonacci(int x) {
		if(x<=0) 
			return 0;
		else if(x<2) // ù ��°�� �� ��° ���� �׻� 1�� �����Ǿ� �ֱ� ������..
			return 1;
		if(data[x]!=0) { // �̹� ��� �ߴ� ���� ���� ���
			return data[x];
		}
		else {
			data[x]=fibonacci(x-1)+fibonacci(x-2);
			return data[x];
		}
	}

}
