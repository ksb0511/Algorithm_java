import java.util.Scanner;
import java.util.Stack;

public class Q10828_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			String order = scanner.next();
			if(order.contains("push")) {
				int num = scanner.nextInt();
				stack.push(num);
			}
			else if(order.equals("pop")) {
				System.out.println(stack.isEmpty()?-1:stack.pop());
			}
			else if(order.equals("size"))
				System.out.println(stack.size());	
			else if(order.equals("top"))
				System.out.println(stack.isEmpty()?-1:stack.peek());
			else if(order.equals("empty")) {
				System.out.println(stack.isEmpty()?1:0);
			}
		}

	}

}
