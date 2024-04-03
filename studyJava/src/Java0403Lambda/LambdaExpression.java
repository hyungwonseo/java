package Java0403Lambda;

interface A {
    void method1(); // 입력없고 리턴없음
}
interface B {
    void method2(int x); // 입력있고 리턴없음
}
interface C {
    int method3(); // 입력없고 리턴있음
}
interface D {
    double method4(int x, double y); // 입력있고 리턴있음
}

public class LambdaExpression {
    public static void main(String[] args) {
        A a0 = new A() { // 익명 이너 클래스
            public void method1() {
                System.out.println("pattern 1");
            }
        };
        // 람다식 단축형
        A a = () -> System.out.println("pattern 1");
        a.method1();

        B b = (int x) -> System.out.println("pattern 2 : " + x);
        B b1 = (x) -> System.out.println("pattern 2 : " + x);
        B b2 = x -> System.out.println("pattern 2 : " + x); // 매개변수가 하나인 경우만 소괄호삭제
        b2.method2(5);

        C c =  () -> { return 4; }; // return이 있으므로 중괄호가 필요함
        C c1 = () -> 4;  // return을 생략하려면 중괄호도 같이 생략해야함
        System.out.println(c1.method3());

        D d = (int x, double y) -> { return x + y; };
        D d1 = (int x, double y) -> x + y;
        D d2 = (x, y) -> x + y;
        System.out.println(d2.method4(10, 5.5));
    }
}







