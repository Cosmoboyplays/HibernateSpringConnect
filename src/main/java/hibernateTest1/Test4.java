package hibernateTest1;

import hibernateTest1.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employees.class).
                buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        //1
        List<Employees> employees = session.createQuery("from Employees where name = 'Nikita'").getResultList();
        for (Employees employee : employees) {
            System.out.println(employee);
        }
        //2
        Employees employees2 = session.get(Employees.class, 1);
        employees2.setSalary(900);
        //3
        session.createQuery("update Employees set salary = 15" +
                " where name = 'Jo'").executeUpdate();

        session.getTransaction().commit();

    }
}
