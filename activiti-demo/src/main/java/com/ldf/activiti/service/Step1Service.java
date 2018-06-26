package com.ldf.activiti.service;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * Created by ldf on 2018/6/25.
 */
public class Step1Service implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("是事实上是");
    }
}
