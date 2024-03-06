import java.util.Arrays;

public class Java0306String2 {
    public static void main(String[] args) {
        String str1 = "Java Study";
        // Study를 못찾으면 변경하지 않고 원본 그대로 둠
        System.out.println(str1.replace("Study", "공부"));

        // 두번째 파라미터로 사용된 인덱스는 포함되지 않음 (0 <= 범위 < 5)
        System.out.println(str1.substring(0, 5));

        // 연산자를 이용하여 ':'와 '/'기준으로 분리시킴
        String[] strArray = "Name:Michael/Man".split(":|/");
        System.out.println(Arrays.toString(strArray));

        // "앞뒤" 공백지우기
        String _str1 = "   abc def   ";
        //_str1 = _str1.trim();
        System.out.println(_str1.length());
    }
}
