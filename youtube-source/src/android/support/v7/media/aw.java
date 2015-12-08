// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;

// Referenced classes of package android.support.v7.media:
//            j, as, at, x

final class aw extends j
{

    final as a;
    private final String b;
    private boolean c;
    private int d;
    private int e;
    private at f;
    private int g;

    public aw(as as1, String s)
    {
        a = as1;
        super();
        d = -1;
        b = s;
    }

    public final void a()
    {
        as.a(a, this);
    }

    public final void a(int i)
    {
        if (f != null)
        {
            f.a(g, i);
            return;
        } else
        {
            d = i;
            e = 0;
            return;
        }
    }

    public final void a(at at1)
    {
        f = at1;
        g = at1.a(b);
        if (c)
        {
            at1.c(g);
            if (d >= 0)
            {
                at1.a(g, d);
                d = -1;
            }
            if (e != 0)
            {
                at1.b(g, e);
                e = 0;
            }
        }
    }

    public final boolean a(Intent intent, x x)
    {
        if (f != null)
        {
            return f.a(g, intent, x);
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        c = true;
        if (f != null)
        {
            f.c(g);
        }
    }

    public final void b(int i)
    {
        if (f != null)
        {
            f.b(g, i);
            return;
        } else
        {
            e = e + i;
            return;
        }
    }

    public final void c()
    {
        c = false;
        if (f != null)
        {
            f.d(g);
        }
    }

    public final void d()
    {
        if (f != null)
        {
            f.b(g);
            f = null;
            g = 0;
        }
    }
}
