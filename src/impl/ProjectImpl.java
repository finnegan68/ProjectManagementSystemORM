package impl;


import essence.Developer;
import essence.Project;

import javax.persistence.EntityManager;

public class ProjectImpl implements DAO<Project>{
    EntityManager entityManager;

    public ProjectImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Project obj) {
        entityManager.persist(obj);
    }

    @Override
    public Project read(long id) {
        return entityManager.find(Project.class, id);
    }

    @Override
    public Project update(long id, Project obj) {
        Project prj = entityManager.find(Project.class, id);
        prj.setName(obj.getName());
        prj.setCompanyId(obj.getCompanyId());
        prj.setCost(obj.getCost());
        return prj;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Developer.class, id));
    }
}
