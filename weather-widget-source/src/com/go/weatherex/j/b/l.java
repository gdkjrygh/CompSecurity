// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.go.weatherex.j.g;
import com.go.weatherex.j.k;

// Referenced classes of package com.go.weatherex.j.b:
//            m, d, n, e, 
//            r, o

public class l extends com.go.weatherex.j.l
{

    private final o d = new m(this);

    public l(Context context)
    {
        super(context);
    }

    static void A(l l1)
    {
        l1.b();
    }

    static g B(l l1)
    {
        return l1.b;
    }

    static g C(l l1)
    {
        return l1.b;
    }

    static g D(l l1)
    {
        return l1.b;
    }

    static g E(l l1)
    {
        return l1.b;
    }

    static void F(l l1)
    {
        l1.b();
    }

    static g G(l l1)
    {
        return l1.b;
    }

    static g H(l l1)
    {
        return l1.b;
    }

    static g I(l l1)
    {
        return l1.b;
    }

    static g J(l l1)
    {
        return l1.b;
    }

    static void K(l l1)
    {
        l1.b();
    }

    static g L(l l1)
    {
        return l1.b;
    }

    static g M(l l1)
    {
        return l1.b;
    }

    static g N(l l1)
    {
        return l1.b;
    }

    static g O(l l1)
    {
        return l1.b;
    }

    static void P(l l1)
    {
        l1.b();
    }

    static Context Q(l l1)
    {
        return l1.a;
    }

    static g R(l l1)
    {
        return l1.b;
    }

    static g S(l l1)
    {
        return l1.b;
    }

    static g T(l l1)
    {
        return l1.b;
    }

    static void U(l l1)
    {
        l1.b();
    }

    static g a(l l1)
    {
        return l1.b;
    }

    static k a(l l1, k k1)
    {
        l1.c = k1;
        return k1;
    }

    private void b(d d1)
    {
        if (d1.g() > 1)
        {
            d1.p();
            com.go.weatherex.j.b.n.n().m().b((d)b);
            b();
            return;
        } else
        {
            b(d1.o());
            return;
        }
    }

    static void b(l l1)
    {
        l1.c();
    }

    static g c(l l1)
    {
        return l1.b;
    }

    static g d(l l1)
    {
        return l1.b;
    }

    static g e(l l1)
    {
        return l1.b;
    }

    static g f(l l1)
    {
        return l1.b;
    }

    static g g(l l1)
    {
        return l1.b;
    }

    static g h(l l1)
    {
        return l1.b;
    }

    static void i(l l1)
    {
        l1.b();
    }

    static g j(l l1)
    {
        return l1.b;
    }

    static g k(l l1)
    {
        return l1.b;
    }

    static g l(l l1)
    {
        return l1.b;
    }

    static void m(l l1)
    {
        l1.b();
    }

    static g n(l l1)
    {
        return l1.b;
    }

    static g o(l l1)
    {
        return l1.b;
    }

    static g p(l l1)
    {
        return l1.b;
    }

    static g q(l l1)
    {
        return l1.b;
    }

    static g r(l l1)
    {
        return l1.b;
    }

    static void s(l l1)
    {
        l1.b();
    }

    static g t(l l1)
    {
        return l1.b;
    }

    static void u(l l1)
    {
        l1.b();
    }

    static g v(l l1)
    {
        return l1.b;
    }

    static void w(l l1)
    {
        l1.b();
    }

    static g x(l l1)
    {
        return l1.b;
    }

    static void y(l l1)
    {
        l1.b();
    }

    static void z(l l1)
    {
        l1.b();
    }

    public void a()
    {
        com.go.weatherex.j.b.n.n().b(d);
    }

    protected void a(int i1)
    {
        if (b == null || ((d)b).o() != i1)
        {
            return;
        } else
        {
            b((d)b);
            return;
        }
    }

    protected void a(int i1, int j1)
    {
        if (b != null && ((d)b).o() == i1 && com/go/weatherex/j/b/r.isInstance(b))
        {
            r r1 = (r)b;
            if (j1 == 16)
            {
                b(r1.b);
                return;
            }
            if (j1 == 32)
            {
                b(r1.c);
                return;
            }
        }
    }

    public void a(d d1)
    {
        b = d1;
        ((d)b).a(com.go.weatherex.j.b.n.n().k().a());
        ((d)b).a(com.go.weatherex.j.b.n.n().j());
        com.go.weatherex.j.b.n.n().a(d);
        com.go.weatherex.j.b.n.n().g();
        com.go.weatherex.j.b.n.n().f();
        com.go.weatherex.j.b.n.n().h();
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
