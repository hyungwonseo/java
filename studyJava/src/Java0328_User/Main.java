package Java0328_User;

import java.util.ArrayList;

public class Main {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<LectureRegistration> lectureRegistrations;
    public static void main(String[] args) {
        // 정보 초기화
        InfoCreate.createInfos();

        // 강의 ID로 수강하는 학생의 loginId 찾기
        getLoginIdByLectureId(2);
        // 유저의 loginId로 강의명 찾기
        getTitleByLoginId("hero11");
        // 강의명으로 수강생들의 이메일 찾기
        getEmailByLectureTitle("Javascript");
    }

    // 수강등록클래스에서 lectureId로 수강생의 loginId 찾기
    // 두개의 정보가 모두 수강등록 클래스안에 있으므로 반복문을 1회만 사용해도 됨
    public static void getLoginIdByLectureId(int lectureId) {
        for(int i=0; i<lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == lectureId) {
                System.out.println("1. 로그인ID : "
                        + lectureRegistrations.get(i).getLoginId());
            }
        }
    }

    // 수강생의 loginId로 수강중인 과목명 찾기
    // 과목명은 수강등록 클래스안에 없기 때문에 수강등록 클래스에서 lectureId를 먼저 찾고
    // lectureId로 과목클래스에서 과목명을 찾아야 함. (반복문 2회 필요)
    public static void getTitleByLoginId(String loginId) {
        for (int i=0; i<lectureRegistrations.size(); i++) {
            if(lectureRegistrations.get(i).getLoginId().equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).lectureId;
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
}








