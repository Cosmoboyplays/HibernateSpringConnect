package SpringTest1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope()
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog constructor");
    }

    public void say(){
        System.out.println("dog say");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog init");
    } // любая логика, открытие соединений

    @PreDestroy
    public void destroy(){
        System.out.println("Dog destroy");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
