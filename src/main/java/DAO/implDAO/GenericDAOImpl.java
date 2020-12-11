package DAO.implDAO;

import DAO.GenericDAO;
import mapper.RowMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenericDAOImpl<T> extends ConnetSQLDAOImpl implements GenericDAO<T> {

    //dung khi lay du lieu tu bang
    @Override
    public <T> List<T> getData(String sql, RowMapper<T> rowMapper, Object... parameter) {
        List<T> results = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            setParameter(statement, parameter);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                results.add(rowMapper.mapRow(resultSet));
            }
            return results;
        } catch (SQLException ex) {
            return null;
        } finally {
            close(connection, statement, resultSet);
            return null;
        }
    }
// dung  khi update va delete du lieu tren bang
    @Override
    public void update(String sql, Object... parameter) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            setParameter(statement, parameter);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            close(connection, statement, null);
        }
    }



    //dung cho insert du lieu vao bang
    @Override
    public Long insert(String sql, Object... parameter) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Long id = null;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            setParameter(statement, parameter);
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getLong(1);
            }
            connection.commit();
            return id;
        } catch (SQLException ex) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return null;
        } finally {
            close(connection, statement, resultSet);
        }
    }

    // ham setparameter() de gan  gia tri cho cac tham so trong statement theo vi tri
    // cac tham so ( index start: 1)
    private void setParameter(PreparedStatement statement, Object... parameter) {
        try {
            for (int i = 0; i < parameter.length; i++) {
                Object para = parameter[i];
                int index = i + 1;
                //kiem tra neu tham so la kieu Long
                if (para instanceof Long) {
                    statement.setLong(index, (Long) para);
                }
                //kiem tra neu tham so la kieu Integer
                else if (para instanceof Integer) {
                    statement.setInt(index, (Integer) para);
                }
                //kiem tra new tham so truyen vao la kieu Double
                else if (para instanceof Double) {
                    statement.setDouble(index, (Double) para);
                }
                //kiem tra neu tham so la kieu String
                else if (para instanceof String) {
                    statement.setString(index, (String) para);
                }
                //kiem tra neu tham so la kieu Timestamp
                else if (para instanceof Timestamp) {//
                    statement.setTimestamp(index, (Timestamp) para);
                }
                //kiem tra neu tham so la kieu Boolean
                else if (para instanceof Boolean) {
                    statement.setBoolean(index, (Boolean) para);
                }
                //neu tham so la null
                else {
                    statement.setNull(index, 0);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
