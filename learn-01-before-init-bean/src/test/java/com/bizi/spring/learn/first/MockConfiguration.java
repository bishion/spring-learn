package com.bizi.spring.learn.first;

import com.bizi.spring.learn.first.service.RemoteService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @Desc
 * @Author fangbi.gfb
 * @Date 2021-01-18 上午11:10
 */
//@Profile("MockRemoteService-test")
//@Configuration
public class MockConfiguration {

    @Bean
    @Primary
    public RemoteService remoteService(){
        return Mockito.mock(RemoteService.class);
    }
}
