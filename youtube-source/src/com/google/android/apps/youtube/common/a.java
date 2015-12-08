// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common;

import com.google.android.apps.youtube.common.fromguava.c;

public abstract class a
{

    protected long a;

    public a()
    {
    }

    public long a()
    {
        return a;
    }

    protected void a(long l)
    {
        if (a != 0L)
        {
            throw new RuntimeException("This instance is already timestamped");
        }
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        a = l;
    }
}
