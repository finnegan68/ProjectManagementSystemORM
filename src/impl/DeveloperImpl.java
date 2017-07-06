package impl;


import essence.Developer;

import javax.persistence.EntityManager;

public class DeveloperImpl implements DAO<Developer>{
    EntityManager entityManager;

    public DeveloperImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Developer developer) {
        entityManager.persist(developer);
    }

    @Override
    public Developer read(long id) {
        return entityManager.find(Developer.class, id);
    }

    @Override
    public Developer update(long id, Developer developer) {
        Developer newDeveloper = entityManager.find(Developer.class, id);
        newDeveloper.setName(developer.getName());
        newDeveloper.setAge(developer.getAge());
        newDeveloper.setCompanyId(developer.getCompanyId());
        newDeveloper.setSalary(developer.getSalary());
        newDeveloper.setSkills(developer.getSkills());
        return newDeveloper;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Developer.class, id));
    }
}
