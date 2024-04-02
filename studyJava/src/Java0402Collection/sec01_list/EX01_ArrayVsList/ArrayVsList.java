package Java0402Collection.sec01_list.EX01_ArrayVsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {
	public static void main(String[] args) {
		
		//#1. 배열
		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		System.out.println(array.length);
		array[2]=null;
		array[5]=null;
		
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		//#2. List
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size()); //데이터의 개수 구하기 
		aList.add("가"); 		aList.add("나");
		aList.add("다"); 		aList.add("라");
		aList.add("마"); 		aList.add("바");
		aList.add("사");
		System.out.println(aList.size()); //데이터의 개수 구하기
		
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size()); //데이터의 개수 구하기
		System.out.println(aList);		
	}
}
