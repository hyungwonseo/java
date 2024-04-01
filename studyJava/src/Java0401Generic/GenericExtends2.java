package Java0401Generic;

class E {}
class F extends E {}
class G extends F {}
class H extends G {}

class Goods2<T> {
    private T t;
    public T get() {return t;}
    public void set(T t) {this.t = t;}
}
public class GenericExtends2 {
    public static void main(String[] args) {

    }
}
