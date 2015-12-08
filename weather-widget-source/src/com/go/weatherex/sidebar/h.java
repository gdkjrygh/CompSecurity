// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.city.EditCityScrollComponent;
import com.go.weatherex.city.a;
import com.go.weatherex.framework.e;
import java.util.List;

// Referenced classes of package com.go.weatherex.sidebar:
//            b, SidebarGoAdView, c

class h extends e
{

    final b a;

    private h(b b1)
    {
        a = b1;
        super();
    }

    h(b b1, c c1)
    {
        this(b1);
    }

    private void a(String s, WeatherBean weatherbean)
    {
        s = com.go.weatherex.sidebar.b.d(a).a(s);
        if (s != null)
        {
            s.a(weatherbean);
            return;
        } else
        {
            com.go.weatherex.sidebar.b.d(a).a(weatherbean);
            return;
        }
    }

    public void a()
    {
        com.go.weatherex.sidebar.b.d(a).d();
    }

    public void a(int i)
    {
        com.go.weatherex.sidebar.b.d(a).d();
    }

    public void a(String s, String s1, int i)
    {
        com.go.weatherex.sidebar.b.d(a).a(com.go.weatherex.sidebar.b.e(a).a(s));
    }

    public void a(List list, w w)
    {
        com.go.weatherex.sidebar.b.d(a).c();
    }

    public void a(boolean flag)
    {
        com.go.weatherex.sidebar.b.d(a).d();
    }

    public void a(boolean flag, String s, String s1, int i)
    {
        WeatherBean weatherbean;
label0:
        {
            if (flag)
            {
                weatherbean = com.go.weatherex.sidebar.b.e(a).a(s1);
                if (weatherbean != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(s))
        {
            a a1 = com.go.weatherex.sidebar.b.d(a).a(s);
            if (s.equals(s1))
            {
                a1.a(weatherbean);
                return;
            }
            s = com.go.weatherex.sidebar.b.e(a).a(s);
            if (s == null)
            {
                com.go.weatherex.sidebar.b.d(a).a(a1);
            } else
            {
                a1.e = s.e();
            }
            a(s1, weatherbean);
            return;
        } else
        {
            a(s1, weatherbean);
            return;
        }
    }

    public void b()
    {
        com.go.weatherex.sidebar.b.d(a).d();
    }

    public void c()
    {
        super.c();
        com.go.weatherex.sidebar.b.f(a);
        com.go.weatherex.sidebar.b.g(a).a();
    }

    public void e()
    {
        com.go.weatherex.sidebar.b.d(a).d();
    }
}
