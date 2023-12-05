package com.hwq.register;

import com.hwq.framework.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:HWQ
 * @DateTime:2023/12/4 21:44
 * @Description:
 **/
public class RemoteRegister {
    private static Map<String, List<URL>> REGISTER  = new HashMap<>();

    public static void register(String interfaceName, URL url) {
        List<URL> urls = REGISTER.get(interfaceName);
        if (urls == null) {
            urls = new ArrayList<>();
        }
        urls.add(url);
        REGISTER.put(interfaceName, urls);
    }

    public static List<URL> get(String interfaceName) {
        return REGISTER.get(interfaceName);
    }


}
