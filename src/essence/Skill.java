package essence;

import javax.persistence.*;
import java.util.List;

@Entity
public class Skill {
    @Id
    @Column
    @GeneratedValue
    long id;
    @Column
    String name;
    @ManyToMany(targetEntity = Developer.class)
    List<Developer> developers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
