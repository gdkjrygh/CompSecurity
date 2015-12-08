// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ba;
import com.google.a.a.a.a.bc;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ap, am

public final class c
{

    private final ba a;
    private ap b;
    private ap c;
    private am d;
    private CharSequence e;

    public c(ba ba1)
    {
        a = (ba)com.google.android.apps.youtube.common.fromguava.c.a(ba1);
    }

    public final ap a()
    {
        if (b == null)
        {
            b = new ap(a.h);
        }
        return b;
    }

    public final ap b()
    {
        if (c == null)
        {
            c = new ap(a.g);
        }
        return c;
    }

    public final am c()
    {
        if (d == null && a.n != null && a.n.c != null)
        {
            d = new am(a.n.c);
        }
        return d;
    }

    public final CharSequence d()
    {
        if (a.e != null)
        {
            return a.e;
        } else
        {
            return "";
        }
    }

    public final CharSequence e()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.r);
        }
        return e;
    }
}
