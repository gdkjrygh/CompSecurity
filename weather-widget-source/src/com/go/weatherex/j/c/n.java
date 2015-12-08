// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.go.weatherex.j.g;
import com.go.weatherex.j.k;
import com.go.weatherex.j.l;

// Referenced classes of package com.go.weatherex.j.c:
//            o, p, d, e, 
//            r

public class n extends l
{

    private final r d = new o(this);

    public n(Context context)
    {
        super(context);
    }

    static void A(n n1)
    {
        n1.b();
    }

    static g B(n n1)
    {
        return n1.b;
    }

    static g C(n n1)
    {
        return n1.b;
    }

    static g D(n n1)
    {
        return n1.b;
    }

    static g E(n n1)
    {
        return n1.b;
    }

    static void F(n n1)
    {
        n1.b();
    }

    static g G(n n1)
    {
        return n1.b;
    }

    static g H(n n1)
    {
        return n1.b;
    }

    static g I(n n1)
    {
        return n1.b;
    }

    static g J(n n1)
    {
        return n1.b;
    }

    static void K(n n1)
    {
        n1.b();
    }

    static g L(n n1)
    {
        return n1.b;
    }

    static g M(n n1)
    {
        return n1.b;
    }

    static g N(n n1)
    {
        return n1.b;
    }

    static g O(n n1)
    {
        return n1.b;
    }

    static void P(n n1)
    {
        n1.b();
    }

    static Context Q(n n1)
    {
        return n1.a;
    }

    static g R(n n1)
    {
        return n1.b;
    }

    static g S(n n1)
    {
        return n1.b;
    }

    static void T(n n1)
    {
        n1.b();
    }

    static g a(n n1)
    {
        return n1.b;
    }

    static k a(n n1, k k1)
    {
        n1.c = k1;
        return k1;
    }

    static void b(n n1)
    {
        n1.c();
    }

    static g c(n n1)
    {
        return n1.b;
    }

    static g d(n n1)
    {
        return n1.b;
    }

    static g e(n n1)
    {
        return n1.b;
    }

    static g f(n n1)
    {
        return n1.b;
    }

    static g g(n n1)
    {
        return n1.b;
    }

    static g h(n n1)
    {
        return n1.b;
    }

    static void i(n n1)
    {
        n1.b();
    }

    static g j(n n1)
    {
        return n1.b;
    }

    static g k(n n1)
    {
        return n1.b;
    }

    static g l(n n1)
    {
        return n1.b;
    }

    static void m(n n1)
    {
        n1.b();
    }

    static g n(n n1)
    {
        return n1.b;
    }

    static g o(n n1)
    {
        return n1.b;
    }

    static g p(n n1)
    {
        return n1.b;
    }

    static g q(n n1)
    {
        return n1.b;
    }

    static g r(n n1)
    {
        return n1.b;
    }

    static void s(n n1)
    {
        n1.b();
    }

    static g t(n n1)
    {
        return n1.b;
    }

    static void u(n n1)
    {
        n1.b();
    }

    static g v(n n1)
    {
        return n1.b;
    }

    static void w(n n1)
    {
        n1.b();
    }

    static g x(n n1)
    {
        return n1.b;
    }

    static void y(n n1)
    {
        n1.b();
    }

    static void z(n n1)
    {
        n1.b();
    }

    public void a()
    {
        com.go.weatherex.j.c.p.o().b(d);
    }

    protected void a(int i1)
    {
        if (b == null || ((d)b).o() != i1)
        {
            return;
        }
        if (((d)b).g() > 1)
        {
            ((d)b).p();
            com.go.weatherex.j.c.p.o().m().c((d)b);
            b();
            return;
        } else
        {
            b(i1);
            return;
        }
    }

    public void a(d d1)
    {
        b = d1;
        ((d)b).a(com.go.weatherex.j.c.p.o().k().a());
        ((d)b).a(com.go.weatherex.j.c.p.o().j());
        com.go.weatherex.j.c.p.o().a(d);
        com.go.weatherex.j.c.p.o().g();
        com.go.weatherex.j.c.p.o().f();
        com.go.weatherex.j.c.p.o().h();
        ((d)b).c(false);
        ((d)b).a(false);
    }

    public volatile void a(g g1)
    {
        a((d)g1);
    }

    protected void b(int i1)
    {
        if (b == null || ((d)b).o() != i1)
        {
            return;
        }
        WeatherBean weatherbean = ((d)b).h();
        Object obj = "";
        if (weatherbean != null)
        {
            obj = weatherbean.c();
        }
        obj = com.gau.go.launcherex.gowidget.weather.util.p.a(((d)b).n(), ((String) (obj)), true, ((d)b).r(), "", -1);
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).putExtra("gowidget_Id", ((d)b).o());
        try
        {
            ((d)b).n().startActivity(((Intent) (obj)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            activitynotfoundexception.printStackTrace();
        }
    }
}
