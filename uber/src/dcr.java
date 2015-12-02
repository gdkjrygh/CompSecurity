// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class dcr extends dcq
    implements dam, gmk
{

    private final cxu a;
    private final gmg b;
    private final dal c;
    private final gro d;

    public dcr(cxu cxu1, gmg gmg1, gro gro1, dal dal1)
    {
        a = cxu1;
        b = gmg1;
        d = gro1;
        c = dal1;
        b.a(this);
        c.a(this);
    }

    private void f()
    {
        String s;
        if (!d.a())
        {
            if (!TextUtils.isEmpty(s = c.z()))
            {
                d.a(s);
                return;
            }
        }
    }

    private void g()
    {
        if (d.a())
        {
            d.b();
        }
    }

    private void h()
    {
        if (k())
        {
            d.a(a.a());
        }
    }

    private void i()
    {
        if (k())
        {
            d.b(a.a());
        }
    }

    private boolean j()
    {
        return b.a(dbf.O);
    }

    private boolean k()
    {
        return b.a(dbf.ai);
    }

    protected final void a()
    {
        h();
        if (j())
        {
            f();
        }
    }

    public final void a(gmj gmj)
    {
        if (j())
        {
            f();
            return;
        } else
        {
            g();
            return;
        }
    }

    public final void a(String s)
    {
        if (j())
        {
            f();
        }
    }

    protected final void b()
    {
        if (j())
        {
            g();
        }
        i();
    }

    public final void c()
    {
        if (j())
        {
            g();
        }
    }
}
