package Java0315.example;

public class Count {
    public static void main(String[] args) {

        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence";  // 모음 10개 자음 17개
        int vCount = 0, cCount = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            }else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                cCount++;
            }
        }
        System.out.println((int)'z');
        System.out.println("모음의 갯수: " + vCount);
        System.out.println("자음의 갯수: " + cCount);
    }
}
