package com.hwq.framework;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.hwq.provider.api.HelloService;
import com.hwq.register.RemoteRegister;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @Author:HWQ
 * @DateTime:2023/12/5 20:20
 * @Description:
 **/
public class ProxyFactory{

    public static <T> T getProxy(final Class<T> interfaceClass) {

        return (T)Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Invocation invocation = new Invocation(interfaceClass.getName(), method.getParameterTypes(), method.getName(), args);
                // 注册中心获取服务信息
                List<URL> urls = RemoteRegister.get(interfaceClass.getName());
                URL url = LoadBalance.random(urls);
                // 远程调用
                String res = HttpUtil.post(url.getHost() + ":" + url.getPort(), JSONUtil.parseObj(invocation));
                return res;
            }
        });

    }
}
