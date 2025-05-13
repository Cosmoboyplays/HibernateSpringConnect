package AOP.Aspect;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("AOP.Aspect.MyPointcuts.allAddMethodFromLibraryBig()") //используем прописанный pointcut
    public void beforeAddMethodFromLibraryBigLogging(JoinPoint joinPoint) { // так вытаскиваем
        System.out.println("allAddMethodFromLibraryBig лог ADD ADD ADD ADD ADD");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature.getName());
        System.out.println(methodSignature.getReturnType());
//        System.out.println(methodSignature.getDeclaringType());
//        System.out.println(methodSignature.getParameterNames());
        System.out.println(Arrays.stream(joinPoint.getArgs()).toList());


        if (methodSignature.getName().equals("addBook")){
            for (Object obj : joinPoint.getArgs()) {
                if (obj instanceof Book ){
                    Book mybook = (Book) obj; // type casting
                    System.out.println("Название книги: " + mybook.getName()+
                            "\nАвтор книги: " + mybook.getAuthor()+
                            "\nГод издания: " + mybook.getYearsOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет: " + obj.toString());
                }
            }
        }
        System.out.println("Логгирование - КОНЕЦ АСПЕКТА _-_________--______-____");
        System.out.println("----------------------------------------------------------------");

    }

    @Before("AOP.Aspect.MyPointcuts.allGetMethodFromLibraryBig()")
    public void beforeGetMethodFromLibraryBig() {
        System.out.println("allGetMethodFromLibraryBig лог GET GET GET GET GET");

    }
//    @Pointcut("execution(public void AOP.LibraryBig.returnMagazine())")
//    private void returnMagazineFromLibraryBig() {}
//
//    @Pointcut("allMethodsFromLibraryBig() && !returnMagazineFromLibraryBig()") // получились все кроме returnMagazine
//    private void allExceptReturnMagazineFromLibraryBig() {}
//
//
//    @Before("returnMagazineFromLibraryBig()")
//    public void beforeReturnMagazineFromLibraryBig(){
//        System.out.println("beforeReturnMagazineFromLibraryBig: перед возвратом журнала");
//    }


//
//    @Pointcut("execution(* AOP.LibraryBig.return*())")
//    private void allReturnMethodFromLibraryBig() {
//    }
//
//    @Pointcut("allGetMethodFromLibraryBig() || allReturnMethodFromLibraryBig()")
//    private void allGetAndReturnMethodFromLibraryBig() {}
//
//
//
//    @Before("allReturnMethodFromLibraryBig()")
//    public void beforeReturnMethodFromLibraryBig() {
//        System.out.println("allGetMethodFromLibraryBig лог НОМЕР 2");
//    }
//
//    @Before("allGetAndReturnMethodFromLibraryBig()")
//    public void beforeGetAndReturnMethodFromLibraryBig() {
//        System.out.println("beforeGetAndReturnMethodFromLibraryBig лог НОМЕР 3");
//    }
//@Before("execution(* get*(AOP.Book))") // поинтКат
//public void beforeGetLoggingAdvice(){
//    System.out.println("beforeGetBookAdvice СлужебныйКласс попытка книгу/журнал получить ");
//}
//
//@Before("execution(* get*(AOP.Book))")
//public void beforeGetSecurityAdvice(){
//    System.out.println("beforeGetSecurityAdvice Проверка прав на получение книги или журнала");
//}
}