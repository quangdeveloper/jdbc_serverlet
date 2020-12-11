package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface ConnectSQLDAO {
     Connection getConnection();//lay connection

     //dong ket noi an toan khi su dung xong
     void close(Connection con, PreparedStatement pre, ResultSet rs);
}
