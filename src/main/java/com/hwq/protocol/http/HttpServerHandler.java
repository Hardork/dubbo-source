package com.hwq.protocol.http;

import cn.hutool.core.io.IoUtil;
import cn.hutool.json.JSONUtil;
import com.hwq.framework.Invocation;
import com.hwq.register.LocalRegister;
import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Author:HWQ
 * @DateTime:2023/12/5 19:01
 * @Description:
 **/
public class HttpServerHandler {
    public void handler(HttpServletRequest req, HttpServletResponse rep){
        try {
            Invocation invocation = JSONUtil.toBean(req.getQueryString(), Invocation.class);
            String interfaceName = invocation.getInterfaceName();
            Class impl = LocalRegister.get(interfaceName);
            Method method = impl.getMethod(invocation.getMethodName(), invocation.getParamType());
            var res = method.invoke(impl.newInstance(), invocation.getParams());
            System.out.println(res);
            IoUtil.write(rep.getOutputStream(), false, (byte[]) res);
        } catch (Exception e) {}
    }
}
