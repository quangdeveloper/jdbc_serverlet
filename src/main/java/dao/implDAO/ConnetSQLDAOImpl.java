package dao.implDAO;

import dao.ConnectSQLDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import resource.Properties;

import java.sql.*;

public class ConnetSQLDAOImpl implements ConnectSQLDAO {

    private static Logger logger = LoggerFactory.getLogger(ConnectSQLDAO.class);

    public Connection getConnection() {
        try {
            Class.forName(Properties.CLASS_FOR_NAME);
            String url = Properties.URL;
            String userName = Properties.USERNAME;
            String password = Properties.PASSWORD;
            return DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException ex) {
            logger.error("Exception: ", ex);
            return null;
        }
    }

    public void close(Connection con, PreparedStatement pre, ResultSet rs) {
        try {
            if (con != null) {
                con.close();
                logger.info("Close connection DB");
            }
            if (pre != null) {
                pre.close();
                logger.info("Close prepare statement");
            }
            if (rs != null) {
                rs.close();
                logger.info("Close result set statement");
            }
        } catch (SQLException ex) {
            logger.error("Exception: ", ex);
        }
    }

}
