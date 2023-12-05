package com.hwq.framework;

/**
 * @Author:HWQ
 * @DateTime:2023/12/5 20:55
 * @Description:
 **/
public interface Protocol {
    // 启动
    void start();

    // 发送数据
    void send(URL url, Invocation invocation);
}
