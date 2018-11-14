package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.HelloService;
import service.UserService;

@Configuration
public class ServiceConfig {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
