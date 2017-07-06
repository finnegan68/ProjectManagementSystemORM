import dao.DeveloperDAO;
import essence.Developer;
import impl.DeveloperImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        DeveloperDAO daoDev = (DeveloperDAO) new DeveloperImpl(em);

        Developer d = new Developer();
        d.setName("Ololosh");
        d.setAge(30);
        d.setCompanyId(3);
        d.setSalary(5000);

        daoDev.create(d);
        System.out.println("Hello");

        em.getTransaction().commit();
    }
}
