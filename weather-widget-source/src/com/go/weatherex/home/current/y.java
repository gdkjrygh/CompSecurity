// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.scroller.WeatherDetailScrollGroup;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.e;
import com.go.weatherex.home.current.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            w, CurrentWeatherContent, x

class y extends e
{

    final com.go.weatherex.home.current.w a;

    private y(com.go.weatherex.home.current.w w1)
    {
        a = w1;
        super();
    }

    y(com.go.weatherex.home.current.w w1, x x)
    {
        this(w1);
    }

    public void a()
    {
        w.d(a);
        for (int i = 0; i < com.go.weatherex.home.current.w.a(a).getChildCount(); i++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(i);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().d();
            }
        }

    }

    public void a(int i)
    {
        w.d(a);
        for (int j = 0; j < com.go.weatherex.home.current.w.a(a).getChildCount(); j++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().b(i);
            }
        }

    }

    public void a(String s, String s1, int i)
    {
        if (!TextUtils.isEmpty(s))
        {
            s1 = com.go.weatherex.home.current.w.e(a);
            s1.a(s);
            s1.a(a);
            s1.a();
            com.go.weatherex.home.current.w.a(a).addView(s1);
            com.go.weatherex.home.current.w.a(a).a();
            com.go.weatherex.home.current.w.a(a).a(com.go.weatherex.home.current.w.a(a).getChildCount() - 1);
            com.go.weatherex.home.current.w.a(a, s);
            if (com.go.weatherex.home.current.w.a(a).getChildCount() == 1)
            {
                com.go.weatherex.home.current.w.a(a, 0);
                s1.setOnScrollListener(a);
            }
        }
    }

    public void a(List list, int i)
    {
        int k = com.go.weatherex.home.current.w.a(a).getChildCount();
        if (list != null && !list.isEmpty() && k > 1)
        {
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                String s = (String)list.next();
                if (!TextUtils.isEmpty(s))
                {
                    int j = 0;
                    while (j < k) 
                    {
                        CurrentWeatherContent currentweathercontent1 = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
                        if (currentweathercontent1 != null && s.equals(currentweathercontent1.c()))
                        {
                            arraylist.add(currentweathercontent1);
                        }
                        j++;
                    }
                }
            } while (true);
            boolean flag1;
            if (!arraylist.isEmpty())
            {
                list = arraylist.iterator();
                boolean flag = false;
                do
                {
                    flag1 = flag;
                    if (!list.hasNext())
                    {
                        break;
                    }
                    CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)list.next();
                    if (com.go.weatherex.home.current.w.a(a).indexOfChild(currentweathercontent) == w.g(a))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    flag |= flag1;
                    com.go.weatherex.home.current.w.a(a).removeView(currentweathercontent);
                    currentweathercontent.f();
                } while (true);
            } else
            {
                flag1 = false;
            }
            com.go.weatherex.home.current.w.a(a).a();
            list = a;
            if (i >= k)
            {
                i = k - 1;
            }
            com.go.weatherex.home.current.w.a(list, i);
            com.go.weatherex.home.current.w.a(a).a(w.g(a));
            w.h(a);
            w.i(a);
            if (flag1)
            {
                a.a(12, w.j(a), 10L, true);
                return;
            }
        }
    }

    public void a(List list, w w1)
    {
        boolean flag = false;
        int i = 0;
        while (i < com.go.weatherex.home.current.w.a(a).getChildCount()) 
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(i);
            if (currentweathercontent != null)
            {
                currentweathercontent.b();
                currentweathercontent.a(w1);
            }
            i++;
        }
        i = ((flag) ? 1 : 0);
        if (!w.b(a))
        {
            com.go.weatherex.home.current.w.a(a, true);
            w.c(a);
            i = ((flag) ? 1 : 0);
        }
        for (; i < com.go.weatherex.home.current.w.a(a).getChildCount(); i++)
        {
            CurrentWeatherContent currentweathercontent1 = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(i);
            if (currentweathercontent1 != null && currentweathercontent1.h() != null)
            {
                currentweathercontent1.h().a(list, w1);
            }
        }

    }

    public void a(boolean flag, String s, String s1, int i)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        if (w.b(a, s1)) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(s) && w.b(a, s)) goto _L4; else goto _L3
_L3:
        s = com.go.weatherex.home.current.w.e(a);
        s.a(s1);
        s.a(a);
        s.a();
        com.go.weatherex.home.current.w.a(a).addView(s);
        if (com.go.weatherex.home.current.w.a(a).getChildCount() == 1)
        {
            s.setOnScrollListener(a);
        }
_L5:
        com.go.weatherex.home.current.w.a(a).a();
        CurrentWeatherContent currentweathercontent;
        int j;
        if (i >= com.go.weatherex.home.current.w.a(a).getChildCount())
        {
            if (w.g(a) < com.go.weatherex.home.current.w.a(a).getChildCount())
            {
                i = w.g(a);
            } else
            {
                i = 0;
            }
        }
        com.go.weatherex.home.current.w.a(a).a(i);
        return;
_L4:
        j = 0;
_L6:
        if (j < com.go.weatherex.home.current.w.a(a).getChildCount())
        {
label0:
            {
                currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
                if (currentweathercontent == null || !s.equals(currentweathercontent.c()))
                {
                    break label0;
                }
                currentweathercontent.a(s1);
                currentweathercontent.a();
            }
        }
          goto _L5
        j++;
          goto _L6
_L2:
        if (TextUtils.isEmpty(s) || com.go.weatherex.home.current.w.f(a).a(s) != null) goto _L5; else goto _L7
_L7:
        j = 0;
_L10:
        if (j >= com.go.weatherex.home.current.w.a(a).getChildCount()) goto _L5; else goto _L8
_L8:
        s1 = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
          goto _L9
_L12:
        j++;
          goto _L10
_L9:
        if (s1 == null || !s.equals(s1.c())) goto _L12; else goto _L11
_L11:
        com.go.weatherex.home.current.w.a(a).removeView(s1);
        s1.f();
          goto _L5
    }

    public void b()
    {
        w.d(a);
        for (int i = 0; i < com.go.weatherex.home.current.w.a(a).getChildCount(); i++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(i);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().e();
            }
        }

    }

    public void b(int i)
    {
        w.d(a);
        for (int j = 0; j < com.go.weatherex.home.current.w.a(a).getChildCount(); j++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().c(i);
            }
        }

    }

    public void c()
    {
        w.d(a);
        for (int i = 0; i < com.go.weatherex.home.current.w.a(a).getChildCount(); i++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(i);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().f();
            }
        }

    }

    public void c(int i)
    {
        w.d(a);
        for (int j = 0; j < com.go.weatherex.home.current.w.a(a).getChildCount(); j++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().d(i);
            }
        }

    }

    public void d(int i)
    {
        w.d(a);
        for (int j = 0; j < com.go.weatherex.home.current.w.a(a).getChildCount(); j++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().e(i);
            }
        }

    }

    public void e(int i)
    {
        w.d(a);
        for (int j = 0; j < com.go.weatherex.home.current.w.a(a).getChildCount(); j++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)com.go.weatherex.home.current.w.a(a).getChildAt(j);
            if (currentweathercontent != null && currentweathercontent.h() != null)
            {
                currentweathercontent.h().f(i);
            }
        }

    }
}
