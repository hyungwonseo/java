package Java0402Collection.sec03_map.EX05_TreeMapMethod_1;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();		
		for(int i=20; i>0; i-=2) {
			treeMap.put(i, i+" 번째 데이터");
		}
		System.out.println(treeMap.toString()); //{2=2 번째 데이터, 4=4 번째 데이터, ...,  20=20 번째 데이터}
		
		//#1. firstKey()
		System.out.println(treeMap.firstKey()); //2		
		//#2. firstEntry()
		System.out.println(treeMap.firstEntry()); //2=2 번째 데이터		
		//#3. lastKey()
		System.out.println(treeMap.lastKey()); //20		
		//#4. lastEntry()
		System.out.println(treeMap.lastEntry()); //20=20 번째 데이터
		//#5. lowerKey(K key)
		System.out.println(treeMap.lowerKey(11)); //10
		System.out.println(treeMap.lowerKey(10)); //8
		//#6. higherKey(K key)
		System.out.println(treeMap.higherKey(11)); //12
		System.out.println(treeMap.higherKey(10)); //12
		
		//#7. pollFirsrtEntry()
		System.out.println(treeMap.pollFirstEntry()); //2=2 번째 데이터		
		System.out.println(treeMap.toString()); //{4=4 번째 데이터, ...,  20=20 번째 데이터}
		
		//#8. pollLastEntry()
		System.out.println(treeMap.pollLastEntry()); //20=20 번째 데이터		
		System.out.println(treeMap.toString()); //{4=4 번째 데이터, ...,  18=18 번째 데이터}
		
		//#9. SortedMap<K, V> headMap(K toKey)
		SortedMap<Integer, String> sortedMap = treeMap.headMap(8);
		System.out.println(sortedMap); //{4=4 번째 데이터, 6=6 번째 데이터}
						
		//#10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> navigableMap = treeMap.headMap(8, true);
		System.out.println(navigableMap); //{4=4 번째 데이터, 6=6 번째 데이터, 8=8 번째 데이터}
		
		//#11. SortedMap<K, V> tailMap(K toKey)
		sortedMap = treeMap.tailMap(14);
		System.out.println(sortedMap); //{14=14 번째 데이터, 16=16 번째 데이터, 18=18 번째 데이터}
						
		//#12. NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		navigableMap = treeMap.tailMap(14, false);
		System.out.println(navigableMap); //{16=16 번째 데이터, 18=18 번째 데이터}
		
		//#13. SortedMap<K, V> subMap(K fromKey, K toKey)
		sortedMap = treeMap.subMap(6, 10);
		System.out.println(sortedMap); //{6=6 번째 데이터, 8=8 번째 데이터}
						
		//#14. NavigableMap<K,V> subMap(K toKey, boolean inclusive)
		navigableMap = treeMap.subMap(6, false, 10, true);
		System.out.println(navigableMap); //{8=8 번째 데이터, 10=10 번째 데이터}
		
		//#15. NavigableSet<K> descendingKeySet()
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
		System.out.println(navigableSet.toString()); //[18, 16, 14, 12, 10, 8, 6, 4]
		System.out.println(navigableSet.descendingSet()); //[4, 6, 8, 10, 12, 14, 16, 18]
		
		//#16. NavigableMap<K,V> descendingMap()
		navigableMap = treeMap.descendingMap();
		System.out.println(navigableMap.toString()); //{18=18 번째 데이터, ... 4=4 번째 데이터}
		System.out.println(navigableMap.descendingMap()); //{4=4 번째 데이터, ... 18=18 번째 데이터}
	}
}









