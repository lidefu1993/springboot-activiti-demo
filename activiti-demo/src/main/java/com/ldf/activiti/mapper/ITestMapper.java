package com.ldf.activiti.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
/**
 * Created by ldf on 2018/6/22.
 */
@Repository
public interface ITestMapper {

    List<Map<String,Object>> selectTest();

}
