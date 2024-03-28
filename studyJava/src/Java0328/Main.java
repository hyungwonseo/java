package Java0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Steve", "hero11", "pass"
                , LocalDate.of(1999,1,1), "steve@email.com");
        User user2 = new User("Tom", "tommy", "12345"
                , LocalDate.of(2001,2,5), "tom@email.com");
        User user3 = new User("Susie", "sue", "qwe!@"
                , LocalDate.of(1988,5,12), "susie@email.com");
        User user4 = new User("Laura", "nice", "234785923"
                , LocalDate.of(2004,11,11), "laura@email.com");
        User user5 = new User("Emily", "goodlife", "fashdkeuh"
                , LocalDate.of(2001,3,23), "emily@email.com");

        Lecture lecture1 = new Lecture(1, "Java", 100
                , "Programming", "beginner");
        Lecture lecture2 = new Lecture(2, "Spring", 150
                , "Programming", "intermediate");
        Lecture lecture3 = new Lecture(3, "Javascript", 80
                , "Programming", "beginner");

        ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("hero11", 1);
        lectureRegistrations.add(lectureRegistration1);
        LectureRegistration lectureRegistration2 = new LectureRegistration("tommy", 2);
        lectureRegistrations.add(lectureRegistration2);
        LectureRegistration lectureRegistration3 = new LectureRegistration("sue", 1);
        lectureRegistrations.add(lectureRegistration3);
        LectureRegistration lectureRegistration4 = new LectureRegistration("nice", 3);
        lectureRegistrations.add(lectureRegistration4);
        LectureRegistration lectureRegistration5 = new LectureRegistration("goodlife", 1);
        lectureRegistrations.add(lectureRegistration5);

        for(int i=0; i<lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == 1) {
                System.out.println(lectureRegistrations.get(i).getUserId());
            }
        }

    }
}








