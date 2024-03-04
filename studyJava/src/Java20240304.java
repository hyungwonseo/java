public class Java20240304 {
    public static void main(String[] args) {
        // for반복문의 기본형
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // 무한루프
        // 조건식이 false가 될 수 있는지 여부를 반드시 확인!!!
//        for (int i=0; i >= 0; i++) {
//            System.out.println(i);
//        }

        // for문 변형하기
        int i = 0;
        for (  ; ; ) {
            if (i < 5) {
                System.out.print(i + " ");
                i++;
            }else {
                break;
            }
        }
        System.out.println();
        // 멀티 조건식
        for (int a=0, b=0; a<5 || b<5; a++, b++) {
            System.out.print(a + "_" + b + " ");
        }
    }
}





