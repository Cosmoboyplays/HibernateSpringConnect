package hibernateTEst2.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit"); // можно создать 1 раз и потом плодить менеджеры везде
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin(); // открыли транзакцию
            String query = "SELECT s FROM Student s WHERE s.name = 'Женя' AND s.surname = 'Ггитаррист' AND s.avgGrade = 37";
            List<Student> existingStudents = (List<Student>) entityManager.createQuery(query, Student.class).getResultList();

            if (existingStudents.isEmpty()) {
                // Создание нового объекта Student
                Student student = new Student("Женя", "Ггитаррист", 37);
                System.out.println("Добавили студента "+ student.toString());
                // Сохранение объекта в базе данных
                entityManager.persist(student);
                entityManager.getTransaction().commit();
            } else {
                System.out.println("Студент с такими атрибутами уже существует.");
            }

        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close(); // тоже нужно закрывать этот тяжеловес, но очень редко
        }
    }
}