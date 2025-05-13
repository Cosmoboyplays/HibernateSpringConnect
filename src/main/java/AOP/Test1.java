package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        LibraryBig libraryBig = context.getBean(LibraryBig.class);
        Book book = context.getBean(Book.class);

        libraryBig.addBook("Nikita ", book);
        libraryBig.addMagazine();

        context.close();
    }
}
