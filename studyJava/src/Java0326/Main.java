package Java0326;

public class Main {
    public static void main(String[] args) {
        ChildA a = new ChildA();
        a.abc();
        a.bcd();
        //A.a = 100; // 오류 A.a는 상수임
        System.out.println(A.a);
        System.out.println(B.a);
    }
}
