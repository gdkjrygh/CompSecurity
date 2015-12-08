// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.n;
import com.android.volley.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class v
    implements n, o, Future
{

    private Request a;
    private boolean b;
    private Object c;
    private VolleyError d;

    private v()
    {
        b = false;
    }

    public static v a()
    {
        return new v();
    }

    private Object a(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            throw new ExecutionException(d);
        }
        break MISSING_BLOCK_LABEL_26;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
        if (!b) goto _L2; else goto _L1
_L1:
        long1 = ((Long) (c));
_L7:
        this;
        JVM INSTR monitorexit ;
        return long1;
_L2:
        if (long1 != null) goto _L4; else goto _L3
_L3:
        wait(0L);
_L6:
        if (d != null)
        {
            throw new ExecutionException(d);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (long1.longValue() > 0L)
        {
            wait(long1.longValue());
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!b)
        {
            throw new TimeoutException();
        }
        long1 = ((Long) (c));
          goto _L7
    }

    public final void a(VolleyError volleyerror)
    {
        this;
        JVM INSTR monitorenter ;
        d = volleyerror;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        volleyerror;
        throw volleyerror;
    }

    public final void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        c = obj;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final boolean cancel(boolean flag)
    {
        flag = false;
        this;
        JVM INSTR monitorenter ;
        Request request = a;
        if (request != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (isDone())
        {
            continue; /* Loop/switch isn't completed */
        }
        a.f();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final Object get()
    {
        Object obj;
        try
        {
            obj = a(((Long) (null)));
        }
        catch (TimeoutException timeoutexception)
        {
            throw new AssertionError(timeoutexception);
        }
        return obj;
    }

    public final Object get(long l, TimeUnit timeunit)
    {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(l, timeunit)));
    }

    public final boolean isCancelled()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.g();
        }
    }

    public final boolean isDone()
    {
        this;
        JVM INSTR monitorenter ;
        if (b || d != null) goto _L2; else goto _L1
_L1:
        boolean flag = isCancelled();
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }
}
