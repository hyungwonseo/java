package Java0328;

public class LectureRegistration {
    String userId;
    int lectureId;

    public LectureRegistration() {
    }

    public LectureRegistration(String userId, int lectureId) {
        this.userId = userId;
        this.lectureId = lectureId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
