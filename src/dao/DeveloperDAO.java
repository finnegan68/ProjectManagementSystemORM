package dao;


import essence.Developer;

public interface DeveloperDAO {
    void create(Developer developer);
    Developer read(long id);
    Developer update(long id, Developer developer);
    void delete(long id);
}
