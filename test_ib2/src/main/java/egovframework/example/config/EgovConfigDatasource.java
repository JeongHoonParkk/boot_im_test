package egovframework.example.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import lombok.extern.slf4j.Slf4j;

@Configuration
public class EgovConfigDatasource {
	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/test_ib");
	        dataSource.setUsername("root");
	        dataSource.setPassword("1234!");
	        return dataSource;
	    }

}


