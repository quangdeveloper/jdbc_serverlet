package entity;

import java.sql.Timestamp;

public class News extends Base {
    private String title;
    private  String thumbnail;
    private String shortDescription;
    private String content;
    private Long categoryID;

    public News(Long id, Timestamp createDate, Timestamp modifiedDate, String createBy,
                String modifiedBy, String title, String thumbnail, String shortDescription,
                String content, Long categoryID) {

        super(id, createDate, modifiedDate, createBy, modifiedBy);
        this.title = title;
        this.thumbnail = thumbnail;
        this.shortDescription = shortDescription;
        this.content = content;
        this.categoryID = categoryID;
    }

    public News(Long id, String title, String thumbnail, String shortDescription, String content,
                Long categoryID) {

        super(id);
        this.title = title;
        this.thumbnail = thumbnail;
        this.shortDescription = shortDescription;
        this.content = content;
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }
}
