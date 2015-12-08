// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.os.Handler;
import android.os.HandlerThread;

// Referenced classes of package com.google.android.apps.analytics:
//            v, z, s, u, 
//            h, n

final class t extends HandlerThread
{

    volatile Handler a;
    private final z b;
    private final String c;
    private int d;
    private int e;
    private long f;
    private u g;
    private final h h;
    private final v i;
    private final s j;

    private t(h h1, z z1, String s1, s s2)
    {
        super("DispatcherThread");
        e = 30;
        g = null;
        h = h1;
        c = s1;
        b = z1;
        i = new v(this, (byte)0);
        b.b = i;
        j = s2;
    }

    private t(h h1, String s1, s s2)
    {
        this(h1, new z(s.a(s2)), s1, s2);
    }

    t(h h1, String s1, s s2, byte byte0)
    {
        this(h1, s1, s2);
    }

    static int a(t t1)
    {
        return t1.d;
    }

    static int a(t t1, int k)
    {
        t1.e = k;
        return k;
    }

    static long a(t t1, long l)
    {
        l = t1.f * 2L;
        t1.f = l;
        return l;
    }

    static u a(t t1, u u1)
    {
        t1.g = u1;
        return u1;
    }

    static int b(t t1, int k)
    {
        t1.d = k;
        return k;
    }

    static long b(t t1)
    {
        return t1.f;
    }

    static long b(t t1, long l)
    {
        t1.f = 2L;
        return 2L;
    }

    static s c(t t1)
    {
        return t1.j;
    }

    static z d(t t1)
    {
        return t1.b;
    }

    static h e(t t1)
    {
        return t1.h;
    }

    static int f(t t1)
    {
        return t1.e;
    }

    static String g(t t1)
    {
        return t1.c;
    }

    static v h(t t1)
    {
        return t1.i;
    }

    static u i(t t1)
    {
        return t1.g;
    }

    public final void a(n an[])
    {
        if (a == null)
        {
            return;
        } else
        {
            a.post(new u(this, an));
            return;
        }
    }

    protected final void onLooperPrepared()
    {
        a = new Handler();
    }
}
