package Java0325;

public class Example {
    public static void main(String[] args) {
        // 첫번째 미션
        // 아래 코드가 실행될 수 있도록 Students 클래스를 완성하시오
        // 힌트 : 세터메서드를 만들어야함. toString()는 오버라이딩 필요.
        Students students0 = new Students();
        students0.setName("Steve");
        students0.setDepartment("Physics");
        students0.setStudentId(10001);
        System.out.println(students0.toString()); // Steve, Physics, 10001

        // 두번째 미션
        // 아래 메서드를 완성하시오
        // 주어진 배열을 이용하여 Students타입의 배열을 만들고 for문으로 출력해야함
        createStudentsInfo();
    }

    public static void createStudentsInfo() {
        String[] names = {"Steve", "tom", "Laura", "Susie"};
        String[] departments = {"Physics", "Computer", "English", "Law"};
        int[] studentsIds = {10001, 10002, 10003, 10004};
        // 데이터베이스의 raw data(가공하지 않은 순수 데이터)를
        // Students 객체형태로 만들고 이를 배열에 담는다.
        Students[] students = new Students[names.length];
        for(int i=0; i< names.length; i++) {
            //students[i] = new Students(names[i], departments[i], studentsIds[i]);
            students[i] = new Students();
            students[i].setName(names[i]);
            students[i].setDepartment(departments[i]);
            students[i].setStudentId(studentsIds[i]);
            System.out.println(students[i].toString());
        }
    }
}









