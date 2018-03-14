//package com.fixed.asset.common;
//
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//public class moonlightSqlSessionFactory {
//	@Bean(name = "moonlightSqlSessionFactory")
//	@Primary
//	public SqlSessionFactory moonlightSqlSessionFactory(@Qualifier("moonlightData") DataSource dataSource) throws Exception {
//	    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//	    bean.setDataSource(dataSource);
//	    bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis-mapper/*.xml"));
//	    bean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
//	    return bean.getObject();
//	}
//}
