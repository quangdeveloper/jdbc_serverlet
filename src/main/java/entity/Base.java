package entity;

import java.sql.Timestamp;

public abstract class Base {
    private Long id;
    private Timestamp createDate;
    private Timestamp modifiedDate;
    private String createBy;
    private  String modifiedBy;

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Base(Long id, Timestamp createDate, Timestamp modifiedDate, String createBy, String modifiedBy) {
        this.id = id;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
        this.createBy = createBy;
        this.modifiedBy = modifiedBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Base(Long id) {
        this.id = id;
    }
}
