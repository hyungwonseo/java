package Java0402Collection.sec04_stackandqueue.EX02_QueueMethod;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
	public static void main(String[] args) {
		
		//#1. 예외처리기능 미포함 메서드 첫번째 세트
		Queue<Integer> queue1 = new LinkedList<Integer>();
		//System.out.println(queue1.element());//NoSuchElementException
		//@1-1 add(E item)
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		
		//@1-2 element()
		System.out.println(queue1.element()); //3
		
		//@1-3 E remove()
		System.out.println(queue1.remove()); //3
		System.out.println(queue1.remove()); //4
		System.out.println(queue1.remove()); //5
		//System.out.println(queue1.remove());//NoSuchElementException
		System.out.println();
		
		//#2. 예외처리기능 포함 메서드 두번째 세트
		Queue<Integer> queue2 = new LinkedList<Integer>();
		System.out.println(queue1.peek()); //null
		
		//@2-1. offer(E item)
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		
		//@2-2. E peek();
		System.out.println(queue2.peek()); //3
		
		//@2-3. E poll();
		System.out.println(queue2.poll()); //3
		System.out.println(queue2.poll()); //4
		System.out.println(queue2.poll()); //5	
		System.out.println(queue2.poll()); //null 
	}
}


















