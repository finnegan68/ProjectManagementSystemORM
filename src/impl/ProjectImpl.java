package impl;


import dao.ProjectDAO;
import essence.Developer;
import essence.Project;

import javax.persistence.EntityManager;

public class ProjectImpl implements ProjectDAO{
    EntityManager entityManager;

    public ProjectImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Project project) {
        entityManager.persist(project);
    }

    @Override
    public Project read(long id) {
        return entityManager.find(Project.class, id);
    }

    @Override
    public Project update(long id, Project project) {
        Project newProject = entityManager.find(Project.class, id);
        newProject.setName(project.getName());
        newProject.setCompanyId(project.getCompanyId());
        newProject.setCost(project.getCost());
        return newProject;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Project.class, id));
    }
}
