// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.vn;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ap

public final class aw
{

    private final vn a;
    private ap b;
    private ap c;
    private ap d;
    private CharSequence e;

    public aw(vn vn1)
    {
        a = (vn)com.google.android.apps.youtube.common.fromguava.c.a(vn1);
    }

    public final ap a()
    {
        if (b == null)
        {
            b = new ap(a.b);
        }
        return b;
    }

    public final ap b()
    {
        if (c == null)
        {
            c = new ap(a.c);
        }
        return c;
    }

    public final ap c()
    {
        if (d == null)
        {
            d = new ap(a.d);
        }
        return d;
    }

    public final CharSequence d()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return e;
    }

    public final kz e()
    {
        return a.e;
    }
}
