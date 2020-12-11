package model.request;

import java.sql.Timestamp;

public class UserRequest extends BaseRequest {

    private String userName;
    private String password;
    private String fullName;
    private int status;
    private Long roleID;

    public UserRequest(Long id, Timestamp createDate, Timestamp modifiedDate, String createBy, String modifiedBy, String userName, String password, String fullName, int status, Long roleID) {
        super(id, createDate, modifiedDate, createBy, modifiedBy);
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
        this.roleID = roleID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }


}
