// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EventSubscriber
{

    private final Method method;
    private final Object target;

    EventSubscriber(Object obj, Method method1)
    {
        Preconditions.checkNotNull(obj, "EventSubscriber target cannot be null.");
        Preconditions.checkNotNull(method1, "EventSubscriber method cannot be null.");
        target = obj;
        method = method1;
        method1.setAccessible(true);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof EventSubscriber)
        {
            obj = (EventSubscriber)obj;
            flag = flag1;
            if (target == ((EventSubscriber) (obj)).target)
            {
                flag = flag1;
                if (method.equals(((EventSubscriber) (obj)).method))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Method getMethod()
    {
        return method;
    }

    public Object getSubscriber()
    {
        return target;
    }

    public void handleEvent(Object obj)
        throws InvocationTargetException
    {
        Preconditions.checkNotNull(obj);
        try
        {
            method.invoke(target, new Object[] {
                obj
            });
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            obj = String.valueOf(String.valueOf(obj));
            throw new Error((new StringBuilder(((String) (obj)).length() + 33)).append("Method rejected target/argument: ").append(((String) (obj))).toString(), illegalargumentexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            obj = String.valueOf(String.valueOf(obj));
            throw new Error((new StringBuilder(((String) (obj)).length() + 28)).append("Method became inaccessible: ").append(((String) (obj))).toString(), illegalaccessexception);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (((InvocationTargetException) (obj)).getCause() instanceof Error)
        {
            throw (Error)((InvocationTargetException) (obj)).getCause();
        } else
        {
            throw obj;
        }
    }

    public int hashCode()
    {
        return (method.hashCode() + 31) * 31 + System.identityHashCode(target);
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(method));
        return (new StringBuilder(s.length() + 10)).append("[wrapper ").append(s).append("]").toString();
    }
}
