// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class fti
{

    private final ftz a;
    private final fua b;
    private final List c = new ArrayList();

    public fti(ftz ftz1, fua fua1)
    {
        a = ftz1;
        b = fua1;
    }

    public final void a()
    {
        b.d();
    }

    public final void a(ViewGroup viewgroup)
    {
        a.a(viewgroup);
        b.a(viewgroup);
    }

    public final void a(ftj ftj)
    {
        c.add(ftj);
    }

    public final void b()
    {
        b.h();
    }

    public final void b(ftj ftj)
    {
        c.remove(ftj);
    }

    public final void c()
    {
        b.g();
    }

    public final void d()
    {
        b.e();
    }

    public final void e()
    {
        b.f();
    }

    public final void f()
    {
        b.i();
    }
}
