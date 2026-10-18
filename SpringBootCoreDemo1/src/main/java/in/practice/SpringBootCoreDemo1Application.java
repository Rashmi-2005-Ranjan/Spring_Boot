package in.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoreDemo1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run ( SpringBootCoreDemo1Application.class , args );
        context.getBean ( OrderService.class ).placeOrder ();
    }

//    @Bean
//    public UserService getUserServiceBean() {
//        return new UserService ();
//    }

}
