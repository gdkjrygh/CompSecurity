// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.a;

import android.os.ConditionVariable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.apps.youtube.common.a:
//            b

public final class c
    implements b, Future
{

    private final ConditionVariable a = new ConditionVariable(false);
    private volatile boolean b;
    private volatile Object c;
    private volatile Exception d;

    private c()
    {
    }

    public static c a()
    {
        return new c();
    }

    public final void a(Object obj, Exception exception)
    {
        c = null;
        d = exception;
        b = true;
        a.open();
    }

    public final void a(Object obj, Object obj1)
    {
        c = obj1;
        d = null;
        b = true;
        a.open();
    }

    public final boolean cancel(boolean flag)
    {
        return false;
    }

    public final Object get()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        a.block();
        if (d != null)
        {
            throw new ExecutionException(d);
        } else
        {
            return c;
        }
    }

    public final Object get(long l, TimeUnit timeunit)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        if (a.block(timeunit.toMillis(l)))
        {
            if (d != null)
            {
                throw new ExecutionException(d);
            } else
            {
                return c;
            }
        } else
        {
            throw new TimeoutException();
        }
    }

    public final boolean isCancelled()
    {
        return false;
    }

    public final boolean isDone()
    {
        return b;
    }
}
