package hibernateTest1;

import hibernateTest1.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employees.class).
                buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        List<Employees> employees = session.createQuery("from Employees where name = 'Nikita'").getResultList();

        for (Employees employee : employees) {
            System.out.println(employee);
        }

        session.getTransaction().commit();


    }
}
