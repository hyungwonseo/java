package Java0401Generic;

class A {}
class B extends A {}
class C extends B {}

class D<T extends B> {
    // <T>는 모든 클래스가 올 수 있으나
    // <T extends B>는 B와 B의 자식만 올 수 있음!!!! (A는 안되고 B,C는 됨)
    private T t;
    public T get() {return t;}
    public void set(T t) {this.t = t;}
}

public class GenericExtends {
    public static void main(String[] args) {
        // D<A> d1 = new D<A>(); // A클래스는 D의 제네릭T 범위안에 없음
        D<B> d2 = new D<>();
        D<C> d3 = new D<>();
        D d4 = new D(); // <B>를 생략한 문법 D<B> d4 = new D<>();

        d2.set(new B());
        d2.set(new C());
        // d3.set(new B()); // C만 받을 수 있음
        d3.set(new C());
        d4.set(new B());
        d4.set(new C());
    }
}












