// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.a;

import com.google.a.a.a.a.gc;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.datalib.innertube.a.a;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.u;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.a:
//            d

public class c
    implements u
{

    protected final kz a;
    protected ap b;
    protected final String c;
    protected final String d;
    protected final int e;
    protected boolean f;
    private final d g;

    c()
    {
        a = null;
        c = null;
        d = null;
        e = 0;
        g = null;
    }

    public c(gc gc1)
    {
        this(gc1, null);
    }

    public c(gc gc1, d d1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(gc1);
        com.google.android.apps.youtube.common.fromguava.c.a(gc1.c);
        a = gc1.b;
        b = new ap(gc1.d);
        c = gc1.c;
        d = gc1.g;
        e = gc1.e;
        g = d1;
    }

    public final boolean a(kz kz1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        if (a.i != null || a.u != null)
        {
            return false;
        } else
        {
            return com.google.android.apps.youtube.datalib.innertube.a.a.a(a, kz1, false);
        }
    }

    public String b()
    {
        return c;
    }

    public final void b(boolean flag)
    {
        f = flag;
    }

    public final ap d()
    {
        return b;
    }

    public final kz e()
    {
        return a;
    }

    public final String f()
    {
        return d;
    }

    public final boolean g()
    {
        return f;
    }

    public final boolean h()
    {
        if (g != null)
        {
            return g.c();
        } else
        {
            return true;
        }
    }
}
