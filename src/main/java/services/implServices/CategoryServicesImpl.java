package services.implServices;

import DAO.implDAO.CategoryDAOIplm;
import model.request.CategoryRequest;
import services.CategoryServices;

import java.util.List;

public class CategoryServicesImpl implements CategoryServices {


    private CategoryDAOIplm categoryDAOIplm= new CategoryDAOIplm();

    @Override
    public List<CategoryRequest> findAllCategory() {
       return categoryDAOIplm.findAllCategory();
    }

    @Override
    public List<CategoryRequest> findOneByName(String name) {
        return categoryDAOIplm.findOneByName(name);
    }


    @Override
    public CategoryRequest insert(CategoryRequest categoryRequest) {
        Long id= categoryDAOIplm.insert(categoryRequest);
        return null;
    }

    @Override
    public void update(CategoryRequest categoryRequest) {
        categoryDAOIplm.update(categoryRequest);
    }

    @Override
    public void remove(Long id) {
        categoryDAOIplm.remove(id);
    }
}
