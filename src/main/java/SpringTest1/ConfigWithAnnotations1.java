package SpringTest1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        Person myPerson = context.getBean("person", Person.class);
        myPerson.personSay();

        context.close();
    }
}
