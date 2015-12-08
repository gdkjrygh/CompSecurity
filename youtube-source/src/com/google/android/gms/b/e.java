// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.ii;

public final class e
    implements b
{

    private final ii a;

    public e(Context context, c c, d d)
    {
        a = new ii(context, c, d);
    }

    public final void a()
    {
        a.d();
    }

    public final void a(c c)
    {
        a.a(c);
    }

    public final void a(Integer integer, Long long1, Integer integer1, Integer integer2, Bundle bundle)
    {
        Bundle bundle1 = new Bundle();
        if (integer != null)
        {
            bundle1.putInt("latency_micros", integer.intValue());
        }
        if (long1 != null)
        {
            bundle1.putLong("latency_bps", long1.longValue());
        }
        if (integer1 != null)
        {
            bundle1.putInt("latitude_e6", integer1.intValue());
        }
        if (integer2 != null)
        {
            bundle1.putInt("longitude_e6", integer2.intValue());
        }
        if (!bundle1.isEmpty() || bundle != null && !bundle.isEmpty())
        {
            a.a(bundle1, bundle);
        }
    }

    public final void b()
    {
        a.g();
    }

    public final void b(c c)
    {
        a.b(c);
    }
}
