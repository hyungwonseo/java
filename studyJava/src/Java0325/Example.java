package Java0325;

public class Example {
    public static void main(String[] args) {
        Students students0 = new Students();
        students0.setName("Steve");
        students0.setDepartment("Physics");
        students0.setStudentId(10001);
        System.out.println(students0.toString()); // Steve, Physics, 10001\

        createStudentsInfo();
    }

    public static void createStudentsInfo() {
        String[] names = {"Steve", "tom", "Laura", "Susie"};
        String[] departments = {"Physics", "Computer", "English", "Law"};
        int[] studentsIds = {10001, 10002, 10003, 10004};
        
    }
}
