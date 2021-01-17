package com.bizi.spring.learn.first;

import com.bizi.spring.learn.first.service.RemoteService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class MockRemoteService2 implements RemoteService , BeanPostProcessor {

    public String getRepFromRemote(Integer param) {
        return "Hello, I am Mock2";
    }
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.startsWith("remoteService")){
            return new MockRemoteService2();
        }
        return bean;
    }
}
