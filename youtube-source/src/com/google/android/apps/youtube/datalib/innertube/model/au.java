// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.uy;
import com.google.a.a.a.a.uz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap, Offlineability

public final class au
    implements u
{

    private final uy a;
    private ap b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence f;
    private Offlineability g;

    public au(uy uy1)
    {
        a = (uy)com.google.android.apps.youtube.common.fromguava.c.a(uy1);
        com.google.android.apps.youtube.common.fromguava.c.a(uy1.b);
        com.google.android.apps.youtube.common.fromguava.c.a(uy1.d);
        com.google.android.apps.youtube.common.fromguava.c.a(uy1.j);
    }

    public final String a()
    {
        return a.b;
    }

    public final ap b()
    {
        if (b == null)
        {
            b = new ap(a.c);
        }
        return b;
    }

    public final CharSequence c()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return c;
    }

    public final CharSequence d()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.r);
        }
        return d;
    }

    public final kz e()
    {
        return a.j;
    }

    public final CharSequence f()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.h);
        }
        return e;
    }

    public final CharSequence g()
    {
        if (f == null)
        {
            f = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.i);
        }
        return f;
    }

    public final Offlineability h()
    {
        if (g == null && a.t != null && a.t.b != null)
        {
            g = new Offlineability(a.t.b);
        }
        return g;
    }
}
