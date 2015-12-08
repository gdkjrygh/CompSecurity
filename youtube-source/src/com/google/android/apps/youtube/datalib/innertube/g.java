// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.text.TextUtils;
import com.google.a.a.a.a.aq;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class g extends b
{

    private String c;
    private String d;
    private String e;

    private g(p p)
    {
        super(p);
        c = "";
        d = "";
        e = "";
    }

    g(p p, byte byte0)
    {
        this(p);
    }

    public final g a(String s)
    {
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    public final g b(String s)
    {
        d = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    public final g c(String s)
    {
        e = s;
        return this;
    }

    protected final void c()
    {
        if (TextUtils.isEmpty(c))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(d);
            return;
        } else
        {
            com.google.android.apps.youtube.common.fromguava.c.a(c);
            return;
        }
    }

    public final String e()
    {
        return "browse";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        aq aq1 = new aq();
        aq1.b = d();
        aq1.c = c;
        aq1.f = d;
        aq1.d = e;
        return aq1;
    }
}
