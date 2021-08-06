package com.example.jdbc.demo;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DataSourceManager {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
