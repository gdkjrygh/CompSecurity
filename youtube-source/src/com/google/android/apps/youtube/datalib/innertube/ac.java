// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.lm;
import com.google.a.a.a.a.lp;
import com.google.a.a.a.a.qz;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class ac extends b
{

    private lm c;
    private lp d;

    private ac(p p)
    {
        super(p);
        c = new lm();
        d = new lp();
        c.b = d;
        a(new byte[0]);
    }

    ac(p p, byte byte0)
    {
        this(p);
    }

    public final ac a(String s)
    {
        d.b = s.getBytes();
        return this;
    }

    protected final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(c.b.b);
    }

    public final String e()
    {
        return "notification_registration/set_registration";
    }

    public final com.google.protobuf.nano.c f()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        b();
        qz qz1 = new qz();
        qz1.b = d();
        qz1.c = c;
        return qz1;
    }
}
