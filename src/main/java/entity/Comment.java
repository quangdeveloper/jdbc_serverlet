package entity;

import java.sql.Timestamp;

public class Comment extends Base {
    private String contenr;
    private  Long userID;
    private Long newsID;

    public String getContenr() {
        return contenr;
    }

    public void setContenr(String contenr) {
        this.contenr = contenr;
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

    public Comment(Long id, Timestamp createDate, Timestamp modifiedDate, String createBy, String modifiedBy, String contenr, Long userID, Long newsID) {
        super(id, createDate, modifiedDate, createBy, modifiedBy);
        this.contenr = contenr;
        this.userID = userID;
        this.newsID = newsID;
    }

    public Comment(Long id, String contenr, Long userID, Long newsID) {
        super(id);
        this.contenr = contenr;
        this.userID = userID;
        this.newsID = newsID;
    }
}
