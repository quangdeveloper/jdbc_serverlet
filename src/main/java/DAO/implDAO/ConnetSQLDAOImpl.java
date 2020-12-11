package DAO.implDAO;

import DAO.ConnectSQLDAO;

import java.sql.*;

public class ConnetSQLDAOImpl implements ConnectSQLDAO {

    public Connection getConnection() {
        try {
            //load driver cua mysql day
            //su dung ham co san trong java.sql.connection cung cap nhap vao chuoi ket noi cua mysql

            Class.forName("com.mysql.jdbc.Driver");
            //su dung DriverManager de lay connetion
            // su dung ham getconnection voi 3 tham so truyen vao
            // dau tien la url: duong dan toi mysql
            // thu hai la userName dung de dang nhap vao mysql
            //thu ba la password dung de dang nhap vao mysql
            String url = "jdbc:mysql://localhost:3306/quanlisach";
            String userName = "root";
            String password = "quang1998";
            return DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            return null;
        } finally {}

    }

    public void close(Connection con, PreparedStatement pre, ResultSet rs) {
        try {
            if (con != null) {
                con.close();
            }
            if (pre != null) {
                pre.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
