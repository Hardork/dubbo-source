package com.hwq.framework;

import java.util.Properties;

/**
 * @Author:HWQ
 * @DateTime:2023/12/5 20:56
 * @Description:
 **/
public class ProtocolFactory {
    public static Protocol getProtocol() {
        String name = System.getProperty("protocol");
        if (name == null || name.equals("")) {
            return null;
        } else {
            switch (name) {
                case "http" : return null;
            }
        }
        return null;
    }
}
