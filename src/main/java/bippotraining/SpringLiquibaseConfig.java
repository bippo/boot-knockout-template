package bippotraining;


import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringLiquibaseConfig {


    @Autowired
    private org.apache.tomcat.dbcp.dbcp2.BasicDataSource dataSource;

    @Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:changelog.xml");
        liquibase.setDataSource(dataSource);
        liquibase.setShouldRun(true);
        return liquibase;
    }

}
