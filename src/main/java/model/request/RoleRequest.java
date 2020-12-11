package model.request;


import java.sql.Timestamp;

public class RoleRequest extends BaseRequest {
    private String name;
    private String code;

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

    public RoleRequest(Long id, Timestamp createDate, Timestamp modifiedDate, String createBy, String modifiedBy, String name, String code) {
        super(id, createDate, modifiedDate, createBy, modifiedBy);
        this.name = name;
        this.code = code;
    }
}
