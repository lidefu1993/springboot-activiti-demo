package com.ldf.activiti.util;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;

/**
 * Created by ldf on 2018/6/25.
 */
public class ActivitiUtil {

    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
    public void startDeployment(){
        Deployment deployment = processEngine.getRepositoryService()
                .createDeployment()
                .addClasspathResource("classpath:/processes/Developer_Hiring_with_jpa.bpmn")
                .addClasspathResource("diagrams/VariableUsersDemo.png")
                .deploy();
        System.out.println("Deploy deploy ID: " + deployment.getId());
    }



}
