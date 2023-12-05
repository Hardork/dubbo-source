package com.hwq.provider;

import com.hwq.framework.URL;
import com.hwq.provider.api.HelloService;
import com.hwq.provider.impl.HelloServiceImpl;
import com.hwq.register.LocalRegister;
import com.hwq.register.RemoteRegister;

/**
 * @Author:HWQ
 * @DateTime:2023/12/4 21:40
 * @Description:
 **/
public class Provider {
    public static void main(String[] args) {
//         1.提供服务接口
//         2.提供实现类
//         3.注册服务（注册中心注册、本地注册）
//         4.暴露服务（启动Tomcat、NettyServer）
        URL url = new URL("localhost", 8080);
        // 注册服务
        // 远程注册
        RemoteRegister.register(HelloService.class.getName(), url);
        // 本地注册 <接口名，实现类>
        LocalRegister.register(HelloService.class.getName(), HelloServiceImpl.class);

        // 暴露服务

    }
}
