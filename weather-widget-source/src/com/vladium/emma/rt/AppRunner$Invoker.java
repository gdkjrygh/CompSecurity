// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import java.lang.reflect.Method;

// Referenced classes of package com.vladium.emma.rt:
//            AppRunner

private static final class m_args
    implements Runnable
{

    private final Object m_args[];
    private Throwable m_failure;
    private final Method m_method;
    private final Object m_target;

    Throwable getFailure()
    {
        return m_failure;
    }

    public void run()
    {
        try
        {
            m_method.invoke(m_target, m_args);
            return;
        }
        catch (Throwable throwable)
        {
            m_failure = throwable;
        }
    }

    (Method method, Object obj, Object aobj[])
    {
        if (method == null)
        {
            throw new IllegalArgumentException("null input: method");
        }
        if (aobj == null)
        {
            throw new IllegalArgumentException("null input: args");
        } else
        {
            m_method = method;
            m_target = obj;
            m_args = aobj;
            return;
        }
    }
}
