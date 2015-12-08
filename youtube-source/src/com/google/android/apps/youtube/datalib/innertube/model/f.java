// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.de;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap

public class f
    implements u
{

    private de a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private ap f;

    public f(de de1)
    {
        a = (de)com.google.android.apps.youtube.common.fromguava.c.a(de1);
    }

    public final String a()
    {
        return a.b;
    }

    public final CharSequence b()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return b;
    }

    public final CharSequence c()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.e);
        }
        return c;
    }

    public final CharSequence d()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return d;
    }

    public final kz e()
    {
        return a.g;
    }

    public final CharSequence f()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.j);
        }
        return e;
    }

    public final ap g()
    {
        if (f == null)
        {
            f = new ap(a.c);
        }
        return f;
    }
}
