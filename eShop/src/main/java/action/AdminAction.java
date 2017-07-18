package action;

import dataaccess.manager.impl.CategoryManager;
import model.Category;

import java.util.List;
import java.util.Map;

public class AdminAction extends BaseAction {
    private List<Category> allCategories;
    private Map<Category, List<Category>> categories;
    CategoryManager categoryManager = new CategoryManager();

    @Override

    public String execute() throws Exception {
//        categories = categoryManager.getCategories();
//        allCategories = categoryManager.getAll();
        return SUCCESS;
    }

    public List<Category> getAllCategories() {
        return allCategories;
    }

    public void setAllCategories(List<Category> allCategories) {
        this.allCategories = allCategories;
    }

    public Map<Category, List<Category>> getCategories() {
        return categories;
    }

    public void setCategories(Map<Category, List<Category>> categories) {
        this.categories = categories;
    }
}
