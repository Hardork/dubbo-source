package com.hwq.framework;

import java.util.List;
import java.util.Random;

/**
 * @Author:HWQ
 * @DateTime:2023/12/5 20:38
 * @Description:
 **/
public class LoadBalance {
    public static URL random(List<URL> urls) {
        int size = urls.size();
        int i = new Random().nextInt(size);
        return urls.get(i);
    }
}
