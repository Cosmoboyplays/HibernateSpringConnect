package SpringTest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("person")
public class Person {
    public Pet pet;

    @Value("${person.surname}")
    private String surname;
    @Value("34")
    public int age;


    @Autowired
    public Person() { // пишем Qualifier и указываает ID бина, который сами прописываем
        // в() после component. Ищет бины по типу Pet.
        System.out.println("Конструктор: Person создан");
        this.pet = pet;
    }

    public void personSay(){
        System.out.println("personSay");
    }

//    @Autowired
//    public void setPet(@Qualifier("catBean") Pet pet) {// тк есть несколько подходящий по типу бинов
//        System.out.println("Person setPet");
//        this.pet = pet;
//    }
    //конструктор для myconfig
//    public void setPet(Pet pet) {// тк есть несколько подходящий по типу бинов
//        System.out.println("Person setPet");
//        this.pet = pet;
//    }

    public void setSurname(String surname) {
    }

    public void setAge(int age) {
        System.out.println("Person setAge");
        this.age = age;

    }
}
