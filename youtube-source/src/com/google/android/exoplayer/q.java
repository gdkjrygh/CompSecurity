// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.SystemClock;

final class q
{

    private boolean a;
    private long b;
    private long c;

    q()
    {
    }

    private static long b(long l)
    {
        return SystemClock.elapsedRealtime() * 1000L - l;
    }

    public final void a()
    {
        if (!a)
        {
            a = true;
            c = b(b);
        }
    }

    public final void a(long l)
    {
        b = l;
        c = b(l);
    }

    public final void b()
    {
        if (a)
        {
            b = b(c);
            a = false;
        }
    }

    public final long c()
    {
        if (a)
        {
            return b(c);
        } else
        {
            return b;
        }
    }
}
