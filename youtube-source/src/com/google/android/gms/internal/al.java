// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ay, aq, ak

public final class al extends ay
{

    private final Object a = new Object();
    private aq b;
    private ak c;

    public al()
    {
    }

    public final void a()
    {
        ak ak;
        synchronized (a)
        {
            if (c != null)
            {
                ak = c;
            }
        }
    }

    public final void a(int i)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (i == 3)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        b.a(i);
        b = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(aq aq1)
    {
        synchronized (a)
        {
            b = aq1;
        }
    }

    public final void b()
    {
        ak ak;
        synchronized (a)
        {
            if (c != null)
            {
                ak = c;
            }
        }
    }

    public final void c()
    {
        ak ak;
        synchronized (a)
        {
            if (c != null)
            {
                ak = c;
            }
        }
    }

    public final void d()
    {
        ak ak;
        synchronized (a)
        {
            if (c != null)
            {
                ak = c;
            }
        }
    }

    public final void e()
    {
label0:
        {
            ak ak;
            synchronized (a)
            {
                if (b == null)
                {
                    break label0;
                }
                b.a(0);
                b = null;
            }
            return;
        }
        if (c != null)
        {
            ak = c;
        }
        obj;
        JVM INSTR monitorexit ;
    }
}
