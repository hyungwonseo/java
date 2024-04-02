package Java0402Collection.sec03_map.EX04_LinkedHashMapMethod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> lhMap1 =  new LinkedHashMap<Integer, String>();
		
		//#1. put (K key, V value)
		lhMap1.put(2, "나다라");
		lhMap1.put(1, "가나다");
		lhMap1.put(3, "다라마");
		System.out.println(lhMap1.toString()); //{2=나다라, 1=가나다, 3=다라마}
		
		//#2. putAll(다른 맵객체)
		Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();		
		lhMap2.putAll(lhMap1);
		System.out.println(lhMap2.toString()); //{2=나다라, 1=가나다, 3=다라마}
		
		//#3. replace(K key, V value)
		lhMap2.replace(1, "가가가");
		lhMap2.replace(4, "라라라"); //동작안함
		System.out.println(lhMap2.toString()); //{2=나다라, 1=가나다, 3=다라마}
		
		//#4. replace(K key, V oldValue, V newValue)
		lhMap2.replace(1, "가가가", "나나나");
		lhMap2.replace(2, "다다다", "라라라"); //동작안함
		System.out.println(lhMap2.toString()); //{2=나다라, 1=가나다, 3=다라마}
		
		//#5. V get(Object key)
		System.out.println(lhMap2.get(1)); //나나나
		System.out.println(lhMap2.get(2)); //나다라
		System.out.println(lhMap2.get(3)); //다라마
		
		//#6. containsKey(Object key)
		System.out.println(lhMap2.containsKey(1)); //true
		System.out.println(lhMap2.containsKey(5)); //false
				
		//#7. containsValue(Object value)
		System.out.println(lhMap2.containsValue("나나나")); //true
		System.out.println(lhMap2.containsValue("다다다")); //false
		
		//#8. Set<K> keySet()
		Set<Integer> keySet = lhMap2.keySet();
		System.out.println(keySet.toString()); //[2, 1, 3]
				
		//#9. Set<Map.Entry<K,V>> entrySet()
		Set<Map.Entry<Integer,String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet.toString()); //[2=나다라, 1=나나나, 3=다라마]
		
		//#10. size();
		System.out.println(lhMap2.size()); //3
		
		//#11. remove(Object key)
		lhMap2.remove(1);
		lhMap2.remove(4); //동작안함
		System.out.println(lhMap2.toString()); //{2=나다라, 3=다라마}
		
		//#12. remove(Object key, Object value)
		lhMap2.remove(2, "나다라");
		lhMap2.remove(3, "다다다"); //동작안함
		System.out.println(lhMap2.toString()); //{3=다라마}
		
		//#13. clear()
		lhMap2.clear();
		System.out.println(lhMap2.toString()); //{}
	}
}