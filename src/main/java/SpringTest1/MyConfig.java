package SpringTest1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@PropertySource("classpath:myApp.properties")
@Configuration
public class MyConfig {

    @Bean
    @Scope("singleton") // prototype
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person person(){
        return new Person();
    }

}
