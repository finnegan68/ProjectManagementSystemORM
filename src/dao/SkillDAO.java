package dao;


import essence.Skill;

public interface SkillDAO {
    void create(Skill skill);
    Skill read(long id);
    Skill update(long id, Skill skill);
    void delete(long id);
}
