package Java0326;

public class ChildA extends Object implements A, B {
    @Override
    public void abc() {
        System.out.println("child of A");
    }

    @Override
    public void bcd() {
        System.out.println("Child of B");
    }
}
