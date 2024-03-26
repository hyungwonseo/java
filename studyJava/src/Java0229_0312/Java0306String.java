package Java0229_0312;

import java.util.Arrays;

public class Java0306String {
    public static void main(String[] args) {
        // 문자열의 길이
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        // 문자열 검색
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.indexOf('a', 8));
        System.out.println(str1.indexOf(" "));

        // 문자열 변환 및 연결
        //String str3 = String.valueOf(2.3);
        double dValue = 2.3;
        String str3 = String.valueOf(dValue);
        //String str4 = String.valueOf(false);
        boolean bool = false;
        String str4 = String.valueOf(bool);
        System.out.println(str3);
        System.out.println(str4);

        // 문자열 연결
        String str5 = str3.concat(str4);
        System.out.println(str5);

        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        // 문자열 byte[] 변환
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        // 문자열 char[] 변환
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
