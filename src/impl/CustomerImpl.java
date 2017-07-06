package impl;


import dao.CustomerDAO;
import essence.Customer;

import javax.persistence.EntityManager;

public class CustomerImpl implements CustomerDAO{
    EntityManager entityManager;

    public CustomerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public Customer read(long id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public Customer update(long id, Customer customer) {
        Customer newCustomer = read(id);
        newCustomer.setCustomerName(customer.getCustomerName());
        newCustomer.setProjectId(customer.getProjectId());
        return newCustomer;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Customer.class, id));
    }
}
