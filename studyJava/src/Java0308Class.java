public class Java0308Class {
    public static void main(String[] args) {
        Students tom = new Students("Tom", 18, "Daejeon", "123456");
        Students steve = new Students("Steve", 25, "Seoul", "246810");
        Students paul = new Students();
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");
        tom.displayAll();
        steve.displayAll();
        paul.displayAll();
        System.out.println(tom.getPersonalNum());
    }
}
