package Java0315.example;

class Temp1 {
    int a = 5;
}
public class exampleObject {
    public static void main(String[] args) {
        Temp1 t1 = new Temp1();
        method1(t1);
        System.out.println(t1.a);
    }

    static void method1(Object x) {
        Temp1 t2 = new Temp1();
        t2 = (Temp1) x;
        t2.a = 10;
    }
}
