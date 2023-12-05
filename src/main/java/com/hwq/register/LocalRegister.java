package com.hwq.register;

import com.hwq.framework.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:HWQ
 * @DateTime:2023/12/4 21:37
 * @Description: 本地注册
 **/
public class LocalRegister {
    private static Map<String, Class> REGISTER  = new HashMap<>();

    public static void register(String interfaceName, Class clazz) {
        REGISTER.put(interfaceName, clazz);
    }

    public static Class get(String interfaceName) {
        return REGISTER.get(interfaceName);
    }
}
