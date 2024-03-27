package Homeworks.HW01;

import java.util.Scanner;

public class Q4 {
    /*
        1) answer값보다 큰 수를 입력했을 경우에는 "더 작은 수를 입력하세요"를 출력하고
        다시 입력값을 받아야함
        2) answer값보다 작은 수를 입력했을 경우에는 "더 큰 수를 입력하세요"를 출력하고
        다시 입력값을 받아야함
        3) answer값과 같은 수를 입력했을 경우에 break를 통하여 반복문을 탈출하고
        "맞췄습니다"를 출력.
        4) 전체 시도횟수를 출력하고 종료.

        <결과예시> (answer값이 60이라고 가정)
        유저 입력값이 50이면, "더 큰 수를 입력하세요" 출력
        다시 유저가 70을 입력하면, "더 작은 수를 입력하세요" 출력
        다시 유저가 60을 입력하면, "맞췄습니다" 출력
        "시도횟수는 3번입니다" 출력하고 종료
    */
    public static void main(String[] args)
    {
        // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        Scanner sc = new Scanner(System.in);
        do {
            // 여기 코드를 작성
        } while(true); // 무한반복문
    }
}
