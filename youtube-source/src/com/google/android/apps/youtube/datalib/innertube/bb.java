// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.text.TextUtils;
import com.google.a.a.a.a.wf;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class bb extends b
{

    private String c;
    private String d;
    private int e;
    private String f;
    private String g;

    private bb(p p)
    {
        super(p);
        c = "";
        d = "";
        e = 0;
        f = "";
        g = "";
        a(new byte[0]);
    }

    bb(p p, byte byte0)
    {
        this(p);
    }

    public final bb a(int i)
    {
        e = i;
        return this;
    }

    public final bb a(String s)
    {
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    public final bb b(String s)
    {
        d = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    public final bb c(String s)
    {
        f = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    protected final void c()
    {
        boolean flag;
        if (!TextUtils.isEmpty(d) || !TextUtils.isEmpty(c) || !TextUtils.isEmpty(g))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
    }

    public final bb d(String s)
    {
        g = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    public final String e()
    {
        return "next";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        wf wf1 = new wf();
        wf1.d = d;
        if (e >= 0)
        {
            wf1.f = e;
        }
        wf1.e = f;
        wf1.c = c;
        wf1.g = g;
        wf1.b = d();
        return wf1;
    }
}
