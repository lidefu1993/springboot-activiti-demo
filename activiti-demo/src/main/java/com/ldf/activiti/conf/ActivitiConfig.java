package com.ldf.activiti.conf;

import org.activiti.spring.SpringAsyncExecutor;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.AbstractProcessEngineAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by ldf on 2018/6/25.
 */
@Configuration
public class ActivitiConfig extends AbstractProcessEngineAutoConfiguration {

    @Resource(name = "activityDataSource")
    DataSource activitiDataSource;//注入配置好的数据源

    @Resource(name = "annotationDrivenTransactionManager")
    PlatformTransactionManager annotationDrivenTransactionManager;//注入配置好的事物管理器

    //注入数据源和事务管理器
    @Bean
    public SpringProcessEngineConfiguration springProcessEngineConfiguration(
            SpringAsyncExecutor springAsyncExecutor) throws IOException {
        return this.baseSpringProcessEngineConfiguration(activitiDataSource, annotationDrivenTransactionManager, springAsyncExecutor);
    }

}
