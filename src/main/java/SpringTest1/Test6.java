package SpringTest1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean", Pet.class);
        cat.say();
        Person person = context.getBean("person", Person.class);
        person.personSay();
        System.out.println(person);


       /* Dog dog = (Dog) context.getBean("myPet", Dog.class);
        dog.say();
*/
        context.close(); // всегда закрывать контекст
    }
}
