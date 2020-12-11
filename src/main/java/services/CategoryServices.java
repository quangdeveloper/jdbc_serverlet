package services;

import model.request.CategoryRequest;

import java.util.List;

public interface CategoryServices {

    List<CategoryRequest> findAllCategory();

    List<CategoryRequest> findOneByName(String name);

    CategoryRequest insert(CategoryRequest categoryRequest);

    void update(CategoryRequest categoryRequest);

    void remove(Long id);
}
