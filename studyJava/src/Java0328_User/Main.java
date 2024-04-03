package Java0328_User;

import Java0326.A;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<LectureRegistration> lectureRegistrations;
    static ArrayList<Review> reviews;
    static ArrayList<Teacher> teachers;
    static ArrayList<LectureTeacher> lectureTeachers;
    static ArrayList<FreeBoard> freeBoards;
    static ArrayList<Reply> replyArrayList;
    public static void main(String[] args) {
        // 정보 초기화
        InfoCreate.createInfos();
        reviews = new ArrayList<>();

        // 강의 ID로 수강하는 학생의 loginId 찾기
        getLoginIdByLectureId(2);
        // 유저의 loginId로 강의명 찾기
        getTitleByLoginId("hero11");
        // 강의명으로 수강생들의 이메일 찾기
        getEmailByLectureTitle("Javascript");

        boolean canAddReview = false;
        canAddReview = createReview("hero11", 1, 10, "아주 좋았어요");
        // void가 아닌 리턴형이 있는 메소드는 활용범위가 넓음. 예를 들어,
        // canAddReview의 true/false 여부에 따라 유저에게 상태 알림을 보낼 수 있음
        canAddReview = createReview("hero11", 2, 10, "아주 좋았어요2");
        canAddReview = createReview("nice", 3, 6, "보통이에요");

        // 특정 과목ID로 해당 과목을 가르치는 teacher의 이름 출력
        getTeacherNameByLectureId(1);
        getTeacherNameByLectureId(3);

        // 특정 teacher가 가르치는 과목명 리스트 출력
        getLectureTitleListByTeacherId("teacherNo1")
                .stream().forEach(System.out::println);

        // Reply 객체가 생성될때 해당 글의 객체에 있는 replies 필드에 등록
        replyArrayList = new ArrayList<>();
        Reply reply1 = new Reply("댓글 달기 1"
                , "goodlife", 1);
        if (createReply(reply1)) {
            replyArrayList.add(reply1);
        }
        Reply reply2 = new Reply("댓글 달기 2"
                , "hero11", 3);
        if (createReply(reply2)) {
            replyArrayList.add(reply2);
        }
        freeBoards.stream().forEach(System.out::println);
        for (int i=0; i<freeBoards.size(); i++) {
            freeBoards.get(i).getReplies().stream().forEach(System.out::println);
        }
    }

    // 수강등록클래스에서 lectureId로 수강생의 loginId 찾기
    // 두개의 정보가 모두 수강등록 클래스안에 있으므로 반복문을 1회만 사용해도 됨
    public static void getLoginIdByLectureId(int lectureId) {
        for(int i=0; i<lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == lectureId) {
                String loginId = lectureRegistrations.get(i).getLoginId();
                System.out.println("1. 로그인ID : " + loginId);
            }
        }
    }

    // 수강생의 loginId로 수강중인 과목명 찾기
    // 과목명은 수강등록 클래스안에 없기 때문에 수강등록 클래스에서 lectureId를 먼저 찾고
    // lectureId로 과목클래스에서 과목명을 찾아야 함. (반복문 2회 필요)
    public static void getTitleByLoginId(String loginId) {
        for (int i=0; i<lectureRegistrations.size(); i++) {
            if(lectureRegistrations.get(i).getLoginId().equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).getLectureId();
                for (int j=0; j<lectures.size(); j++) {
                    if (lectures.get(j).getLectureId() == lectureId) {
                        String title = lectures.get(j).getTitle();
                        System.out.println("2. 수강과목명 : " + title);
                    }
                }
            }
        }
    }

    // 과목명으로 수강중인 학생들의 이메일 찾기
    // 수강등록 클래스에서 관계정보를 얻으려면 해당 과목명의 lectureId를 먼저 얻어야 함(반복문1회)
    // lectureId로 수강등록 클래스에서 수강생의 loginId를 얻고 (반목문1회)
    // loginId로 유저 클래스에서 해당 유저의 이메일을 얻음(반복문1회)
    public static void getEmailByLectureTitle(String title) {
        int lectureId = -1;
        for (int i=0; i<lectures.size(); i++) {
            if (lectures.get(i).getTitle().equals(title)) {
                lectureId = lectures.get(i).getLectureId();
                break;
            }
        }
        if (lectureId < 0) {
            return; // lectureId가 -1이라면 해당 과목명의 과목이 없다는 뜻
        }
        for (int i=0; i<lectureRegistrations.size(); i++) {
            if(lectureRegistrations.get(i).getLectureId() == lectureId) {
                String loginId = lectureRegistrations.get(i).getLoginId();
                for (int j=0; j<users.size(); j++) {
                    if (users.get(j).getLoginId().equals(loginId)) {
                        String email = users.get(j).getEmail();
                        System.out.println("3. 이메일 : " + email);
                    }
                }
            }
        }
    }

    public static boolean createReview(String loginId, int lectureId
            , int rating, String text) {
        // 점수체크
        if (rating < 1 || rating > 10) {
            System.out.println("평가점수는 1~10점 사이입니다.");
            return false;
        }
        // 기존 리뷰 확인
        if (!reviews.isEmpty()) {
            for(Review review : reviews) {
               if (review.getLoginId().equals(loginId)
                       && review.getLectureId() == lectureId) {
                   System.out.println("이미 작성한 리뷰가 있습니다.");
                   return false;
               }
            }
        }
        // 수강여부 확인
        boolean canReview = false;
        for(LectureRegistration registration : lectureRegistrations) {
            if (registration.getLoginId().equals(loginId)
                    && registration.getLectureId() == lectureId) {
                canReview = true;
                break;                
            }
        }
        if (!canReview) {
            System.out.println("리뷰 작성 권한이 없습니다.");
            return false;
        }
        reviews.add(new Review(reviews.size()+1, rating, text, loginId, lectureId));
        System.out.println(reviews.toString());
        return true;
    }

    public static void getTeacherNameByLectureId(int lectureId) {
        for (int i=0; i<lectureTeachers.size(); i++) {
            if (lectureTeachers.get(i).getLectureId() == lectureId) {
                String teacherId = lectureTeachers.get(i).getTeacherId();
                for (int j=0; j<teachers.size(); j++) {
                    if (teachers.get(j).getTeacherId().equals(teacherId)) {
                        String teacherName = teachers.get(j).getName();
                        System.out.println(teacherName);
                    }
                }
            }
        }
    }

    public static List<String> getLectureTitleListByTeacherId(String teacherId) {
        List<String> lectureTitleList = new ArrayList<>();
        for (int i=0; i<lectureTeachers.size(); i++) {
            if (lectureTeachers.get(i).getTeacherId().equals(teacherId)) {
                int lectureId = lectureTeachers.get(i).getLectureId();
                for (int j=0; j<lectures.size(); j++) {
                    if (lectures.get(j).getLectureId() == lectureId) {
                        lectureTitleList.add(lectures.get(j).getTitle());
                    }
                }
            }
        }
        return lectureTitleList;
    }

    public static boolean createReply(Reply reply) {
        for (int i=0; i<Main.freeBoards.size(); i++) {
            if (Main.freeBoards.get(i).getFreeBoardId() == reply.getFreeBoardId()) {
                FreeBoard freeBoard = Main.freeBoards.get(i);
                freeBoard.setReplies(reply);
                return true;
            }
        }
        return false;
    }
}








