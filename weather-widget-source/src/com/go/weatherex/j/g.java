// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.go.weatherex.j:
//            o, n, k

public abstract class g
{

    private static final o b = new o();
    protected int a;
    private u c;
    private int d;
    private List e;
    private com.gau.go.launcherex.gowidget.weather.c.g f;
    private Context g;
    private Resources h;
    private int i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final Map p = new HashMap();

    public g(Context context, int i1)
    {
        a = 1;
        c = new u();
        d = 0;
        i = 0;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        g = context;
        h = g.getResources();
        a = i1;
    }

    public void a(int i1)
    {
        i = i1;
    }

    public void a(Resources resources)
    {
        h = resources;
    }

    public void a(com.gau.go.launcherex.gowidget.weather.c.g g1)
    {
        f = g1;
    }

    public void a(u u1)
    {
        c = u1;
    }

    public void a(String s)
    {
        j = s;
        if (TextUtils.isEmpty(j))
        {
            j = "app_widget_theme_default_transparent";
        }
    }

    public void a(ArrayList arraylist)
    {
        e = arraylist;
        int j1 = g();
        for (int i1 = 0; i1 < j1; i1++)
        {
            WeatherBean weatherbean = (WeatherBean)arraylist.get(i1);
            n n2 = (n)p.get(weatherbean.c());
            n n1 = n2;
            if (n2 == null)
            {
                n1 = new n();
                p.put(weatherbean.c(), n1);
            }
            n1.a(i1);
            n1.a(weatherbean);
        }

    }

    public void a(boolean flag)
    {
        l = flag;
    }

    public boolean a()
    {
        return l;
    }

    public void b(String s)
    {
        s = (n)p.get(s);
        if (s != null)
        {
            s.e();
        }
    }

    public void b(boolean flag)
    {
        n = flag;
    }

    public boolean b()
    {
        return n;
    }

    public void c(String s)
    {
        s = (n)p.get(s);
        if (s != null)
        {
            s.f();
        }
    }

    public void c(boolean flag)
    {
        k = flag;
    }

    public boolean c()
    {
        return k;
    }

    public void d(String s)
    {
        if (e != null)
        {
            int i1 = 0;
            while (i1 < e.size()) 
            {
                WeatherBean weatherbean = (WeatherBean)e.get(i1);
                int j1 = weatherbean.e();
                if ("my_location".equals(s) && (j1 == 2 || j1 == 3))
                {
                    d = i1;
                    return;
                }
                if (weatherbean.c().equals(s))
                {
                    d = i1;
                    return;
                }
                i1++;
            }
        }
    }

    public void d(boolean flag)
    {
        m = flag;
    }

    public boolean d()
    {
        return m;
    }

    public void e(boolean flag)
    {
        o = flag;
    }

    public boolean e()
    {
        return o;
    }

    public Resources f()
    {
        return h;
    }

    public int g()
    {
        if (e == null)
        {
            return 0;
        } else
        {
            return e.size();
        }
    }

    public WeatherBean h()
    {
        Object obj = null;
        WeatherBean weatherbean = obj;
        if (e != null)
        {
            weatherbean = obj;
            if (e.size() > 0)
            {
                if (d < 0 || d >= e.size())
                {
                    d = 0;
                }
                weatherbean = (WeatherBean)e.get(d);
            }
        }
        return weatherbean;
    }

    public n i()
    {
        n n1 = null;
        Object obj = h();
        if (obj != null)
        {
            n1 = (n)p.get(((WeatherBean) (obj)).c());
        }
        obj = n1;
        if (n1 == null)
        {
            obj = b;
        }
        return ((n) (obj));
    }

    public int j()
    {
        return a;
    }

    public String k()
    {
        return j;
    }

    public u l()
    {
        return c;
    }

    public com.gau.go.launcherex.gowidget.weather.c.g m()
    {
        return f;
    }

    public Context n()
    {
        return g;
    }

    public int o()
    {
        return i;
    }

    public void p()
    {
        d = d + 1;
    }

    public abstract k q();

}
