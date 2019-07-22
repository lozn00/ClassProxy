package com.bug.proxy;

import java.lang.reflect.Method;

public interface ProxyCallback
{
    public Object call(Object proxyObject,Method method,Object[] args);
}
