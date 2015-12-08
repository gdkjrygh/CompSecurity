// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;


final class f
{

    public final long a;
    public final int b;
    private final Object c;
    private int d;
    private boolean e;

    public f(Object obj, int i, long l)
    {
        c = obj;
        a = l;
        b = i;
    }

    public final int a()
    {
        return d;
    }

    public final void a(int i)
    {
        synchronized (c)
        {
            d = Math.max(0, i);
            e = true;
            c.notify();
        }
    }

    public final boolean b()
    {
        return e;
    }
}
