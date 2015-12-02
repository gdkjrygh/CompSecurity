// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal;

import org.aspectj.runtime.internal.cflowstack.ThreadCounter;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactory;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;

public class CFlowCounter
{

    private static ThreadStackFactory tsFactory;
    private ThreadCounter flowHeightHandler;

    public CFlowCounter()
    {
        flowHeightHandler = tsFactory.getNewThreadCounter();
    }

    private static String getSystemPropertyWithoutSecurityException(String s, String s1)
    {
        try
        {
            s = System.getProperty(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s;
    }

    private static ThreadStackFactory getThreadLocalStackFactory()
    {
        return new ThreadStackFactoryImpl();
    }

    private static ThreadStackFactory getThreadLocalStackFactoryFor11()
    {
        return new ThreadStackFactoryImpl11();
    }

    public static String getThreadStackFactoryClassName()
    {
        return tsFactory.getClass().getName();
    }

    private static void selectFactoryForVMVersion()
    {
        String s = getSystemPropertyWithoutSecurityException("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        boolean flag;
        if (s.equals("unspecified"))
        {
            if (System.getProperty("java.class.version", "0.0").compareTo("46.0") >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (s.equals("yes") || s.equals("true"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            tsFactory = getThreadLocalStackFactory();
            return;
        } else
        {
            tsFactory = getThreadLocalStackFactoryFor11();
            return;
        }
    }

    public void dec()
    {
        flowHeightHandler.dec();
        if (!flowHeightHandler.isNotZero())
        {
            flowHeightHandler.removeThreadCounter();
        }
    }

    public void inc()
    {
        flowHeightHandler.inc();
    }

    public boolean isValid()
    {
        return flowHeightHandler.isNotZero();
    }

    static 
    {
        selectFactoryForVMVersion();
    }
}
