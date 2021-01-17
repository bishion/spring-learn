package com.bizi.spring.learn.first;

import com.bizi.spring.learn.first.service.RemoteService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MockRemoteService1 implements RemoteService , InstantiationAwareBeanPostProcessor {
    public String getRepFromRemote(Integer param) {
        return "Hello, I am Mock1";
    }

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if (beanName.startsWith("remoteService")){
            return new MockRemoteService1();
        }
        return null;

    }
}
