package mapper.mapperImpl;


import mapper.RowMapper;
import model.request.CategoryRequest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<CategoryRequest> {
    @Override
    public CategoryRequest mapRow(ResultSet resultSet) {
        try {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String code = resultSet.getString("code");
            CategoryRequest category =
                    new CategoryRequest(id, null, null, null, null, name, code);
            return  category;

        }catch (SQLException ex){

            return  null;
        }
    }


}
