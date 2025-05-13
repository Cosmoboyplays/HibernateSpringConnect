package SpringTest1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")// если не написать idбина то id  будет равен имени класса с маленькой буквы
@Scope()
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat constructor");
    }

    public void say(){
        System.out.println("cat say");
    }

    @PostConstruct
    public void init(){
        System.out.println("Cat init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Cat destroy");
    }
}
