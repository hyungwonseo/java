package Java0402Collection.sec03_map.EX07_MapSummary;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSummary {
	public static void main(String[] args) {
		
		//#1. HashMap 입력순서와 출력순서는 서로 다름
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		System.out.println(hashMap.toString()); //{가=60, 다=30, 마=40, 나=50}
		
		//#2. HashTable 입력순서와 출력순서는 서로 다름
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("다", 30);
		hashTable.put("마", 40);
		hashTable.put("나", 50);
		hashTable.put("가", 60);
		System.out.println(hashTable.toString()); //{가=60, 나=50, 마=40, 다=30}
		
		//#3. LinkedHashMap 입력순서와 출력순서는 항상 같음
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("다", 30);
		linkedHashMap.put("마", 40);
		linkedHashMap.put("나", 50);
		linkedHashMap.put("가", 60);
		System.out.println(linkedHashMap.toString()); //{다=30, 마=40, 나=50, 가=60}
		
		//#4. TreeMap 입력순서와 상관없이 항상 오름차순으로 정렬 (키객체는 대소 비교 기준에 제공되어야 함)
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		System.out.println(treeMap.toString()); //{가=60, 나=50, 다=30, 마=40}
		
	}
}	





