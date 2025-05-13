package AOP;



import java.util.ArrayList;
import java.util.List;


public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(100));
        System.out.println(students); // печатает перед аспектом
        return students; // присвоит возвращаемое значение после аспекта с изменениями произведенными в аспекте
    }
}
