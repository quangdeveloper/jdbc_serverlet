package DAO;

import model.request.CategoryRequest;

import java.util.List;

public interface CategoryDAO {

    List<CategoryRequest> findAllCategory();

    List<CategoryRequest> findOneById(Long id);

    List<CategoryRequest> findOneByName(String name);

    Long insert(CategoryRequest categoryRequest);

    void remove(Long id);

    void update(CategoryRequest categoryRequest);
//    Long save(CategoryRequest categoryRequest);

}
