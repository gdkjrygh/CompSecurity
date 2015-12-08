// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.e;

import android.app.PendingIntent;
import android.content.Context;

public abstract class f
{

    private long a;
    private long b;
    private String c;
    private boolean d;
    private PendingIntent e;

    public f()
    {
        a = 0L;
        b = 0L;
        d = false;
    }

    public abstract void a();

    public void a(long l)
    {
        a = l;
    }

    public void a(PendingIntent pendingintent)
    {
        e = pendingintent;
    }

    public void a(Context context, String s)
    {
        c = (new StringBuilder()).append(context.getPackageName()).append(s).toString();
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public long b()
    {
        return a;
    }

    public void b(long l)
    {
        b = l;
    }

    public long c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public boolean e()
    {
        return d;
    }

    public PendingIntent f()
    {
        return e;
    }

    public void g()
    {
        e = null;
    }
}
