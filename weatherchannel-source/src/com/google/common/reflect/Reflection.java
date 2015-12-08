// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class Reflection
{

    private Reflection()
    {
    }

    public static String getPackageName(Class class1)
    {
        return getPackageName(class1.getName());
    }

    public static String getPackageName(String s)
    {
        int i = s.lastIndexOf('.');
        if (i < 0)
        {
            return "";
        } else
        {
            return s.substring(0, i);
        }
    }

    public static transient void initialize(Class aclass[])
    {
        int j = aclass.length;
        int i = 0;
        while (i < j) 
        {
            Class class1 = aclass[i];
            try
            {
                Class.forName(class1.getName(), true, class1.getClassLoader());
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                throw new AssertionError(aclass);
            }
            i++;
        }
    }

    public static Object newProxy(Class class1, InvocationHandler invocationhandler)
    {
        Preconditions.checkNotNull(invocationhandler);
        Preconditions.checkArgument(class1.isInterface(), "%s is not an interface", new Object[] {
            class1
        });
        return class1.cast(Proxy.newProxyInstance(class1.getClassLoader(), new Class[] {
            class1
        }, invocationhandler));
    }
}
