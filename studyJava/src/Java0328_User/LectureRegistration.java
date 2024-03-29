package Java0328_User;

public class LectureRegistration {
    String loginId;
    int lectureId;

    public LectureRegistration() {
    }

    public LectureRegistration(String loginId, int lectureId) {
        this.loginId = loginId;
        this.lectureId = lectureId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setUserId(String userId) {
        this.loginId = userId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
