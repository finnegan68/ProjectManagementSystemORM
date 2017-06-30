package impl;



import essence.Skill;

import javax.persistence.EntityManager;

public class SkillImpl implements DAO<Skill> {
    EntityManager entityManager;

    public SkillImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Skill obj) {
        entityManager.persist(obj);
    }

    @Override
    public Skill read(long id) {
        return entityManager.find(Skill.class, id);
    }

    @Override
    public Skill update(long id, Skill obj) {
        Skill skill = entityManager.find(Skill.class, id);
        skill.setName(obj.getName());
        skill.setDevelopers(obj.getDevelopers());
        return skill;
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Skill.class, id));
    }
}
