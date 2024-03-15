package Java0315;
abstract class Animal {
    abstract void cry();  // 추상메서드
}
class Cat extends Animal {
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

class Bird extends Animal {
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}
public class StudyAbstract {
    public static void main(String[] args) {
        //#1. 객체생성
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();

        //#2. 메서드 호출
        cat.cry(); //야옹
        dog.cry(); //멍멍
        bird.cry();
    }
}
