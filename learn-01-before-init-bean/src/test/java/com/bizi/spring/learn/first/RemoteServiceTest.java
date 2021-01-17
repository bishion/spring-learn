package com.bizi.spring.learn.first;


import com.bizi.spring.learn.first.service.RemoteService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = MockRemoteService2.class)
@RunWith(SpringRunner.class)
public class RemoteServiceTest {
    @Resource
    private RemoteService remoteService;
    @Test
    public void getRepFromRemote() {
        System.out.println(remoteService.getRepFromRemote(123));
    }
}