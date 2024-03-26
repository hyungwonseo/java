package Java0326;

public class Main {
    public static void main(String[] args) {
        ChildA a = new ChildA();
        a.abc();
        a.bcd();
        //A.a = 100; // 오류 A.a는 상수임
        System.out.println(A.a);
        System.out.println(B.a);

        A a2 = new A(){
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
        a2.abc();

        // <인터페이스 생성 방법 1>
        // 자식클래스(ChildA)를 선언하고 해당 인터페이스를 상속하게 하면
        // 아래와 같이 동일한 코드 내용(=메서드 오버라이딩 내용)을 계속해서 사용할 수 있음
        ChildA c2 = new ChildA();
        ChildA c3 = new ChildA();
        ChildA c4 = new ChildA();

        // <인터페이스 생성 방법 2>
        // 아래와 같이 익명 이너 클래스 형식으로 생성하면,
        // 방법1에서와 같이 재사용할 수 있는 클래스이름이 없으므로
        // 동일한 코드 내용(=메서드 오버라이딩 내용)을 매번 복사붙여넣기해줘야 함
        A a3 = new A(){
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
        A a4 = new A(){
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
    }
}












