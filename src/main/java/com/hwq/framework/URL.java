package com.hwq.framework;

/**
 * @Author:HWQ
 * @DateTime:2023/12/4 21:50
 * @Description:
 **/
public class URL {
    private String host;
    private Integer port;

    public URL(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
