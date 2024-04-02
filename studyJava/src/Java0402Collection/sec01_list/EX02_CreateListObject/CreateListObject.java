package Java0402Collection.sec01_list.EX02_CreateListObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
    public static void main(String[] args) {
        
        //#방법1. List 구현클래스의 생성자를 사용하여 객체 생성
        List<Integer> aList1 = new ArrayList<>(); //capacity=10
        List<Integer> aList2 = new ArrayList<>(30); //capacity=30 
        
        List<Integer> aList3 = new Vector<>(); //capacity=10
        List<Integer> aList4 = new Vector<>(30); //capacity=30 
        
        List<Integer> aList5 = new LinkedList<>(); //capacity=10
        //List<Integer> aList6 = new LinkedList<>(30); //저장용량 지정불가
        
        //#방법2. Arrays 클래스의 정적 메서드 활용 (데이터의 크기를 바꿀 수 없다)
        List<Integer> aList7 = Arrays.asList(1,2,3,4);
        List<String> aList8 = Arrays.asList("안녕", "방가");
        aList7.set(1, 7);
        aList8.set(0, "감사");
        //aList7.add(5); //불가능
        //aList8.remove(0); //불가능
        
        System.out.println(aList7);
        System.out.println(aList8);
    }
}
