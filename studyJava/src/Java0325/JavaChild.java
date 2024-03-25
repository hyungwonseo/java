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

    public void setValue(int a) {
        super.setValue(a);
    }

    public void setString(String b) {
        super.setString(b);
    }
}









