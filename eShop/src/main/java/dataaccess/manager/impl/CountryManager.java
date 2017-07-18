package dataaccess.manager.impl;

import dataaccess.dao.impl.CountryDAOImpl;
import dataaccess.manager.ICountryManager;
import model.Country;

import java.util.List;

public class CountryManager implements ICountryManager {
    CountryDAOImpl countryDAO = new CountryDAOImpl();

    @Override
    public void create(Country country) {

    }

    @Override
    public Country getEntityByID(int id) {
        return countryDAO.getEntityByID(id);
    }

    @Override
    public List<Country> getAll() {
        return countryDAO.getAll();
    }

    @Override
    public void update(Country entity) {

    }

    @Override
    public void delete(Country entity) {

    }
}
