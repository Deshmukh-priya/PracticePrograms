package com.capgemini.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import com.capgemini.beans.Employee;

@Configuration

public class ApplicationConfig {
	@Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("JPA-PU");
         
        return factoryBean;
    }
     
	/*
	 * @Bean public JpaTransactionManager transactionManager(EntityManagerFactory
	 * entityManagerFactory) { JpaTransactionManager transactionManager = new
	 * JpaTransactionManager();
	 * transactionManager.setEntityManagerFactory(entityManagerFactory);
	 * 
	 * return transactionManager; }
	 */
    @Bean
    public Employee employee() {
    	return new Employee();
    }
	
}

