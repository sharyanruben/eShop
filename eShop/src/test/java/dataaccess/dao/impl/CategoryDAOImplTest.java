package dataaccess.dao.impl;

import model.Category;
import org.hibernate.Session;
import org.junit.Test;
import util.HibernateUtil;

import static org.junit.Assert.*;

/**
 * Created by forjava on 11/28/2016.
 */
public class CategoryDAOImplTest {
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Test
    public void createTest() {
        Category category = new Category();
        category.setName("My Category");
        category.setParent_id(2);
        session.beginTransaction();
        session.save(category);
        session.getTransaction().commit();
        System.out.println(category.getId());

        Category category1 = (Category) session.get(Category.class, category.getId());
        assertEquals(category1, new Object());

    }
}
