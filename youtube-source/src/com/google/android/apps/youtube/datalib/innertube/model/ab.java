// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.el;
import com.google.a.a.a.a.ja;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.oi;
import com.google.a.a.a.a.rb;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap

public final class ab
    implements u
{

    private final oi a;
    private CharSequence b;
    private ap c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence f;

    public ab(oi oi1)
    {
        a = (oi)com.google.android.apps.youtube.common.fromguava.c.a(oi1);
    }

    public final String a()
    {
        return a.b;
    }

    public final kz b()
    {
        return a.c;
    }

    public final CharSequence c()
    {
        if (b == null)
        {
            if (a.d != null)
            {
                b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
            } else
            {
                b = "";
            }
        }
        return b;
    }

    public final ap d()
    {
        if (c == null)
        {
            c = new ap(a.e);
        }
        return c;
    }

    public final kz e()
    {
        return a.r;
    }

    public final CharSequence f()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return d;
    }

    public final CharSequence g()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.g);
        }
        return e;
    }

    public final CharSequence h()
    {
        if (f == null)
        {
            f = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.h);
        }
        return f;
    }

    public final boolean i()
    {
        return a.k != null && a.k.b;
    }

    public final boolean j()
    {
        return a.k != null && a.k.c;
    }

    public final boolean k()
    {
        return a.l != null && a.l.b;
    }

    public final boolean l()
    {
        return a.s != null && a.s.d;
    }

    public final int m()
    {
        return a.q;
    }

    public final byte[] n()
    {
        return com.google.protobuf.nano.c.a(a);
    }
}
