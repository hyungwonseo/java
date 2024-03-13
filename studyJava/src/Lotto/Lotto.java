package Lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        
        /* 로또 번호 생성 (1~45) */

        // 정렬방식을 이용하는 방법
        int[] intList = new int[6];
        Random rd = new Random();
        for (int i=0; i<6; i++) {
            intList[i] = rd.nextInt(45) + 1;
        }
        int count = 6;
        while(count > 0) {
            count = 6;
            Arrays.sort(intList);
            for (int i=0; i< intList.length; i++) {
                if (i < intList.length-1 && intList[i] == intList[i+1]) {
                    intList[i+1] = rd.nextInt(45) + 1;
                }else {
                    count--;
                }
            }
        }
        System.out.println(Arrays.toString(intList));

        // contains로 확인.. 이중 for문과 동일
        ArrayList<Integer> intList2 = new ArrayList<>();
        while(intList2.size() < 6) {
            int temp = rd.nextInt(45) + 1;
            if (!intList2.contains(temp)) {
                intList2.add(temp);
            }
        }
        System.out.println(intList2.toString());

        // 숫자 샘플을 배열에 넣고 고른 숫자를 삭제하는 방식.. 삭제시 시간이 소요됨
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<45; i++) {
            numbers.add(i+1);
        }
        int[] intList3 = new int[6];
        for (int i=0; i< intList3.length; i++) {
            int randNum = rd.nextInt(numbers.size());
            intList3[i] = numbers.get(randNum);
            numbers.remove(randNum);
        }
        System.out.println(Arrays.toString(intList3));

        // HashSet을 이용함. 가장 효율적이고 빠른 방법
        HashSet<Integer> intList4 = new HashSet<>();
        while(intList4.size() < 6) {
            intList4.add(rd.nextInt(45) + 1);
        }
        System.out.println(intList4.toString());
    }
}
