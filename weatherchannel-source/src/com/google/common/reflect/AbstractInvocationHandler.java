// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public abstract class AbstractInvocationHandler
    implements InvocationHandler
{

    private static final Object NO_ARGS[] = new Object[0];

    public AbstractInvocationHandler()
    {
    }

    private static boolean isProxyOfSameInterfaces(Object obj, Class class1)
    {
        return class1.isInstance(obj) || Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), class1.getInterfaces());
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    protected abstract Object handleInvocation(Object obj, Method method, Object aobj[])
        throws Throwable;

    public int hashCode()
    {
        return super.hashCode();
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        boolean flag = true;
        Object aobj1[] = aobj;
        if (aobj == null)
        {
            aobj1 = NO_ARGS;
        }
        if (aobj1.length == 0 && method.getName().equals("hashCode"))
        {
            return Integer.valueOf(hashCode());
        }
        if (aobj1.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == java/lang/Object)
        {
            method = ((Method) (aobj1[0]));
            if (method == null)
            {
                return Boolean.valueOf(false);
            }
            if (obj == method)
            {
                return Boolean.valueOf(true);
            }
            if (!isProxyOfSameInterfaces(method, obj.getClass()) || !equals(Proxy.getInvocationHandler(method)))
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }
        if (aobj1.length == 0 && method.getName().equals("toString"))
        {
            return toString();
        } else
        {
            return handleInvocation(obj, method, aobj1);
        }
    }

    public String toString()
    {
        return super.toString();
    }

}
