package Java0402Collection.sec01_list.EX05_LinkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListMethod {
	public static void main(String[] args) {
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		//#1. add(E element)
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		System.out.println(linkedlist1.toString()); //=~.println(aList1) [3, 4, 5]
		
		//#2. add(int index, E element)
		linkedlist1.add(1, 6);
		System.out.println(linkedlist1.toString()); //[3, 6, 4, 5]
		
		//#3. addAll(또 다른 리스트 객체)
		List<Integer> linkedlist2 = new LinkedList<>();
		linkedlist2.add(1);
		linkedlist2.add(2);
		linkedlist2.addAll(linkedlist2);
		System.out.println(linkedlist2); //[1, 2, 3, 6, 4, 5]
		
		//#4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> linkedlist3 = new LinkedList<>();
		linkedlist3.add(1);
		linkedlist3.add(2); //[1 2]
		linkedlist3.addAll(1, linkedlist3);
		System.out.println(linkedlist3); //[1, 1, 2, 2]
		
		//#5. set(int index, E element)
		linkedlist3.set(1,5);
		linkedlist3.set(3,6);
		//aList3.set(4,7); //java.lang.IndexOutOfBoundsException:		
		System.out.println(linkedlist3); //[1, 5, 2, 6]
		
		//#6. remove(int index)
		linkedlist3.remove(1); //1번 인덱스를 삭제해라
		System.out.println(linkedlist3); //[1, 2, 6]
		
		//#7. remove(Object o)
		linkedlist3.remove(new Integer(2));
		System.out.println(linkedlist3); //[1, 6]
		
		//#8. clear()
		linkedlist3.clear();
		System.out.println(linkedlist3); //[]
		
		//#9. isEmpty()
		System.out.println(linkedlist3.isEmpty()); //true
		
		//#10. size()
		System.out.println(linkedlist3.size());//0
		linkedlist3.add(1);
		linkedlist3.add(2);
		linkedlist3.add(3);
		System.out.println(linkedlist3); //[1, 2, 3]
		System.out.println(linkedlist3.size());//3
		
		//#11.get(int index)
		System.out.println("0번째 : " + linkedlist3.get(0)); //1
		System.out.println("1번째 : " + linkedlist3.get(1)); //2
		System.out.println("2번째 : " + linkedlist3.get(2)); //3
		for(int i=0; i<linkedlist3.size(); i++)
			System.out.println(i+"번째 : "+linkedlist3.get(i));
		
		//#12. toArray() List-->Array
		Object[] object = linkedlist3.toArray();
		System.out.println(Arrays.toString(object)); //[1, 2, 3]
		
		//#13-1. toArray(T[] t) -->  T[]
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		//#13-2. toArray(T[] t) -->  T[]
		Integer[] integer2 = linkedlist3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
	}
}

































