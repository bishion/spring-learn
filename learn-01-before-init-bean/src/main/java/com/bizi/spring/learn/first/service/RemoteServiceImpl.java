package com.bizi.spring.learn.first.service;

import org.springframework.stereotype.Service;

/**
 * @Desc Remote 实现类
 * @Author fangbi.gfb
 * @Date 2021-01-17 下午3:24
 */
@Service
public class RemoteServiceImpl implements RemoteService {
    public String getRepFromRemote(Integer param) {
        return "Hello, I come from remote";
    }
}
