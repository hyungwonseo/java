package Java0326Example2;

public class StrSumExample {

    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            //sum = sum + (str.charAt(i) - '0');
            //sum = sum + Integer.valueOf(String.valueOf(str.charAt(i)));
            sum = sum + Character.getNumericValue(str.charAt(i));
        }
//        System.out.println(str.charAt(0));
//        System.out.println(String.valueOf(str.charAt(0)));
//        System.out.println(Integer.valueOf(str.charAt(0)));
        System.out.println("합계는 " + sum); // 15
    }
}
