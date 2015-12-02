// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class lw
{

    public static final String a = oe.a("emulator");
    private final Date b;
    private final String c;
    private final int d;
    private final Set e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map i;
    private final String j;
    private final String k;
    private final pd l;
    private final int m;
    private final Set n;
    private final Bundle o;
    private final Set p;

    public lw(lx lx1)
    {
        this(lx1, (byte)0);
    }

    private lw(lx lx1, byte byte0)
    {
        b = lx.a(lx1);
        c = lx.b(lx1);
        d = lx.c(lx1);
        e = Collections.unmodifiableSet(lx.d(lx1));
        f = lx.e(lx1);
        g = lx.f(lx1);
        h = lx.g(lx1);
        i = Collections.unmodifiableMap(lx.h(lx1));
        j = lx.i(lx1);
        k = lx.j(lx1);
        l = null;
        m = lx.k(lx1);
        n = Collections.unmodifiableSet(lx.l(lx1));
        o = lx.m(lx1);
        p = Collections.unmodifiableSet(lx.n(lx1));
    }

    public final Bundle a(Class class1)
    {
        return h.getBundle(class1.getName());
    }

    public final Date a()
    {
        return b;
    }

    public final boolean a(Context context)
    {
        Set set = n;
        kx.a();
        return set.contains(oe.a(context));
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final Set d()
    {
        return e;
    }

    public final Location e()
    {
        return f;
    }

    public final boolean f()
    {
        return g;
    }

    public final String g()
    {
        return j;
    }

    public final String h()
    {
        return k;
    }

    public final pd i()
    {
        return l;
    }

    public final Map j()
    {
        return i;
    }

    public final Bundle k()
    {
        return h;
    }

    public final int l()
    {
        return m;
    }

    public final Bundle m()
    {
        return o;
    }

    public final Set n()
    {
        return p;
    }

    static 
    {
        kx.a();
    }
}
