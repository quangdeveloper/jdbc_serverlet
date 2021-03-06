package entity;

import java.sql.Timestamp;

public class Category extends Base {

    private String name;

    private String code;

    public Category(Long id, Timestamp createDate, Timestamp modifiedDate, String createBy, String modifiedBy, String name, String code) {
        super(id, createDate, modifiedDate, createBy, modifiedBy);
        this.name = name;
        this.code = code;
    }

    public Category(Long id, String name, String code) {
        super(id);
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
