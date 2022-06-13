package com.test.service;

import com.test.mapper.TestMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class TestServiceImpl implements TestService{

    @Resource
    TestMapper mapper;

    @Transactional
    @Override
    public void test() {
        mapper.insertStudent();
        //if(true) throw new RuntimeException("我是测试异常！");
        mapper.insertStudent();
    }
}
