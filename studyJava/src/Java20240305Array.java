import java.util.Arrays;

public class Java20240305Array {
    public static void main(String[] args) {
        // 배열 선언법
        int[] intArray1; // 자바 스타일!!!
        int intArray2[]; // c언어 스타일이고 쓰이지 않음

        // 배열 객체 생성
        int[] intArray3 = new int[5]; // 메모리에 5개의 빈 저장소를 만듬
        // 배열 객체에 값 입력
        intArray3[0] = 10;
        intArray3[1] = 20;
        intArray3[2] = 30;
        intArray3[3] = 40;
        intArray3[4] = 50;
        for (int i=0; i<5; i++) {
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        // 배열의 선언, 생성, 입력을 한번에 수행하는 코드
        int[] intArray4 = {10,20,30,40,50};
        for (int i=0; i<5; i++) {
            System.out.print(intArray4[i] + " ");
        }
        System.out.println();

        // 배열의 초기화
        // 배열을 선언,생성하고 입력값을 넣지 않은 경우, 자동으로 초기값이 입력됨
        int[] intList = new int[3];
        float[] floatList = new float[3];
        boolean[] boolList = new boolean[3];
        char[] charList = new char[3];
        String[] strList = new String[3];
        System.out.println(Arrays.toString(intList));
        System.out.println(Arrays.toString(floatList));
        System.out.println(Arrays.toString(boolList));
        System.out.println(Arrays.toString(charList));
        System.out.println(Arrays.toString(strList));
    }
}
