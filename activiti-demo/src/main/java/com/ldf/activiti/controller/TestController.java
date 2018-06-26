package com.ldf.activiti.controller;

import com.ldf.activiti.mapper.ITestMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ldf on 2018/6/25.
 */
@RestController
@RequestMapping(value = "test")
public class TestController {
    @Autowired
    private ITestMapper testMapper;

    @ApiOperation(value = "测试")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object test(){
        return testMapper.selectTest();
    }
}
