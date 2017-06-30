package impl;

import essence.Company;

import javax.persistence.EntityManager;

public class CompanyImpl implements DAO<Company> {
    EntityManager entityManager;

    public CompanyImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Company obj) {
        entityManager.persist(obj);
    }

    @Override
    public Company read(long id) {
        return entityManager.find(Company.class, id);
    }

    @Override
    public Company update(long id, Company obj) {
        Company company = read(id);
        company.setCompanyName(obj.getCompanyName());
        company.setDevelopers(obj.getDevelopers());
        return company;
    }

    @Override
    public void delete(long id) {

    }
}
