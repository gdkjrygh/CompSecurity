// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ee;
import com.google.a.a.a.a.sd;
import com.google.a.a.a.a.se;
import com.google.a.a.a.a.tn;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            d, bb

public final class am
{

    private final sd a;
    private final se b;
    private final tn c;
    private final String d;
    private bb e;
    private d f;
    private CharSequence g;
    private boolean h;

    public am(sd sd1)
    {
        a = (sd)com.google.android.apps.youtube.common.fromguava.c.a(sd1);
        d = sd1.h;
        b = sd1.f;
        c = sd1.l;
        h = sd1.d;
    }

    public final String a()
    {
        return d;
    }

    public final void a(d d1)
    {
        f = d1;
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final CharSequence b()
    {
        if (g == null && a.b != null)
        {
            g = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
        }
        return g;
    }

    public final boolean c()
    {
        return h;
    }

    public final boolean d()
    {
        return a.e;
    }

    public final boolean e()
    {
        return b != null;
    }

    public final boolean f()
    {
        return c != null || f != null;
    }

    public final ee g()
    {
        if (b != null)
        {
            return b.b;
        } else
        {
            return null;
        }
    }

    public final d h()
    {
        if (f == null && c != null && c.b != null)
        {
            f = new d(c.b);
        }
        return f;
    }

    public final bb i()
    {
        if (e == null && b != null && b.d != null)
        {
            e = new bb(b.d);
        }
        return e;
    }
}
