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


@SpringBootTest(classes = {Application.class,MockRemoteService2.class})
@RunWith(SpringRunner.class)
public class RemoteServiceTest2 {
    @Resource
    BizService bizService;

    @Test
    public void getRepFromRemote() {
        Assert.assertEquals("Remote says: Hello, I am Mock2",bizService.doSthByRemote());
    }
}