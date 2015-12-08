// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.gs;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class o extends b
{

    private String c;
    private String d;

    private o(p p)
    {
        super(p);
        a(new byte[0]);
    }

    o(p p, byte byte0)
    {
        this(p);
    }

    public final o a(String s)
    {
        c = s;
        return this;
    }

    public final o b(String s)
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
        return "player/heartbeat";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        gs gs1 = new gs();
        gs1.b = d();
        gs1.c = c;
        gs1.d = d;
        return gs1;
    }
}
