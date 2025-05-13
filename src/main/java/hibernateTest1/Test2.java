package hibernateTest1;

import hibernateTest1.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employees.class).
                buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Employees employee = new Employees("Jo", "Баден", "Америка", 1000000000);
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();


        int idEmp = employee.getId();
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Employees employee2 = session.get(Employees.class, idEmp);
        session.getTransaction().commit();
        System.out.println(employee2);

    }
}
