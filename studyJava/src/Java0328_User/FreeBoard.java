package Java0328_User;

import java.util.ArrayList;
import java.util.List;

public class FreeBoard {
    private int freeBoardId;
    private String title;
    private String content;
    private String loginId;
    private List<Reply> replies = new ArrayList<>();

    public FreeBoard() {
    }

    public FreeBoard(int freeBoardId, String title, String content, String loginId) {
        this.freeBoardId = freeBoardId;
        this.title = title;
        this.content = content;
        this.loginId = loginId;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public void setReplies(Reply reply) {
        replies.add(reply);
    }

    @Override
    public String toString() {
        return title + ", " + content + ", " + loginId;
    }
}
