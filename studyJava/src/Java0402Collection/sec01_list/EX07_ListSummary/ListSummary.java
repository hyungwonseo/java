package Java0402Collection.sec01_list.EX07_ListSummary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {
		
		//1. ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("다");
		arrayList.add("마");
		arrayList.add("나");
		arrayList.add("가");
		System.out.println(arrayList.toString()); //[다, 마, 나, 가]
		
		//2. Vector
		List<String> vector = new Vector<>();
		vector.add("다");
		vector.add("마");
		vector.add("나");
		vector.add("가");
		System.out.println(vector.toString()); //[다, 마, 나, 가]

		//3. LinkedList
		List<String> linkedList = new LinkedList<>();
		linkedList.add("다");
		linkedList.add("마");
		linkedList.add("나");
		linkedList.add("가");
		System.out.println(linkedList.toString()); //[다, 마, 나, 가]		
	}
}
