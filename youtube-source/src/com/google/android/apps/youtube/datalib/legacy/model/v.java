// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            w

public final class v
{

    private final String a;
    private final com.google.android.apps.youtube.datalib.innertube.model.v b;
    private final long c;
    private final long d;

    public v(String s, com.google.android.apps.youtube.datalib.innertube.model.v v1, long l, long l1)
    {
        a = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = (com.google.android.apps.youtube.datalib.innertube.model.v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        c = l;
        d = l1;
    }

    private boolean j()
    {
        return !b.d() && !b.e();
    }

    public final String a()
    {
        return a;
    }

    public final com.google.android.apps.youtube.datalib.innertube.model.v b()
    {
        return b;
    }

    public final long c()
    {
        return c;
    }

    public final long d()
    {
        return d;
    }

    public final boolean e()
    {
        while (b == null || j() && !f()) 
        {
            return true;
        }
        return false;
    }

    public final boolean f()
    {
        while (!j() || h() > System.currentTimeMillis()) 
        {
            return false;
        }
        return true;
    }

    public final String g()
    {
        return b.f();
    }

    public final long h()
    {
        return d + (long)b.h() * 1000L;
    }

    public final w i()
    {
        return (new w()).a(a).a(b).a(c).b(d);
    }
}
