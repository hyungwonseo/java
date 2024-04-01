package Java0328_User;

public class Review {
    private int reviewId;
    private int rating; // 1점 ~ 10점
    private String text;
    private String loginId;
    private int lectureId;

    public Review() {
    }

    public Review(int reviewId, int rating, String text, String loginId, int lectureId) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.text = text;
        this.loginId = loginId;
        this.lectureId = lectureId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    @Override
    public String toString() {
        return "(" + reviewId + ": " + rating + ": " + text
                + ": " + loginId + ": " + lectureId + ")";
    }
}
