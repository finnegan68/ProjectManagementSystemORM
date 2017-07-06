package dao;


import essence.Project;

public interface ProjectDAO {
    void create(Project project);
    Project read(long id);
    Project update(long id, Project project);
    void delete(long id);
}
