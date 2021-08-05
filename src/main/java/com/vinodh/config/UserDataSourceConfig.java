package com.vinodh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = "oracleEntityManagerFactoryBean", 
        transactionManagerRef = "oracleTransactionManager",
        basePackages = { "com.vinodh.user.repository"})
public class UserDataSourceConfig {

}
