package Java0326;

public interface A {
    int a = 10;  // public static final 생략 가능!!
    // 인터페이스는 추상메서드(미완성메서드)로 이루어져 있음
    // 인터페이스는 기본적으로 양방통신을 목적으로 만들어졌기 때문에 public 사용
    void abc();  // public abstract 생략 가능!!
}
