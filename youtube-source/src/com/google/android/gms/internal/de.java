// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            df, dg

public abstract class de
{

    private final Runnable a = new df(this);
    private volatile Thread b;

    public de()
    {
    }

    static Thread a(de de1, Thread thread)
    {
        de1.b = thread;
        return thread;
    }

    public abstract void a();

    public final void e()
    {
        dg.a(a);
    }

    public final void f()
    {
        v_();
        if (b != null)
        {
            b.interrupt();
        }
    }

    public abstract void v_();
}
