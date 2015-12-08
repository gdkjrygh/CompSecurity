// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.c;

import com.google.android.apps.youtube.common.a;

public abstract class k extends a
{

    public k()
    {
    }

    public final long a()
    {
        if (a == 0L)
        {
            throw new RuntimeException("TimestampedEvent not yet posted");
        } else
        {
            return a;
        }
    }

    protected final void a(long l)
    {
        super.a(l);
    }
}
