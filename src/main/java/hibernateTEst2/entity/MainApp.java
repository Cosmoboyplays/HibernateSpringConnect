package hibernateTEst2.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        // Создаем конфигурацию Hibernate
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Убедитесь, что файл hibernate.cfg.xml находится в classpath
        // Создаем сессию
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = null;
        try {
            // Открываем сессию
            session = sessionFactory.getCurrentSession();
            // Начинаем транзакцию
            session.beginTransaction();

            // Здесь вы можете создать объект Student, если хотите
             Student student = new Student("Глеб", "Смирнов", 4.5);
             session.save(student); // Сохраняем объект, если нужно
            // Транзакция завершается
            session.getTransaction().commit();
            System.out.println("Таблица успешно создана (если она не существовала ранее).");
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback(); // Откат транзакции в случае ошибки
            }
            e.printStackTrace();
        } finally {
            // Закрываем сессию и фабрику
            if (session != null) {
                session.close();
            }
            sessionFactory.close();
        }
    }
}