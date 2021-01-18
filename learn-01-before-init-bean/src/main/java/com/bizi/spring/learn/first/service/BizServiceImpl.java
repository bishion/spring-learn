package com.bizi.spring.learn.first.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc
 * @Author fangbi.gfb
 * @Date 2021-01-17 下午10:52
 */
@Service
public class BizServiceImpl implements BizService{
    @Resource
    private RemoteService remoteService;

    public String doSthByRemote() {
        return "Remote says: "+remoteService.getRepFromRemote(123);
    }
}
