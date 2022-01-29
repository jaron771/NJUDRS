package com.nju.svcdisambiguation.datasource;

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
@MapperScan(basePackages = {"com.nju.svcdisambiguation.dataMapper.ieee"}, sqlSessionTemplateRef = "sqlSessionTemplate")
public class IEEEConfig {

    @Bean(name = "ieeedb")
    // 设置数据库属性来源
    @ConfigurationProperties(prefix = "spring.datasource.ieee")
    public DataSource dataSource(){
        // 默认是Hikari
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "ieeeSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("ieeedb")DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        // 设置Mapper.xml文件的扫描处
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/IEEE*.xml"));
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "ieeeTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("ieeedb") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("ieeeSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
