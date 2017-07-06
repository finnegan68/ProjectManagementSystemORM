package impl;

import dao.CompanyDAO;
import essence.Company;

import javax.persistence.EntityManager;

public class CompanyImpl implements CompanyDAO {
    EntityManager entityManager;

    public CompanyImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Company company) {
        entityManager.persist(company);
    }

    @Override
    public Company read(long id) {
        return entityManager.find(Company.class, id);
    }

    @Override
    public Company update(long id, Company company) {
        Company newCompany = read(id);
        newCompany.setCompanyName(company.getCompanyName());
        newCompany.setDevelopers(company.getDevelopers());
        return newCompany;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Company.class, id));
    }
}
