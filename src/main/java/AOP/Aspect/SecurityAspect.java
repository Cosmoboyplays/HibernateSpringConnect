package AOP.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class SecurityAspect {

    @Before("AOP.Aspect.MyPointcuts.allAddMethodFromLibraryBig()") //используем прописанный pointcut
    public void beforeAddMethodSecurity(JoinPoint joinPoint) {
        System.out.println("beforeAddMethodSecurity: проверка прав на получение предмета");
        System.out.println("----------------------------------------------------------------");

    }}
