package hibernateTest1;

import hibernateTest1.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employees.class).
                buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        //DELETE 1
//        Employees employees2 = session.get(Employees.class, 4);
//        session.delete(employees2);
        //DELETE 2
        session.createQuery("delete Employees where name = 'Jo'").executeUpdate();


        session.getTransaction().commit();

    }
}
