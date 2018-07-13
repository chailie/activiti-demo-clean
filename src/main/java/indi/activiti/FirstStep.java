package indi.activiti;

import org.activiti.engine.ManagementService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FirstStep {

    @Autowired
    RuntimeService runtimeService;

    @Autowired
    TaskService taskService;

    @Autowired
    ManagementService managementService;

    @Autowired
    RepositoryService repositoryService;

    @Autowired
    SpringProcessEngineConfiguration conf;

    @Test
    void go() {

        // Resource[] toRead = new Resource[2];
        // toRead[0] = conf.getDeploymentResources()[0];
        // toRead[1] = new ClassPathResource("/processes2/MyProcess1.bpmn");
        // conf.setDeploymentResources(toRead);// 路径

        System.out.println(conf);
        // 打印部署的资源
        for (Resource r : conf.getDeploymentResources()) {
            System.out.println(r);
        }
        runtimeService.startProcessInstanceByKey("Process 1");
        System.out.println(managementService);
    }
}