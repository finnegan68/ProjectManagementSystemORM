package impl;



import dao.SkillDAO;
import essence.Skill;

import javax.persistence.EntityManager;

public class SkillImpl implements SkillDAO {
    EntityManager entityManager;

    public SkillImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Skill skill) {
        entityManager.persist(skill);
    }

    @Override
    public Skill read(long id) {
        return entityManager.find(Skill.class, id);
    }

    @Override
    public Skill update(long id, Skill skill) {
        Skill newSkill = entityManager.find(Skill.class, id);
        newSkill.setName(skill.getName());
        newSkill.setDevelopers(skill.getDevelopers());
        return newSkill;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Skill.class, id));
    }
}
