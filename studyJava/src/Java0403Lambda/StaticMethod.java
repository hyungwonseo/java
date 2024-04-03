package Java0403Lambda;

interface AAA {
    void methodAAA();
}
class B2 { // 외부 라이브러리 클래스로 가정함
    static void methodB2() {
        System.out.println("외부클래스의 정적 메서드");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        // 외부클래스 메서드가 static이므로 외부클래스를 객체화할 필요가 없으므로
        // new 키워드로 생성하는 부분이 필요없음
        AAA a = () -> { B2.methodB2(); };
        AAA a1 = B2::methodB2;
        a1.methodAAA();
    }
}






