// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;


public final class ak
{

    static final boolean a;
    private int b;
    private boolean c;

    public ak()
    {
        b = 0;
        c = false;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b = b + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == 0)
        {
            throw new IllegalStateException("No locks to remove");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!a && b <= 0)
        {
            throw new AssertionError();
        }
        b = b - 1;
        if (b == 0 && c)
        {
            c = false;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        while (b > 0) 
        {
            c = true;
            wait();
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final String toString()
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        stringbuffer.append("Number of locks = ");
        this;
        JVM INSTR monitorenter ;
        stringbuffer.append(b);
        if (!c)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        stringbuffer.append("; A thread is waiting to pass this gate");
_L1:
        this;
        JVM INSTR monitorexit ;
        return stringbuffer.toString();
        stringbuffer.append("; No thread is waiting to pass this gate");
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/ytremote/fork/net/async/ak.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
