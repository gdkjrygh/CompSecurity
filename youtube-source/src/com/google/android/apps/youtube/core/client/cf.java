// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.e.b;

public final class cf
{

    private long a;
    private final b b;

    public cf(b b1)
    {
        b = b1;
        a = -1L;
    }

    public final void a()
    {
        a = b.b();
    }

    public final long b()
    {
        if (a == -1L)
        {
            return -1L;
        } else
        {
            return b.b() - a;
        }
    }
}
