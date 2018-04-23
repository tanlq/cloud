package com.blomni.o2o.restaurant.conf;

import java.util.Properties;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.github.pagehelper.PageHelper;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
//mybaits dao 搜索路径
@MapperScan(basePackages="com.blomni.o2o.openPlatform.mapper")
public class MybatisDataSource {
	@Autowired
	private DataSourceProperties dataSourceProperties;
	private static String MYBATIS_CONFIG = "mybatis-config.xml";  
	//mybaits mapper xml搜索路径
	private final static String mapperLocations="classpath:mapper/*.xml"; 

	private org.apache.tomcat.jdbc.pool.DataSource pool;

	@RefreshScope
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {		
		DataSourceProperties config = dataSourceProperties;		
		this.pool = new org.apache.tomcat.jdbc.pool.DataSource();		
		this.pool.setDriverClassName(config.getDriverClassName());
		this.pool.setUrl(config.getUrl());
		if (config.getUsername() != null) {
			this.pool.setUsername(config.getUsername());
		}
		if (config.getPassword() != null) {
			this.pool.setPassword(config.getPassword());
		}
		//初始化连接:连接池启动时创建的初始化连接数量
		this.pool.setInitialSize(config.getInitialSize());
		//连接池的最大数据库连接数。设为0表示无限制
		this.pool.setMaxActive(config.getMaxActive());
		//最大空闲数，数据库连接的最大空闲时间。超过空闲时间，数据库连接将被释放。设为0表示无限制
		this.pool.setMaxIdle(config.getMaxIdle());
		//最小空闲连接:连接池中容许保持空闲状态的最小连接数量,低于这个数量将创建新的连接
		this.pool.setMinIdle(config.getMinIdle());
		this.pool.setTestOnBorrow(config.isTestOnBorrow());
		this.pool.setTestOnReturn(config.isTestOnReturn());
		//在连接返回给调用者前用于校验连接是否有效的SQL语句，如果指定了SQL语句，则必须为一个SELECT语句，且至少有一行结果
		this.pool.setValidationQuery(config.getValidationQuery());
		//最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制
		this.pool.setMaxWait(config.getMaxWait());
		//超过removeAbandonedTimeout时间后，是否进 行没用连接（废弃）的回收（默认为false，调整为true) 
		//this.pool.setRemoveAbandoned(config.isRemoveAbandoned());
		//超过时间限制，回收没有用(废弃)的连接（默认为 300秒，调整为180）
		//this.pool.setRemoveAbandonedTimeout(config.getRemoveAbandonedTimeout());
		// 连接Idle10分钟后超时，每1分钟检查一次 
		this.pool.setTimeBetweenEvictionRunsMillis(config.getTimeBetweenEvictionRunsMillis());
		this.pool.setMinEvictableIdleTimeMillis(config.getMinEvictableIdleTimeMillis());
		// 是否测试空闲的数据库连接
		this.pool.setTestWhileIdle(config.isTestWhileIdle());
		return this.pool;
	}

	@PreDestroy
	public void close() {
		if (this.pool != null) {
			this.pool.close();
		}
	}

	@Bean
	@RefreshScope
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
		
		// 分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);

        // 添加插件
        sqlSessionFactoryBean.setPlugins(new Interceptor[] {
                pageHelper
        });
		
		 return sqlSessionFactoryBean.getObject();
	}
	
	@Bean
	//@RefreshScope
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}
