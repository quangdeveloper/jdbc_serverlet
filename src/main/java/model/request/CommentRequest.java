package model.request;

import entity.Base;

import java.sql.Timestamp;

public class CommentRequest extends BaseRequest{
    private  String content;
    private  Long userID;
    private Long newsID;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getNewsID() {
        return newsID;
    }

    public void setNewsID(Long newsID) {
        this.newsID = newsID;
    }

    public CommentRequest(Long id, Timestamp createDate, Timestamp modifiedDate, String createBy, String modifiedBy, String content, Long userID, Long newsID) {
        super(id, createDate, modifiedDate, createBy, modifiedBy);
        this.content = content;
        this.userID = userID;
        this.newsID = newsID;
    }
}
