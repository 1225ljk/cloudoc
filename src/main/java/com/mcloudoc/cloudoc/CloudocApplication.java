package com.mcloudoc.cloudoc;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
@MapperScan(value = "com.mcloudoc.cloudoc.mapper")
@SpringBootApplication
public class CloudocApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudocApplication.class, args);
    }

}
