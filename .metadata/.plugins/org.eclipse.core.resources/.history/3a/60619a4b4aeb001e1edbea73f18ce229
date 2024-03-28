package egovframework.example.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.egovframe.rte.psl.orm.ibatis.SqlMapClientFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import lombok.extern.slf4j.Slf4j;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan
@Slf4j 
public class EgovConfigSqlmap {

	@Bean
	public SqlMapClientFactoryBean sqlMapClient(@Qualifier("dataSource") DataSource dataSource) {
	    PathMatchingResourcePatternResolver pmrpr = new PathMatchingResourcePatternResolver();
	    SqlMapClientFactoryBean sqlMapClientFactoryBean = new SqlMapClientFactoryBean();
	    sqlMapClientFactoryBean.setDataSource(dataSource);
	    sqlMapClientFactoryBean.setConfigLocation(pmrpr.getResource("classpath:/egovframework/sqlmap/example/sql-map-config.xml"));
	    return sqlMapClientFactoryBean;
	}

}
