package dao;


import essence.Company;

public interface CompanyDAO {
    void create(Company company);
    Company read(long id);
    Company update(long id, Company company);
    void delete(long id);
}
