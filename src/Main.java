import essence.Developer;
import impl.DAO;
import impl.DeveloperImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        DAO daoDev = new DeveloperImpl(em);

        Developer d = new Developer();
        d.setName("Ololosh");
        d.setAge(30);
        d.setCompanyId(3);
        d.setSalary(5000);

        daoDev.create(d);

        em.getTransaction().commit();
    }
}
