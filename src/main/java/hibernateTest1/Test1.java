package hibernateTest1;

import hibernateTest1.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employees.class).
                buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Employees employee = new Employees("Nikita", "Il", "IT", 100500);
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();

    }
}
