package SpringTest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;


//@SpringBootApplication
//@RestController
public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // спринг контейнер

        Pet pet =  context.getBean("myPet", Pet.class);
//        Person person = (Person) context.getBean("myPerson");
//        person.pet.say();
//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());
//
        context.close();
    }
}
