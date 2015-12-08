// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.offline.n;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            h, ax, cf

public final class i
{

    private a a;
    private final b b;
    private String c;
    private ax d;
    private String e;
    private boolean f;
    private final h g;
    private n h;
    private w i;
    private final SharedPreferences j;
    private String k;
    private cf l;
    private ad m;

    public i(b b1, SharedPreferences sharedpreferences, h h1)
    {
        k = "";
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        j = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        g = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        f = false;
    }

    static a a(i i1)
    {
        return i1.a;
    }

    static b b(i i1)
    {
        return i1.b;
    }

    static String c(i i1)
    {
        return i1.c;
    }

    static ax d(i i1)
    {
        return i1.d;
    }

    static String e(i i1)
    {
        return i1.e;
    }

    static boolean f(i i1)
    {
        return i1.f;
    }

    static h g(i i1)
    {
        return i1.g;
    }

    static n h(i i1)
    {
        return i1.h;
    }

    static w i(i i1)
    {
        return i1.i;
    }

    static SharedPreferences j(i i1)
    {
        return i1.j;
    }

    static String k(i i1)
    {
        return i1.k;
    }

    static cf l(i i1)
    {
        return i1.l;
    }

    static ad m(i i1)
    {
        return i1.m;
    }

    public final com.google.android.apps.youtube.core.client.h a()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(a);
        return new com.google.android.apps.youtube.core.client.h(this, (byte)0);
    }

    public final i a(ax ax)
    {
        d = ax;
        return this;
    }

    public final i a(cf cf)
    {
        l = cf;
        return this;
    }

    public final i a(ad ad)
    {
        m = ad;
        return this;
    }

    public final i a(w w)
    {
        i = w;
        return this;
    }

    public final i a(a a1)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        return this;
    }

    public final i a(n n)
    {
        h = n;
        return this;
    }

    public final i a(String s)
    {
        c = s;
        return this;
    }

    public final i a(boolean flag)
    {
        f = flag;
        return this;
    }

    public final i b(String s)
    {
        e = s;
        return this;
    }

    public final i c(String s)
    {
        k = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }
}
