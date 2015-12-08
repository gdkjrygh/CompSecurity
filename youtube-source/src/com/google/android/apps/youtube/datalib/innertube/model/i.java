// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ff;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap

public abstract class i
    implements u
{

    protected final ff a;
    private ap b;
    private kz c;
    private CharSequence d;

    i(ff ff1)
    {
        a = (ff)com.google.android.apps.youtube.common.fromguava.c.a(ff1);
        com.google.android.apps.youtube.common.fromguava.c.a(ff1.j);
    }

    public final ap a()
    {
        if (b == null)
        {
            b = new ap(a.b);
        }
        return b;
    }

    public final kz b()
    {
        if (c == null)
        {
            c = a.c;
        }
        return c;
    }

    public final CharSequence c()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return d;
    }

    public abstract u d();

    public final kz e()
    {
        return d().e();
    }
}
