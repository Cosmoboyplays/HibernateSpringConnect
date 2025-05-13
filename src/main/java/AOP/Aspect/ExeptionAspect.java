package AOP.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ExeptionAspect {
    @Before("AOP.Aspect.MyPointcuts.allAddMethodFromLibraryBig()") //используем прописанный pointcut
    public void beforeAddMethodExeptionAdvice(JoinPoint joinPoint) {
        System.out.println("beforeAddMethodExeptionAdvice: Ловим и обрабатываем исключения");
        System.out.println("----------------------------------------------------------------");
    }
    }
