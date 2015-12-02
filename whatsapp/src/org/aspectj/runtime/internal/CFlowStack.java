// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal;

import java.util.Stack;
import java.util.Vector;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.runtime.CFlow;
import org.aspectj.runtime.internal.cflowstack.ThreadStack;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactory;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;

// Referenced classes of package org.aspectj.runtime.internal:
//            CFlowPlusState

public class CFlowStack
{

    private static ThreadStackFactory tsFactory;
    private ThreadStack stackProxy;

    public CFlowStack()
    {
        stackProxy = tsFactory.getNewThreadStack();
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

    private Stack getThreadStack()
    {
        return stackProxy.getThreadStack();
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

    public Object get(int i)
    {
        CFlow cflow = peekCFlow();
        if (cflow == null)
        {
            return null;
        } else
        {
            return cflow.get(i);
        }
    }

    public boolean isValid()
    {
        return !getThreadStack().isEmpty();
    }

    public Object peek()
    {
        Stack stack = getThreadStack();
        if (stack.isEmpty())
        {
            throw new NoAspectBoundException();
        } else
        {
            return stack.peek();
        }
    }

    public CFlow peekCFlow()
    {
        Stack stack = getThreadStack();
        if (stack.isEmpty())
        {
            return null;
        } else
        {
            return (CFlow)stack.peek();
        }
    }

    public Object peekInstance()
    {
        CFlow cflow = peekCFlow();
        if (cflow != null)
        {
            return cflow.getAspect();
        } else
        {
            throw new NoAspectBoundException();
        }
    }

    public CFlow peekTopCFlow()
    {
        Stack stack = getThreadStack();
        if (stack.isEmpty())
        {
            return null;
        } else
        {
            return (CFlow)stack.elementAt(0);
        }
    }

    public void pop()
    {
        Stack stack = getThreadStack();
        stack.pop();
        if (stack.isEmpty())
        {
            stackProxy.removeThreadStack();
        }
    }

    public void push(Object obj)
    {
        getThreadStack().push(obj);
    }

    public void push(Object aobj[])
    {
        getThreadStack().push(new CFlowPlusState(aobj));
    }

    public void pushInstance(Object obj)
    {
        getThreadStack().push(new CFlow(obj));
    }

    static 
    {
        selectFactoryForVMVersion();
    }
}
