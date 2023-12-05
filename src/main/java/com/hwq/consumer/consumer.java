package com.hwq.consumer;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.hwq.framework.Invocation;
import com.hwq.framework.ProxyFactory;
import com.hwq.provider.api.HelloService;

/**
 * @Author:HWQ
 * @DateTime:2023/12/4 21:36
 * @Description:
 **/
public class consumer {
    public static void main(String[] args) {
        // 第一种写法
        Invocation invocation = new Invocation(HelloService.class.getName(), new Class[]{String.class}, "sayHello", new Object[]{"hwq"});
        String res = HttpUtil.post("localhost:8080", JSONUtil.parseObj(invocation));
        // 第二种写法 动态代理
        HelloService proxy = ProxyFactory.getProxy(HelloService.class);
        proxy.hello("nihao");
        System.out.println(res);
    }
}
