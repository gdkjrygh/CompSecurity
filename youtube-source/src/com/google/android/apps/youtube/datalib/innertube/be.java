// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.wv;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class be extends b
{

    private String c;
    private String d;

    private be(p p)
    {
        super(p);
    }

    be(p p, byte byte0)
    {
        this(p);
    }

    public final be a(String s)
    {
        c = s;
        return this;
    }

    public final be b(String s)
    {
        d = s;
        return this;
    }

    protected final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(c);
        com.google.android.apps.youtube.common.fromguava.c.a(d);
    }

    public final String e()
    {
        return "ypc/complete_transaction";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        wv wv1 = new wv();
        wv1.b = d();
        wv1.d = c;
        wv1.c = d;
        return wv1;
    }
}
