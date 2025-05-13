package AOP.Aspect;

import AOP.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
// Before AfterReturning AfterThrowing After - называются advice ми
    @Before("execution(* getStudents*(..))")
    public void beforeGetStudentsFromUniversity() {
        System.out.println("beforeGetStudentsFromUniversity: логируем ПЕРЕД получение всех студентов");
        System.out.println("----------------------------------------------------------------");
    }

    @AfterReturning(pointcut = "execution(* getStudents*(..))", returning = "students") // название параметра returning совпадает с аргументом ниже
    public void afterReturningGetStudentsFromUniversity(List<Student> students) {
        students.get(0).setNameSurname("NIKITA NIKITA"); // тут меняем значение имени у первого студента списка students
        System.out.println("afterReturningGetStudentsFromUniversity: логируем ПОСЛЕ получение всех студентов");
        System.out.println("----------------------------------------------------------------");
    }

    @AfterThrowing(pointcut ="execution(* getStudents*(..))", throwing = "exeption")
    public void afterThrowingGetStudentsFromUniversity(Throwable exeption) { // Throwable exeption - совпадает с параметром в Advice строкой выше
        System.out.println("afterThrowingGetStudentsFromUniversity: логируем выброс исключения: " + exeption);
    }

    @After("execution(* getStudents*(..))")
    public void afterGetStudentsFromUniversity() {
        System.out.println("afterGetStudentsFromUniversity: логируем после успешного завершения работы метода или выброса исключения в нем");
    }

}
