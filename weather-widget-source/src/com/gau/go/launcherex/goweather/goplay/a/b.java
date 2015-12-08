// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay.a;

import android.content.Context;
import android.content.res.Resources;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.jiubang.playsdk.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay.a:
//            c

public class b
{

    private boolean a;
    private final List b = new ArrayList();
    private boolean c;
    private final List d = new ArrayList();
    private boolean e;
    private final List f = new ArrayList();
    private boolean g;
    private final List h = new ArrayList();

    public b()
    {
        a();
    }

    private List a(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("baseThemeBean.getThemeType() value is bad");

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return d;

        case 3: // '\003'
            return f;

        case 4: // '\004'
            return h;
        }
    }

    static void a(b b1, com.gau.go.launcherex.goweather.goplay.a.c c1)
    {
        b1.a(c1);
    }

    private void a(com.gau.go.launcherex.goweather.goplay.a.c c1)
    {
        a a1 = c1.b();
        c1 = c1.a();
        if (a1 != null && c1 != null)
        {
            com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(c1, a1);
            if (a1.h() == 3 || a1.h() == 4)
            {
                a1.c(true);
                return;
            }
        }
    }

    private com.gau.go.launcherex.goweather.goplay.a.c b(int i1, String s)
    {
        for (Iterator iterator = a(i1).iterator(); iterator.hasNext();)
        {
            com.gau.go.launcherex.goweather.goplay.a.c c1 = (com.gau.go.launcherex.goweather.goplay.a.c)iterator.next();
            if (c1.a().x().equals(s))
            {
                return c1;
            }
        }

        return null;
    }

    private List b(int i1)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a(i1).iterator(); iterator.hasNext(); arraylist.add(((com.gau.go.launcherex.goweather.goplay.a.c)iterator.next()).b())) { }
        return arraylist;
    }

    private com.gau.go.launcherex.goweather.goplay.a.c l(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        com.gau.go.launcherex.goweather.goplay.a.c c1 = new com.gau.go.launcherex.goweather.goplay.a.c(this);
        c1.a(b1);
        return c1;
    }

    private void m(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null)
        {
            com.gau.go.launcherex.goweather.goplay.a.c c1 = b(b1.a(), b1.x());
            if (c1 != null)
            {
                com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b2 = c1.a();
                b1.m(b2.q());
                b1.d(b2.h());
                b1.a(b2.b());
                b1.a(b2.d());
                c1.a(b1);
            }
        }
    }

    private void n(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null)
        {
            com.gau.go.launcherex.goweather.goplay.a.c c1 = b(b1.a(), b1.x());
            if (c1 != null)
            {
                a(b1.a()).remove(c1);
            }
        }
    }

    public com.gau.go.launcherex.gowidget.weather.globaltheme.b.b a(int i1, String s)
    {
        Object obj = null;
        com.gau.go.launcherex.goweather.goplay.a.c c1 = b(i1, s);
        s = obj;
        if (c1 != null)
        {
            s = c1.a();
        }
        return s;
    }

    public com.gau.go.launcherex.gowidget.weather.globaltheme.b.b a(Context context, int i1)
    {
        i1;
        JVM INSTR tableswitch 1 4: default 32
    //                   1 42
    //                   2 65
    //                   3 76
    //                   4 76;
           goto _L1 _L2 _L3 _L4 _L4
_L4:
        break MISSING_BLOCK_LABEL_76;
_L1:
        throw new IllegalArgumentException("bad themeType");
_L2:
        context = b(i1, context.getResources().getStringArray(0x7f0d0019)[0]);
_L5:
        if (context == null)
        {
            return null;
        } else
        {
            return context.a();
        }
_L3:
        context = b(i1, "go_widget_theme_white");
          goto _L5
        context = b(i1, "com.gau.go.launcherex.gowidget.weatherwidget");
          goto _L5
    }

    public com.gau.go.launcherex.gowidget.weather.globaltheme.b.b a(a a1)
    {
        if (a1 == null)
        {
            return null;
        } else
        {
            return a(a1.h(), a1.a());
        }
    }

    public void a()
    {
        a = false;
        b.clear();
        c = false;
        d.clear();
        e = false;
        f.clear();
        g = false;
        h.clear();
    }

    public void a(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null && b(b1.a(), b1.x()) == null)
        {
            b.add(0, l(b1));
        }
    }

    public void a(List list)
    {
        b.clear();
        if (list != null)
        {
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)list.get(i1);
                b.add(l(b1));
            }

        }
        a = true;
    }

    public void b(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        m(b1);
    }

    public void b(List list)
    {
        d.clear();
        if (list != null)
        {
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)list.get(i1);
                d.add(l(b1));
            }

        }
        c = true;
    }

    public boolean b()
    {
        return a;
    }

    public List c()
    {
        return b(1);
    }

    public void c(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        n(b1);
    }

    public void c(List list)
    {
        f.clear();
        if (list != null)
        {
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)list.get(i1);
                f.add(l(b1));
            }

        }
        e = true;
    }

    public void d(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null && b(b1.a(), b1.x()) == null)
        {
            d.add(0, l(b1));
        }
    }

    public void d(List list)
    {
        h.clear();
        if (list != null)
        {
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)list.get(i1);
                h.add(l(b1));
            }

        }
        g = true;
    }

    public boolean d()
    {
        return c;
    }

    public List e()
    {
        return b(2);
    }

    public void e(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        m(b1);
    }

    public void f(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null && b(b1.a(), b1.x()) == null)
        {
            f.add(0, l(b1));
        }
    }

    public boolean f()
    {
        return e;
    }

    public void g(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null && b(b1.a(), b1.x()) == null)
        {
            h.add(0, l(b1));
        }
    }

    public boolean g()
    {
        return g;
    }

    public List h()
    {
        return b(3);
    }

    public void h(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        m(b1);
    }

    public List i()
    {
        return b(4);
    }

    public void i(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        m(b1);
    }

    public void j(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        n(b1);
    }

    public boolean k(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 == null)
        {
            return false;
        }
        Object obj;
        if (b1.a() == 1 || b1.a() == 2)
        {
            obj = new ArrayList();
            ((List) (obj)).addAll(a(1));
            ((List) (obj)).addAll(a(2));
        } else
        {
            obj = a(b1.a());
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((com.gau.go.launcherex.goweather.goplay.a.c)((Iterator) (obj)).next()).a().m(false)) { }
        b1.m(true);
        return true;
    }
}
