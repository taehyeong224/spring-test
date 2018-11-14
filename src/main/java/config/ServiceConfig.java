package config;


import dao.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.HelloService;
import service.UserService;

@Configuration
@MapperScan(basePackages = "dao")
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
