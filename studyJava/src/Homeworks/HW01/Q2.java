package Homeworks.HW01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // 화씨온도(F)는 섭씨(C)로 섭씨 온도는 화씨로 변경시키는 코드를 완성하시오
        // 유저의 인풋을 두번 받아 처음에는 변경하고자 하는 방식을 선택하고 (1 또는 2)
        // 두번째에는 변경하고자 하는 온도를 입력받음(double 타입)
        // 첫번째 선택에 따라 출력방식이 달라져야 함
        // 화씨 -> 섭씨 공식 : 5(temp - 32) / 9
        // 섭씨 -> 화씨 공식 : ((9 * temp) / 5) + 32
        /*
            결과 예시
            1을 선택하고 100을 입력시 "화씨 100도는 섭씨 37.8도" 를 출력
            2를 선택하고 37.8을 입력시 "섭씨 37.8도는 화씨 100도" 를 출력
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨를 섭씨로 바꾸려면 1, 섭씨를 화씨로 바꾸려면 2를 선택 : ");
        int input = sc.nextInt();
        System.out.println("온도를 입력하시오 : ");
        double temp = sc.nextDouble();
        double result;


    }
}
