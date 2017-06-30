package impl;


import essence.Customer;

import javax.persistence.EntityManager;

public class CustomerImpl implements DAO<Customer>{
    EntityManager entityManager;

    public CustomerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Customer obj) {
        entityManager.persist(obj);
    }

    @Override
    public Customer read(long id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public Customer update(long id, Customer obj) {
        Customer customer = read(id);
        customer.setCustomerName(obj.getCustomerName());
        customer.setProjectId(obj.getProjectId());
        return customer;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(id);
    }
}
