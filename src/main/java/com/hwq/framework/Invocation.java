package com.hwq.framework;

/**
 * @Author:HWQ
 * @DateTime:2023/12/4 21:38
 * @Description: 调用
 **/
public class Invocation {
    private String interfaceName;
    private Class[] paramType;
    private String methodName;
    private Object[] params;

    public Invocation(String interfaceName, Class[] paramType, String methodName, Object[] params) {
        this.interfaceName = interfaceName;
        this.paramType = paramType;
        this.methodName = methodName;
        this.params = params;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public void setParamType(Class[] paramType) {
        this.paramType = paramType;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public Class[] getParamType() {
        return paramType;
    }

    public String getMethodName() {
        return methodName;
    }

    public Object[] getParams() {
        return params;
    }
}
