package AOP;

import org.springframework.stereotype.Component;

@Component
public class LibraryBig {

    public void getBook(String name, Book book) {
        System.out.println("берем книгу из большой библиотеки: ");
        System.out.println("-------------------------------------");
//        return book.getName();
    }

    public void returnBook(){
        System.out.println("Возвращаем книгу");
        System.out.println("-------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Берем журнал из большой библиотеки");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Возвращаем журнал");
        System.out.println("-------------------------------------");
    }
    public void addBook(String name, Book book){
        System.out.println("Добавляем книгу в Бигбиблиотеку");
        System.out.println("-------------------------------------");
    }
    public void addMagazine(){
        System.out.println("Добавляем журнал в Бигбиблиотеку");
        System.out.println("-------------------------------------");
    }

}
