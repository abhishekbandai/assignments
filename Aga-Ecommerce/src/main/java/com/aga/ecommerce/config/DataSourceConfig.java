package com.aga.ecommerce.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import com.zaxxer.hikari.HikariDataSource;

public class DataSourceConfig {

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.user}")
	private String user;

	@Value("${jdbc.password}")
	private String password;

	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setMaximumPoolSize(100);
		dataSource.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
		dataSource.addDataSourceProperty("url", url);
		dataSource.addDataSourceProperty("user", user);
		dataSource.addDataSourceProperty("password", password);
		dataSource.addDataSourceProperty("password", password);
		// dataSource.addDataSourceProperty("cachePrepStmts", true);

		return dataSource;
	}

	@Bean(name = "entityManagerFactory")
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(dataSource());
//		bean.setJpaVendorAdapter(jpaVendorAdaptor);
		bean.setPackagesToScan("com.aga.ecommerce");
		bean.setPersistenceUnitName("default");
		bean.afterPropertiesSet();
		return bean.getObject();
	}

}
