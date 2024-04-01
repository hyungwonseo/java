package Java0401Generic;

class MyClassABC<A,B,C> {
    private A a;
    private B b;
    private C c;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
public class Main3 {
    public static void main(String[] args) {
        // 3개의 제네릭클래스를 사용하는 예제
        MyClassABC<String, Integer, Double> abc = new MyClassABC<>();
        abc.setA("3개의 제네릭");
        abc.setB(500);
        abc.setC(5.5);

        System.out.println(abc.getA() + " " + abc.getB() + " " + abc.getC());
    }
}













