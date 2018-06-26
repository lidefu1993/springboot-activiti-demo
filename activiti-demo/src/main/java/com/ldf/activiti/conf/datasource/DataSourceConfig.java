package com.ldf.activiti.conf.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by LinYuQiang on 2018/3/9 0009.
 */
@Configuration
public class DataSourceConfig {

    @Value("${druid.type}")
    private Class<? extends DataSource> dataSourceType;

    /**
     * activity数据源
     */
    @Bean("activityDataSource")
    @Primary
    @ConfigurationProperties(prefix = "druid.datasources.activiti")
    public DataSource activityDataSource() {
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

}
