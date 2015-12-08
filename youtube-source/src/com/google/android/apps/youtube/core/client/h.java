// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.offline.n;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            i, ax, cf

public final class h
{

    private final a a;
    private final b b;
    private final String c;
    private final ax d;
    private final String e;
    private final boolean f;
    private final com.google.android.apps.youtube.common.network.h g;
    private final n h;
    private final w i;
    private final SharedPreferences j;
    private final String k;
    private final cf l;
    private final ad m;
    private long n;

    private h(i i1)
    {
        a = com.google.android.apps.youtube.core.client.i.a(i1);
        b = com.google.android.apps.youtube.core.client.i.b(i1);
        c = com.google.android.apps.youtube.core.client.i.c(i1);
        d = com.google.android.apps.youtube.core.client.i.d(i1);
        e = com.google.android.apps.youtube.core.client.i.e(i1);
        f = com.google.android.apps.youtube.core.client.i.f(i1);
        g = com.google.android.apps.youtube.core.client.i.g(i1);
        h = com.google.android.apps.youtube.core.client.i.h(i1);
        i = com.google.android.apps.youtube.core.client.i.i(i1);
        j = com.google.android.apps.youtube.core.client.i.j(i1);
        k = com.google.android.apps.youtube.core.client.i.k(i1);
        l = com.google.android.apps.youtube.core.client.i.l(i1);
        m = com.google.android.apps.youtube.core.client.i.m(i1);
        n = Math.min(b.a(), j.getLong("last_ad_time", 0L));
    }

    h(i i1, byte byte0)
    {
        this(i1);
    }

    public final a a()
    {
        return a;
    }

    public final void a(long l1)
    {
        n = l1;
        j.edit().putLong("last_ad_time", l1).apply();
    }

    public final String b()
    {
        return j.getString("user_channel_id", null);
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.b();
        }
    }

    public final String e()
    {
        return e;
    }

    public final boolean f()
    {
        return f;
    }

    public final long g()
    {
        return n;
    }

    public final int h()
    {
        long l1;
        if (n > 0L)
        {
            if ((l1 = (b.a() - n) / 1000L) <= 0x7fffffffL && l1 > 0L)
            {
                return (int)l1;
            }
        }
        return 0;
    }

    public final com.google.android.apps.youtube.common.network.h i()
    {
        return g;
    }

    public final String j()
    {
        return k;
    }

    public final cf k()
    {
        return l;
    }

    public final ad l()
    {
        return m;
    }
}
