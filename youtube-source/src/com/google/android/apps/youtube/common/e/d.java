// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Random;

public final class d
{

    private final long a;
    private final long b;
    private final long c;
    private final Random d;
    private long e;
    private long f;

    public d()
    {
        this(1000L, 30000L, 5L);
    }

    private d(long l, long l1, long l2)
    {
        d = new Random();
        e = 0L;
        f = 0L;
        a = 1000L;
        b = 30000L;
        boolean flag;
        if (5L >= 1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        c = 5L;
    }

    public final boolean a()
    {
        if (e >= c)
        {
            return false;
        }
        long l1 = (long)((1.0D + d.nextDouble()) * (double)a * Math.pow(2D, e));
        long l = l1;
        if (l1 > b)
        {
            l = b;
        }
        try
        {
            L.d((new StringBuilder("Sleeping thread for ")).append(l).append("ms").toString());
            Thread.sleep(l);
            e = e + 1L;
            f = l;
        }
        catch (InterruptedException interruptedexception)
        {
            L.a("Thread interrupted", interruptedexception);
            return false;
        }
        return true;
    }
}
