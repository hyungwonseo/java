package Java0313;

public class JavaExample2 {
    public static void main(String[] args) {

        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }
        System.out.println("글자수 : " + count);
    }
}
