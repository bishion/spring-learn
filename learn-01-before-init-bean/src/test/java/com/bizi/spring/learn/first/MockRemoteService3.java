package com.bizi.spring.learn.first;

import com.bizi.spring.learn.first.service.RemoteService;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;

/**
 * @Desc
 * @Author fangbi.gfb
 * @Date 2021-01-17 下午10:49
 */

public class MockRemoteService3 {
    @MockBean
    private RemoteService remoteService;


    @PostConstruct
    public void initMockito(){
        Mockito.when(remoteService.getRepFromRemote(123)).thenReturn("Hello , I am mock3");
    }
    @Bean
    @Primary
    public RemoteService remoteService(){
        return Mockito.mock(RemoteService.class);
    }
}
