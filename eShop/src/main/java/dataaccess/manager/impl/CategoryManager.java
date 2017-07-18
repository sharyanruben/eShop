package dataaccess.manager.impl;

import dataaccess.dao.impl.CategoryDAOImpl;
import dataaccess.manager.ICategoryManager;
import model.Category;

import java.util.*;

public class CategoryManager implements ICategoryManager {
    CategoryDAOImpl categoryDAO;

    public CategoryManager() {
        categoryDAO = new CategoryDAOImpl();
    }

    public void create(Category category) {
        categoryDAO.create(category);
    }

    public Category getEntityByID(int id) {
        return categoryDAO.getEntityByID(id);
    }

    public List<Category> getAll() {
        return categoryDAO.getAll();
    }

    public void update(Category entity) {
        categoryDAO.update(entity);
    }

    public void delete(Category entity) {
        categoryDAO.delete(entity);
    }

    //return all categories with his sub categories
    public Map<Category, List<Category>> getCategories() {
        int mainParentId = 0;

        Map<Category, List<Category>> allCategories = new HashMap<>();


        List<Category> mainCategories = categoryDAO.getCategoriesByParentId(mainParentId);


        System.out.println(mainCategories);
        for (Category mainCategory : mainCategories) {
            allCategories.put(mainCategory, categoryDAO.getCategoriesByParentId(mainCategory.getId()));
        }
        return allCategories;
    }
}
