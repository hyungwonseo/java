package Java0402Collection.sec02_set.EX03_LinkedHashSetMethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {
	public static void main(String[] args) {
		
		Set<String> linkedSet1 = new LinkedHashSet<>();
		
		//#1. add(E element)
		linkedSet1.add("가");
		linkedSet1.add("나");
		linkedSet1.add("가");
		System.out.println(linkedSet1.toString()); //[가 나]
		
		//#2. addAll(다른 set 객체)
		Set<String> linkedSet2 = new LinkedHashSet<>();
		linkedSet2.add("나");
		linkedSet2.add("다");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2.toString()); //[나, 다, 가]
		
		//#3. remove(Object o)
		linkedSet2.remove("나");
		System.out.println(linkedSet2.toString()); //[다, 가]
		
		//#4. clear()
		linkedSet2.clear();
		System.out.println(linkedSet2.toString()); //[]
		
		//#5. isEmpty();
		System.out.println(linkedSet2.isEmpty()); //true
		
		//#6. contains (Object o)
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("가");
		linkedSet3.add("나");
		linkedSet3.add("다");
		System.out.println(linkedSet3.contains("나")); //true
		System.out.println(linkedSet3.contains("라")); //false
		
		//#7. size()
		System.out.println(linkedSet3.size()); //3
		
		//#8. iterator()
		Iterator<String> iterator = linkedSet3.iterator();
		while(iterator.hasNext()) { //총 3바퀴
			System.out.println(iterator.next()); //가, 나 , 다
		}
		
		//#9. toArray()
		Object[] objArray = linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray));  //[가, 나, 다]
		
		//#10-1. toArray(T[] t)
		String[] strArray1 = linkedSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1)); //[가, 나, 다]
		
		//#10-2. toArray(T[] t)
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2)); //[가, 나, 다, null, null]
		
	}
}
