// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.op;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap

public final class ae
    implements u
{

    private final op a;
    private CharSequence b;
    private ap c;
    private CharSequence d;
    private kz e;
    private CharSequence f;

    public ae(op op1)
    {
        a = (op)com.google.android.apps.youtube.common.fromguava.c.a(op1);
        com.google.android.apps.youtube.common.fromguava.c.a(op1.b);
        com.google.android.apps.youtube.common.fromguava.c.a(op1.c);
        com.google.android.apps.youtube.common.fromguava.c.a(Long.valueOf(op1.e));
        com.google.android.apps.youtube.common.fromguava.c.a(op1.m);
        com.google.android.apps.youtube.common.fromguava.c.a(op1.i);
    }

    public final String a()
    {
        return a.b;
    }

    public final CharSequence b()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.c);
        }
        return b;
    }

    public final ap c()
    {
        if (c == null)
        {
            com.google.a.a.a.a.sx sx = null;
            if (a.d.length > 0)
            {
                sx = a.d[0];
            }
            c = new ap(sx);
        }
        return c;
    }

    public final long d()
    {
        return a.e;
    }

    public final kz e()
    {
        if (e == null)
        {
            e = a.f;
        }
        return e;
    }

    public final CharSequence f()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.m);
        }
        return d;
    }

    public final CharSequence g()
    {
        if (f == null)
        {
            f = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.h);
        }
        return f;
    }
}
