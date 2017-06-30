package impl;


import essence.Developer;

import javax.persistence.EntityManager;

public class DeveloperImpl implements DAO<Developer>{
    EntityManager entityManager;

    public DeveloperImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Developer obj) {
        entityManager.persist(obj);
    }

    @Override
    public Developer read(long id) {
        return entityManager.find(Developer.class, id);
    }

    @Override
    public Developer update(long id, Developer obj) {
        Developer dev = entityManager.find(Developer.class, id);
        dev.setName(obj.getName());
        dev.setAge(obj.getAge());
        dev.setCompanyId(obj.getCompanyId());
        dev.setSalary(obj.getSalary());
        dev.setSkills(obj.getSkills());
        return dev;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Developer.class, id));
    }
}
