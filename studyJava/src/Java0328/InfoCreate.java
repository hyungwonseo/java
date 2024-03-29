package Java0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfos(ArrayList<User> users, ArrayList<Lecture> lectures
            , ArrayList<LectureRegistration> lectureRegistrations) {
        users = new ArrayList<>();
        users.add(new User("Steve", "hero11", "pass"
                , LocalDate.of(1999,1,1), "steve@email.com"));
        users.add(new User("Tom", "tommy", "12345"
                , LocalDate.of(2001,2,5), "tom@email.com"));
        users.add(new User("Susie", "sue", "qwe!@"
                , LocalDate.of(1988,5,12), "susie@email.com"));
        users.add(new User("Laura", "nice", "234785923"
                , LocalDate.of(2004,11,11), "laura@email.com"));
        users.add(new User("Emily", "goodlife", "fashdkeuh"
                , LocalDate.of(2001,3,23), "emily@email.com"));

        lectures = new ArrayList<>();
        lectures.add(new Lecture(1, "Java", 100
                , "Programming", "beginner"));
        lectures.add(new Lecture(2, "Spring", 150
                , "Programming", "intermediate"));
        lectures.add(new Lecture(3, "Javascript", 80
                , "Programming", "beginner"));

        lectureRegistrations = new ArrayList<>();
        lectureRegistrations.add(new LectureRegistration("hero11", 1));
        lectureRegistrations.add(new LectureRegistration("hero11", 2));
        lectureRegistrations.add(new LectureRegistration("hero11", 3));
        lectureRegistrations.add(new LectureRegistration("tommy", 2));
        lectureRegistrations.add(new LectureRegistration("sue", 1));
        lectureRegistrations.add(new LectureRegistration("nice", 3));
        lectureRegistrations.add(new LectureRegistration("goodlife", 1));
    }
}
