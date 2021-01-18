package com.bizi.spring.learn.first;

import com.bizi.spring.learn.first.service.RemoteService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Primary;

@Primary
public class MockRemoteService2  implements RemoteService , BeanPostProcessor {

    public String getRepFromRemote(Integer param) {
        return "Hello, I am Mock2";
    }
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName);
        if (beanName.startsWith("remoteService")){
            return this;
        }
        return bean;
    }
}
