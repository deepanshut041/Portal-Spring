package in.futurastic.portal.config;

import com.zaxxer.hikari.HikariDataSource;
import in.futurastic.portal.core.TenantAwareRoutingSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@PropertySource("application.properties")
public class HibernateConfig {


//    @Autowired
//    private Environment environment;
//
//    @Bean
//    public DataSource dataSource() {
//
//        AbstractRoutingDataSource dataSource = new TenantAwareRoutingSource();
//
//        Map<Object,Object> targetDataSources = new HashMap<>();
//
//        targetDataSources.put(environment.getRequiredProperty("tenant.one.name"), tenantOne());
//        targetDataSources.put(null, tenantOne());
//        targetDataSources.put(environment.getRequiredProperty("tenant.two.name"), tenantTwo());
//
//        dataSource.setTargetDataSources(targetDataSources);
//
//        dataSource.afterPropertiesSet();
//
//        return dataSource;
//    }
//
//    public DataSource tenantOne() {
//
//        HikariDataSource dataSource = new HikariDataSource();
//
//        dataSource.setInitializationFailTimeout(0);
//        dataSource.setMaximumPoolSize(5);
//        dataSource.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
//        dataSource.addDataSourceProperty("url", environment.getRequiredProperty("tenant.one.datasource.url"));
//        dataSource.addDataSourceProperty("user", environment.getRequiredProperty("tenant.one.datasource.username"));
//        dataSource.addDataSourceProperty("password", environment.getRequiredProperty("tenant.one.datasource.password"));
//
//        return dataSource;
//    }
//
//    public DataSource tenantTwo() {
//
//        HikariDataSource dataSource = new HikariDataSource();
//
//        dataSource.setInitializationFailTimeout(0);
//        dataSource.setMaximumPoolSize(5);
//        dataSource.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
//        dataSource.addDataSourceProperty("url", environment.getRequiredProperty("tenant.two.datasource.url"));
//        dataSource.addDataSourceProperty("user", environment.getRequiredProperty("tenant.two.datasource.username"));
//        dataSource.addDataSourceProperty("password", environment.getRequiredProperty("tenant.two.datasource.password"));
//
//        return dataSource;
//    }

}
