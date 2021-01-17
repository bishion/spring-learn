package com.bizi.spring.learn.first.service;

/**
 * @Desc 这里是一个远程操作，调用下游服务
 * @Author fangbi.gfb
 * @Date 2021-01-17 下午3:23
 */
public interface RemoteService {
    /**
     * 根据参数，向下游获取一个返回值
     * @param param 参数
     * @return 返回远程的字符串
     */
    String getRepFromRemote(Integer param);
}
