// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.j.g;
import com.go.weatherex.j.j;
import com.go.weatherex.j.k;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.j.c:
//            s, n, d, p, 
//            e

class o extends s
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public void a()
    {
        ((d)n.t(a)).d(true);
        com.go.weatherex.j.c.n.u(a);
    }

    public void a(int i)
    {
    }

    public void a(int i, int k)
    {
    }

    public void a(int i, int k, String s1)
    {
        if (n.B(a) == null || ((d)n.C(a)).o() != i || ((d)n.D(a)).j() != k || TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            ((d)n.E(a)).b(s1);
            n.F(a);
            return;
        }
    }

    public void a(int i, String s1)
    {
        if (n.n(a) == null || i != ((d)n.o(a)).o())
        {
            return;
        } else
        {
            ((d)n.p(a)).a(s1);
            p.o().a(n.q(a));
            return;
        }
    }

    public void a(g g, k k)
    {
        if (k != null && g == n.a(a))
        {
            n.a(a, k);
            n.b(a);
        }
    }

    public void a(j j1)
    {
        if (j1.a() != ((d)n.L(a)).o())
        {
            return;
        } else
        {
            ((d)n.M(a)).d(j1.b());
            ((d)n.N(a)).a(j1.c());
            p.o().a(n.O(a));
            n.P(a);
            return;
        }
    }

    public void a(String s1, u u)
    {
        ((d)com.go.weatherex.j.c.n.j(a)).a(u);
        if (!((d)com.go.weatherex.j.c.n.k(a)).a())
        {
            ((d)n.l(a)).a(true);
            return;
        } else
        {
            n.m(a);
            return;
        }
    }

    public void a(ArrayList arraylist)
    {
        ((d)n.c(a)).a(arraylist);
        if (!((d)n.d(a)).c())
        {
            ((d)n.e(a)).c(true);
            p.o().m().a(((d)n.f(a)).o());
        }
        ((d)com.go.weatherex.j.c.n.g(a)).d(false);
        ((d)n.h(a)).b(false);
        n.i(a);
    }

    public void a(boolean flag)
    {
        Log.i("wss", (new StringBuilder()).append("GoWidgetRemoteViewsManager_onNewThemeFlagChanged = ").append(flag).toString());
        boolean flag1 = r.c(n.Q(a));
        Log.i("wss", (new StringBuilder()).append("GoWidgetRemoteViewsManager_onNewThemeFlagChanged isFirst= ").append(flag1).toString());
        if (flag1)
        {
            ((d)n.R(a)).e(true);
        } else
        {
            ((d)n.S(a)).e(flag);
        }
        n.T(a);
    }

    public void b()
    {
        ((d)n.v(a)).b(true);
        n.w(a);
    }

    public void b(int i)
    {
    }

    public void b(int i, int k, String s1)
    {
        if (n.G(a) == null || ((d)n.H(a)).o() != i || ((d)n.I(a)).j() != k || TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            ((d)n.J(a)).c(s1);
            n.K(a);
            return;
        }
    }

    public void c()
    {
        ((d)n.x(a)).b(false);
        n.y(a);
    }

    public void c(int i)
    {
        a.b(i);
    }

    public void d(int i)
    {
        a.a(i);
    }

    public void e()
    {
        n.A(a);
    }

    public void e(int i)
    {
    }

    public void f()
    {
        n.z(a);
    }

    public void onLanguageChanged(Resources resources)
    {
        ((d)com.go.weatherex.j.c.n.r(a)).a(resources);
        n.s(a);
    }
}
