package Java0328_User;

public class Reply {
    private int replyId;
    private String content;
    private String loginId;
    private int freeBoardId;

    public Reply() {
    }

    public Reply(int replyId, String content, String loginId, int freeBoardId) {
        this.replyId = replyId;
        this.content = content;
        this.loginId = loginId;
        this.freeBoardId = freeBoardId;
    }

    public Reply(String content, String loginId, int freeBoardId) {
        this(Main.replyArrayList.size()+1, content, loginId, freeBoardId);
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    @Override
    public String toString() {
        return replyId + ", " + content + ", " + loginId + ", " + freeBoardId;
    }
}
