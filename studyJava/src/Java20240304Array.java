public class Java20240304Array {
    public static void main(String[] args) {
        // 배열의 기본 선언법
        int[] intArray1 = {1,2,3,4,5};
        System.out.println(intArray1[0]);

        int[] intArray2 = new int[5];
        //intArray2 = {1,2,3,4,5};  // 오류
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        System.out.println(intArray2[4]);

        int[] intArray3 = new int[50];
        // int[] intArray3 = 가변의 길이를 가진 배열을 저장함
        for (int i=0; i<intArray3.length; i++) {
            intArray3[i] = i+1;
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        int[] intArray4 = new int[]{1,2,3,4,5};
        System.out.println(intArray4[0]);

        // 배열의 복사 (= 참조복사)
        String[] str1 = {"black", "red", "blue"};
        String[] str2 = str1;
        System.out.println("1 " + str2[0]);
        str2[0] = "white";
        System.out.println("2 " + str2[0]);
        System.out.println("3 " + str1[0]);
        // 기본자료형의 복사 (= 값복사)
        int a = 3;
        int b = a;
        System.out.println("1 " + b);
        b = 6;
        System.out.println("2 " + b);
        System.out.println("3 " + a);
    }
}






