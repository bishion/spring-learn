package com.bizi.spring.learn.first;


import com.bizi.spring.learn.first.service.BizService;
import com.bizi.spring.learn.first.service.RemoteService;
import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest
@RunWith(SpringRunner.class)
public class RemoteServiceTest1 {

    @Resource
    BizService bizService;
    @MockBean
    RemoteService remoteService;
    @Test
    public void getRepFromRemote() {
        Integer param = 123;
        String mockResult = "Hello world";
        initData(param,mockResult);
        Assert.assertEquals("Remote says: "+mockResult,bizService.doSthByRemote());
    }


    private void initData(Integer param, String mockResult){
        Mockito.when(remoteService.getRepFromRemote(param)).thenReturn(mockResult);
    }
}