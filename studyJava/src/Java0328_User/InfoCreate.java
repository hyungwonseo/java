package Java0328_User;

import Java0326.A;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfos() {
        Main.users = new ArrayList<>();
        Main.users.add(new User("Steve", "hero11", "pass"
                , LocalDate.of(1999,1,1), "steve@email.com"));
        Main.users.add(new User("Tom", "tommy", "12345"
                , LocalDate.of(2001,2,5), "tom@email.com"));
        Main.users.add(new User("Susie", "sue", "qwe!@"
                , LocalDate.of(1988,5,12), "susie@email.com"));
        Main.users.add(new User("Laura", "nice", "234785923"
                , LocalDate.of(2004,11,11), "laura@email.com"));
        Main.users.add(new User("Emily", "goodlife", "fashdkeuh"
                , LocalDate.of(2001,3,23), "emily@email.com"));

        Main.lectures = new ArrayList<>();
        Main.lectures.add(new Lecture(1, "Java", 100
                , LectureCategory.PROGRAMMING, "beginner"));
        Main.lectures.add(new Lecture(2, "Spring", 150
                , LectureCategory.PROGRAMMING, "intermediate"));
        Main.lectures.add(new Lecture(3, "Javascript", 80
                , LectureCategory.PROGRAMMING, "beginner"));
        Main.lectures.add(new Lecture(4, "Blender1", 300
                , LectureCategory.fromString("modeling3d"), "beginner"));

        Main.lectureRegistrations = new ArrayList<>();
        Main.lectureRegistrations.add(new LectureRegistration("hero11", 1));
        Main.lectureRegistrations.add(new LectureRegistration("hero11", 2));
        Main.lectureRegistrations.add(new LectureRegistration("hero11", 3));
        Main.lectureRegistrations.add(new LectureRegistration("tommy", 2));
        Main.lectureRegistrations.add(new LectureRegistration("sue", 1));
        Main.lectureRegistrations.add(new LectureRegistration("nice", 3));
        Main.lectureRegistrations.add(new LectureRegistration("goodlife", 1));

        Main.teachers = new ArrayList<>();
        Main.teachers.add(new Teacher("teacherNo1", "Michael"));
        Main.teachers.add(new Teacher("teacherNo2", "Adrian"));

        Main.lectureTeachers = new ArrayList<>();
        Main.lectureTeachers.add(new LectureTeacher("teacherNo1", 1));
        Main.lectureTeachers.add(new LectureTeacher("teacherNo1", 2));
        Main.lectureTeachers.add(new LectureTeacher("teacherNo2", 3));
        Main.lectureTeachers.add(new LectureTeacher("teacherNo2", 4));

        Main.freeBoards = new ArrayList<>();
        Main.freeBoards.add(new FreeBoard(1, "게시글 1"
                , "게시판을 이용합시다", "tommy"));
        Main.freeBoards.add(new FreeBoard(2, "게시글 2"
                , "글이 너무 없네요", "sue"));
        Main.freeBoards.add(new FreeBoard(3, "게시글 3"
                , "너무 배고프다", "nice"));
    }
}












