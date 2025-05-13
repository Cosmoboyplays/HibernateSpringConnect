package AOP;

import org.springframework.stereotype.Component;

@Component
public class Library {

    public void getBook(){
        System.out.println("берем книгу из библиотеки номер 1");
    }

}
