package com.bizi.spring.learn.first;


import com.bizi.spring.learn.first.service.BizService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest(classes = {Application.class,MockRemoteService3.class})
@RunWith(SpringRunner.class)
public class RemoteServiceTest3 {

    @Resource
    BizService bizService;

    @Test
    public void getRepFromRemote() {
        Assert.assertEquals("Remote says: Hello , I am mock3",bizService.doSthByRemote());
    }

}