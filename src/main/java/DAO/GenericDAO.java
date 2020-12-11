package DAO;

import mapper.RowMapper;

import java.util.List;

public interface GenericDAO<T> {
   <T> List<T> getData(String sql, RowMapper<T> rowMapper, Object...parameter);
   void update(String sql, Object...parameter);
   Long insert(String sql, Object...parameter);

}
