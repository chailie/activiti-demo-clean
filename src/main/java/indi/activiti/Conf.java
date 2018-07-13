package indi.activiti;

import javax.sql.DataSource;

import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class Conf {
    /*
    @Bean
    public DataSource dataSource() {
        DataSourceTransactionManager
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager m = new DataSourceTransactionManager();
        m.setDataSource(dataSource);
        return m;
    }

    @Bean
    public SpringProcessEngineConfiguration processEngineConfiguration(
            DataSourceTransactionManager trManager) {
        SpringProcessEngineConfiguration conf = new SpringProcessEngineConfiguration();
        Resource[] rs = { new ClassPathResource("/processes2") }; // 路径
        conf.setDeploymentResources(rs);
        conf.setTransactionManager(trManager);
        return conf;
    }*/

}
