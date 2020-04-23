package ds1556;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q10845_queue {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   int b=0;
    Queue<Integer> q = new LinkedList<>();
    
    Scanner scanner = new Scanner(System.in);
    int cnt = scanner.nextInt();
    for(int i=0; i<cnt; i++) {
    	String a = scanner.next();
    	
    	if(a.equals("push")) {
    		b = scanner.nextInt();
    		q.add(b);
    	}else if(a.equals("front")){
    		System.out.println(q.isEmpty()?-1:q.peek());
    	}else if(a.equals("back")) {
    		System.out.println(q.isEmpty()?-1:b);
    	}else if(a.equals("size")) {
    		System.out.println(q.size());
    	}else if(a.equals("pop")) {
    		System.out.println(q.isEmpty()?-1:q.poll());
    	}else if(a.equals("empty")) {
    		System.out.println(q.isEmpty()?1:0);
    	}
    }
   }
}