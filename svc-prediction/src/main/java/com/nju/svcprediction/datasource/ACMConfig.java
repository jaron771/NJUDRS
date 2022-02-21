package com.nju.svcprediction.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.nju.svcprediction.dataMapper.acm"}, sqlSessionTemplateRef = "acmSqlSessionTemplate")
public class ACMConfig {


    @Bean(name = "acmdb")
    // 设置数据库属性来源
    @ConfigurationProperties(prefix = "spring.datasource.acm")
    public DataSource dataSource(){
        // 默认是Hikari
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "acmSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("acmdb")DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        // 设置Mapper.xml文件的扫描处
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/ACM*.xml"));
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "acmTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("acmdb") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "acmSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("acmSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
