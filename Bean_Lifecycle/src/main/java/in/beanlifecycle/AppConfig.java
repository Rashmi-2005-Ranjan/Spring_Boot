package in.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    /*
    public void demo(){
        System.out.println("Demo method called");
    }
     */
    @Bean(initMethod = "start")
    public CartService cartService(){
        return new CartService();
    }
}
