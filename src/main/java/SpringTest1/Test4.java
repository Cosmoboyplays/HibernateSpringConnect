package SpringTest1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog dog = (Dog) context.getBean("myPet", Dog.class);
//        Dog dog2 = (Dog) context.getBean("myPet", Dog.class);
//
//        System.out.println(dog + "\n" + dog2);


    }
}
