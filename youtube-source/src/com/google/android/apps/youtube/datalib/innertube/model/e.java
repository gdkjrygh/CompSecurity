// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.db;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap

public class e
    implements u
{

    private db a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private ap e;

    public e(db db1)
    {
        a = (db)com.google.android.apps.youtube.common.fromguava.c.a(db1);
    }

    public final CharSequence a()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.j);
        }
        return b;
    }

    public final CharSequence b()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return c;
    }

    public final CharSequence c()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.e);
        }
        return d;
    }

    public final ap d()
    {
        if (e == null)
        {
            e = new ap(a.c);
        }
        return e;
    }

    public final kz e()
    {
        return a.g;
    }
}
