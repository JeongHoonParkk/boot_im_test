package egovframework.example.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class EgovConfigDatasource {

	    @Bean
	    public DataSource dataSource() {
		   log.info("데이터소스");
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/test_ib");
	        dataSource.setUsername("root");
	        dataSource.setPassword("1234!");
	        log.info("소스 끝");
	        return dataSource;
	    }

	    @Bean
	    public SqlSessionFactory sqlSessionFactory() throws Exception {
	        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	        sqlSessionFactoryBean.setDataSource(dataSource());
	        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/egovframework/sqlmap/dbTestSqlMap/*.xml"));
	        return sqlSessionFactoryBean.getObject();
	    }

}
