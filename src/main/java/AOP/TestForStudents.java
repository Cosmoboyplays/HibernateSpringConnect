package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class TestForStudents {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean(University.class);
        university.addStudent(new Student("Nikita Ilin", 2, 5 ));
        university.addStudent(new Student("Gosha", 2, 4 ));
        university.addStudent(new Student("Dmitriy", 7, 7 ));

        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        }
        catch (Exception e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        }

        context.close();
    }


}
