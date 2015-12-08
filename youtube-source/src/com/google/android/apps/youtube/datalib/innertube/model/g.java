// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.df;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap

public class g
    implements u
{

    private final df a;
    private ap b;
    private CharSequence c;

    public g(df df1)
    {
        a = (df)com.google.android.apps.youtube.common.fromguava.c.a(df1);
    }

    public final CharSequence a()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return c;
    }

    public final ap b()
    {
        if (b == null)
        {
            b = new ap(a.c);
        }
        return b;
    }

    public final kz e()
    {
        return a.f;
    }
}
