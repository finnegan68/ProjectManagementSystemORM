package dao;


import essence.Customer;

public interface CustomerDAO {
    void create(Customer customer);
    Customer read(long id);
    Customer update(long id, Customer customer);
    void delete(long id);
}
