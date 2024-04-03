package Java0403Lambda;

interface AA { // 함수형 인터페이스
    void abc();
}
class LibraryB { // 내가 만든 클래스가 아닌 라이브러리 클래스라고 가정!!
    void methodB() {
        System.out.println("원래 존재하는 라이브러리 메서드");
    }
}
interface AA2 {
    void methodAA2(String str);
}

public class InstanceMethodType {
    public static void main(String[] args) {
        AA aa0 = new AA() { // 익명 이너 클래스
            @Override
            public void abc() {
                LibraryB b = new LibraryB();
                b.methodB();
            }
        };
        // 내가 만든 함수형 인터페이스 메서드에서 외부 클래스의 메서드를 사용하려면
        // 그 외부클래스의 인스턴스가 필요하므로 아래처럼 인스턴스 생성과정이 필요
        AA aa = () -> {
            LibraryB b = new LibraryB();
            b.methodB();
        };
        // 위의 코드에서 람다식내의 중괄호를 없애는 단축형
        LibraryB b = new LibraryB();
        AA aa1 = b::methodB;
        aa1.abc();

        // AA2 함수형 인터페이스는 화면출력을 위하여 외부 메서드인 System.out.println을 사용
        AA2 aa2 = (String str) -> System.out.println(str);
        AA2 aa3 = System.out::println;
        aa3.methodAA2("이것은 무리수");
    }
}










