package dataaccess.dao.impl;

import dataaccess.dao.ICountryDAO;
import model.Country;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class CountryDAOImpl implements ICountryDAO {
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public void create(Country country) {

    }

    @Override
    public Country getEntityByID(int id) {
        return (Country) session.get(Country.class, id);
    }

    @Override
    public List<Country> getAll() {
        return session.createCriteria(Country.class).list();
    }

    @Override
    public void update(Country entity) {

    }

    @Override
    public void delete(Country entity) {

    }
}
