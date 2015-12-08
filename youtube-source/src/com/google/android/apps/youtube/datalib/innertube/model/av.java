// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.vj;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ap

public final class av
{

    private vj a;
    private CharSequence b;
    private CharSequence c;
    private ap d;

    public av(vj vj1)
    {
        a = (vj)com.google.android.apps.youtube.common.fromguava.c.a(vj1);
    }

    public final CharSequence a()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.c);
        }
        return b;
    }

    public final CharSequence b()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return c;
    }

    public final ap c()
    {
        if (d == null)
        {
            d = new ap(a.b);
        }
        return d;
    }

    public final kz d()
    {
        return a.e;
    }
}
