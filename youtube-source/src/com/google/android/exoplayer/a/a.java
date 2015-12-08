// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;

import com.google.android.exoplayer.upstream.DataSourceStream;
import com.google.android.exoplayer.upstream.b;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import com.google.android.exoplayer.upstream.o;
import com.google.android.exoplayer.upstream.p;

// Referenced classes of package com.google.android.exoplayer.a:
//            m

public abstract class a
    implements o
{

    public final m a;
    public final int b;
    public final long c;
    private final i d;
    private final j e;
    private DataSourceStream f;

    public a(i k, j j1, m m1, int l)
    {
        d = (i)com.google.android.exoplayer.e.a.a(k);
        e = (j)com.google.android.exoplayer.e.a.a(j1);
        a = (m)com.google.android.exoplayer.e.a.a(m1);
        b = l;
        c = j1.e;
    }

    public final void a()
    {
        if (f != null)
        {
            f.d();
            f = null;
        }
    }

    public final void a(b b1)
    {
        boolean flag;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        f = new DataSourceStream(d, e, b1);
    }

    protected void a(p p)
    {
    }

    public final boolean b()
    {
        return f.c();
    }

    public final long c()
    {
        return f.b();
    }

    public final void d()
    {
        boolean flag;
        if (f != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        a(f);
    }

    protected final p e()
    {
        return f;
    }

    protected final void f()
    {
        if (f != null)
        {
            f.a();
        }
    }

    public final void g()
    {
        f.g();
    }

    public final boolean h()
    {
        return f.h();
    }

    public final void i()
    {
        f.i();
    }
}
