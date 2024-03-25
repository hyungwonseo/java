package Java0325;

public class JavaChild extends JavaAbstract{
    public JavaChild() {
        super();
    }
    public JavaChild(int a, String b) {
        super(a, b);
    }
    @Override
    public String getString() {
        return "이것은 자식 클래스";
    }
}
