package dao.implDAO;

import dao.CategoryDAO;
import mapper.mapperImpl.CategoryMapper;
import model.request.CategoryRequest;

import java.util.List;

public class CategoryDAOIplm extends GenericDAOImpl<CategoryRequest> implements CategoryDAO {


    @Override
    public List<CategoryRequest> findAllCategory() {
        String sql = "select* from category";
        return getData(sql, new CategoryMapper());
    }

    @Override
    public List<CategoryRequest> findOneById(Long id) {
        String sql = "select* from category where id = ?";
        return getData(sql, new CategoryMapper(), id);
    }

    @Override
    public List<CategoryRequest> findOneByName(String name) {
        String sql = "select* from category \n" +
                "where name like %?% ";
        return getData(sql, new CategoryMapper(),name);
    }


    @Override
    public Long insert(CategoryRequest categoryRequest) {
        String sql = "insert into category(id,name,code,created_date,modified_date,created_by,modified_by)" +
                " values (?,?,?,?,?,?,?)";
        Long id = insert(sql, categoryRequest.getId(), categoryRequest.getName(), categoryRequest.getCode(),
                categoryRequest.getCreatedDate(), categoryRequest.getModifiedDate(),
                categoryRequest.getCreatedBy(), categoryRequest.getModifiedBy());

        return id;
    }

    @Override
    public void remove(Long id) {
        String sql = "delete from category where id = ?";
        update(sql, id);

    }

    @Override
    public void update(CategoryRequest categoryRequest) {
        String sql = " update category " +
                "set name = ?, code = ?, created_date = ?, modified_date = ?, " +
                "created_by = ?, modified_by = ? where id = ?";
        update(sql,  categoryRequest.getName(), categoryRequest.getCode(),
                categoryRequest.getCreatedDate(), categoryRequest.getModifiedDate(),
                categoryRequest.getCreatedBy(), categoryRequest.getModifiedBy(),categoryRequest.getId());
    }
}
