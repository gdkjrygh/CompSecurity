// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.SystemClock;

public final class d
{

    private final long a;

    public d()
    {
        this(System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    public d(long l)
    {
        a = l;
    }

    public long a()
    {
        return SystemClock.elapsedRealtime() + a;
    }
}
