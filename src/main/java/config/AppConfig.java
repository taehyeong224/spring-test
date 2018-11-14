package config;

import dao.UserMapper;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "dao")
public class AppConfig {

    @Bean()
    public DataSource dataSource() {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Diver");
        source.setUrl("jdbc:mysql://172.30.1.12/kth?autoReconnect=true&amp;useSSL=false&amp;characterEncoding=UTF-8&amp;serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("7dnjfdlek");
        return source;
    }

    @Bean()
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public MapperFactoryBean<UserMapper> mapperFactoryBean() throws Exception {
        MapperFactoryBean<UserMapper> mapperMapperFactoryBean = new MapperFactoryBean<>();
        mapperMapperFactoryBean.setMapperInterface(UserMapper.class);
        mapperMapperFactoryBean.setSqlSessionFactory(sqlSessionFactory());
        return mapperMapperFactoryBean;
    }

}
