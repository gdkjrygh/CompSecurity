// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.text.TextUtils;
import com.google.a.a.a.a.lz;
import com.google.a.a.a.a.md;
import com.google.protobuf.nano.c;

public final class v
{

    private final md a;
    private final int b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;

    public v(md md1)
    {
        a = md1;
        c = md1.b;
        if (md1.e != 0)
        {
            b = md1.e;
        } else
        if (!TextUtils.isEmpty(c))
        {
            b = 1;
        } else
        {
            b = 2;
        }
        if (b == 2)
        {
            d = 0;
            e = 0;
        } else
        {
            d = md1.c;
            e = md1.d;
        }
        if (b == 1)
        {
            f = null;
        } else
        if (md1.f != null)
        {
            f = md1.f;
            if (md1.g == null)
            {
                throw new NullPointerException("OfflineState.offline_refresh_message cannot be null");
            }
        } else
        {
            throw new NullPointerException("OfflineState.short_message cannot be null");
        }
    }

    public final md a()
    {
        return (md)com.google.protobuf.nano.c.a(new md(), com.google.protobuf.nano.c.a(a));
    }

    public final int b()
    {
        return b;
    }

    public final boolean c()
    {
        return b == 1;
    }

    public final boolean d()
    {
        return b == 2;
    }

    public final boolean e()
    {
        return b == 3;
    }

    public final String f()
    {
        return c;
    }

    public final int g()
    {
        return d;
    }

    public final int h()
    {
        return e;
    }

    public final String i()
    {
        return f;
    }

    public final lz j()
    {
        return a.g;
    }
}
