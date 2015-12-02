// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.view.ViewGroup;
import com.ubercab.android.location.UberLatLng;

public final class fwi
{

    private final fwl a;
    private final fwo b;
    private final fxs c;

    public fwi(fwo fwo1, fwl fwl1, fxs fxs1)
    {
        a = fwl1;
        b = fwo1;
        c = fxs1;
    }

    public final void a()
    {
        a.b();
        b.h();
    }

    public final void a(int j, int k)
    {
        float f1 = b.a(j, k);
        a.a(j, k);
        if (c.h())
        {
            c.a(f1, b.p());
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        a.a(viewgroup);
        b.a(viewgroup);
    }

    public final void a(UberLatLng uberlatlng)
    {
        b.a(uberlatlng);
    }

    public final void a(daq daq)
    {
        b.a(daq);
    }

    public final void a(fwj fwj)
    {
        a.a(fwj);
        b.a(fwj);
    }

    public final void a(fwk fwk)
    {
        b.a(fwk);
    }

    public final void a(fzc fzc)
    {
        a.d();
        b.a(fzc);
    }

    public final void b()
    {
        a.c();
        b.i();
    }

    public final void c()
    {
        b.m();
    }

    public final void d()
    {
        b.n();
    }

    public final void e()
    {
        b.j();
    }

    public final void f()
    {
        b.k();
    }

    public final void g()
    {
        b.l();
    }

    public final int h()
    {
        return b.o();
    }

    public final Point i()
    {
        return b.r();
    }
}
