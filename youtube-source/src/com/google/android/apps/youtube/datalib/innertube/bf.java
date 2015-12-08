// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.wx;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class bf extends b
{

    private String c;

    private bf(p p)
    {
        super(p);
    }

    bf(p p, byte byte0)
    {
        this(p);
    }

    public final bf a(String s)
    {
        c = s;
        return this;
    }

    protected final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(c);
    }

    public final String e()
    {
        return "ypc/get_cart";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        wx wx1 = new wx();
        wx1.b = d();
        wx1.c = c;
        return wx1;
    }
}
