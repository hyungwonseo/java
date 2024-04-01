package Java0401Generic;

class MyClass<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}
public class Main1 {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<String>(); // 클래스의 생성단계
        mc1.set("안녕"); // 생성단계에서 자료형을 결정했기때문에 입력단계에서 특정 자료형만 받음
        System.out.println(mc1.get());

        MyClass<Integer> mc2 = new MyClass<>(); // Integer는 int자료형의 wrapper 클래스
        mc2.set(100);
        System.out.println(mc2.get());
    }
}










