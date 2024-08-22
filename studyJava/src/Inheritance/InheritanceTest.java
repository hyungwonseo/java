package Inheritance;

class Parent {
    public int number = 1;
    public void getNumber() {
        System.out.println("parent");
    }
}
class Child extends Parent {
    public int number = 2;
    public void getNumber() {
        System.out.println("child");
    }
}

class OldObject {
    public static String name = "old";
    public static void print() {
        System.out.println("old print");
    }
}

class NewObject extends OldObject {
    public static String name = "new";
    public static void print() {
        System.out.println("new print");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        // 아래의 문제들은 상속관계의 두 클래스간에 필드와 메서드가 메모리에 어떻게 존재하는가를 묻는 것입니다.
        // 오버라이딩이란, 메모리상에 존재하는 부모가 가진 동일한 이름의 메서드를 재정의하는 것으로
        // 실제로 덮어쓰는 것이 아닌 메모리상의 참조만 변경해서 자식 메서드가 호출되도록 하는 것입니다.

        // 1. 서로 다른 인스턴스 필드 문제
        Parent p = new Parent();
        Child c = new Child();
        Parent castedP = new Child();
        System.out.println(p.number); // 1
        System.out.println(c.number); // 2
        System.out.println(castedP.number); // 1

        // 2. 인스턴스 메서드 오버라이딩 문제
        p.getNumber(); // parent
        c.getNumber(); // child
        castedP.getNumber(); // child

        // 3. 정적 필드 중복 문제
        OldObject oldObj = new OldObject();
        NewObject newObj = new NewObject();
        OldObject castedOld = new NewObject();
        System.out.println(oldObj.name); // old
        System.out.println(newObj.name); // new
        System.out.println(castedOld.name); // old

        // 4. 정적 메서드 중복 문제
        oldObj.print(); // old print
        newObj.print(); // new print
        castedOld.print(); // old print
    }
}
