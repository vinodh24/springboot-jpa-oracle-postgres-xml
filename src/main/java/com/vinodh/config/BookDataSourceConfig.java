package com.vinodh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = "postgresEntityManagerFactoryBean", 
        transactionManagerRef = "postgresTransactionManager",
        basePackages = { "com.vinodh.book.repository" })
public class BookDataSourceConfig {

}
