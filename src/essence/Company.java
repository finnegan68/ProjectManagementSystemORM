package essence;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {
    @Id
    @Column
    @GeneratedValue
    long companyId;
    @Column
    String companyName;
    @OneToMany(targetEntity = Developer.class)
    List<Developer> developers = new ArrayList<>();

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
