// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.e.k;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            n, m, o

public final class Loader
{

    private final ExecutorService a;
    private final m b;
    private n c;
    private boolean d;

    public Loader(String s, m m)
    {
        a = k.c(s);
        b = m;
    }

    static m a(Loader loader)
    {
        return loader.b;
    }

    static n a(Loader loader, n n1)
    {
        loader.c = null;
        return null;
    }

    static boolean a(Loader loader, boolean flag)
    {
        loader.d = false;
        return false;
    }

    public final void a(o o)
    {
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        d = true;
        c = new n(this, o);
        a.submit(c);
    }

    public final boolean a()
    {
        return d;
    }

    public final void b()
    {
        com.google.android.exoplayer.e.a.b(d);
        c.a();
    }

    public final void c()
    {
        if (d)
        {
            b();
        }
        a.shutdown();
    }
}
