package SpringTest1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("person", Person.class);
        person.pet.say();
        System.out.println(person.age);

        System.out.println(person.pet);


        context.close();
    }
}
