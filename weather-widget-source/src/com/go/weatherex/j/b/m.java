// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.content.res.Resources;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.j.g;
import com.go.weatherex.j.j;
import com.go.weatherex.j.k;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.j.b:
//            p, l, d, n, 
//            e

class m extends p
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void a()
    {
        ((d)l.t(a)).d(true);
        com.go.weatherex.j.b.l.u(a);
    }

    public void a(int i)
    {
    }

    public void a(int i, int k)
    {
    }

    public void a(int i, int k, String s)
    {
        if (l.G(a) == null || ((d)l.H(a)).o() != i || ((d)l.I(a)).j() != k || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            ((d)l.J(a)).b(s);
            l.K(a);
            return;
        }
    }

    public void a(int i, String s)
    {
        if (l.n(a) == null || i != ((d)l.o(a)).o())
        {
            return;
        } else
        {
            ((d)l.p(a)).a(s);
            n.n().a(l.q(a));
            return;
        }
    }

    public void a(g g, k k)
    {
        if (k != null && g == l.a(a))
        {
            l.a(a, k);
            l.b(a);
        }
    }

    public void a(j j1)
    {
        if (j1.a() != ((d)l.B(a)).o())
        {
            return;
        } else
        {
            ((d)l.C(a)).d(j1.b());
            ((d)l.D(a)).a(j1.c());
            n.n().a(l.E(a));
            l.F(a);
            return;
        }
    }

    public void a(String s, u u)
    {
        ((d)com.go.weatherex.j.b.l.j(a)).a(u);
        if (!((d)com.go.weatherex.j.b.l.k(a)).a())
        {
            ((d)l.l(a)).a(true);
            return;
        } else
        {
            l.m(a);
            return;
        }
    }

    public void a(ArrayList arraylist)
    {
        ((d)l.c(a)).a(arraylist);
        if (!((d)l.d(a)).c())
        {
            ((d)l.e(a)).c(true);
            n.n().m().a(((d)l.f(a)).o());
        }
        ((d)com.go.weatherex.j.b.l.g(a)).d(false);
        ((d)l.h(a)).b(false);
        l.i(a);
    }

    public void a(boolean flag)
    {
        if (r.c(l.Q(a)))
        {
            ((d)l.R(a)).e(true);
        } else
        {
            ((d)l.S(a)).e(flag);
        }
        ((d)l.T(a)).e(flag);
        l.U(a);
    }

    public void b()
    {
        ((d)l.v(a)).b(true);
        l.w(a);
    }

    public void b(int i)
    {
    }

    public void b(int i, int k, String s)
    {
        if (l.L(a) == null || ((d)l.M(a)).o() != i || ((d)l.N(a)).j() != k || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            ((d)l.O(a)).c(s);
            l.P(a);
            return;
        }
    }

    public void c()
    {
        ((d)l.x(a)).b(false);
        l.y(a);
    }

    public void c(int i)
    {
        a.b(i);
    }

    public void c(int i, int k)
    {
        a.a(i, k);
    }

    public void d(int i)
    {
        a.a(i);
    }

    public void e()
    {
        l.A(a);
    }

    public void e(int i)
    {
    }

    public void f()
    {
        l.z(a);
    }

    public void onLanguageChanged(Resources resources)
    {
        ((d)com.go.weatherex.j.b.l.r(a)).a(resources);
        l.s(a);
    }
}
