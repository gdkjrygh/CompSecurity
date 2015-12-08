// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.city.c;
import com.go.weatherex.framework.e;
import com.go.weatherex.home.refresh.PullRefreshLayout;
import com.go.weatherex.viewex.CityNameSwitcher;
import com.go.weatherex.viewex.FrameImageView;
import com.go.weatherex.wear.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.go.weatherex.home:
//            c, d

class m extends e
{

    final com.go.weatherex.home.c a;
    private boolean b;

    private m(com.go.weatherex.home.c c1)
    {
        a = c1;
        super();
        b = false;
    }

    m(com.go.weatherex.home.c c1, d d)
    {
        this(c1);
    }

    private void a(String s)
    {
        Toast.makeText(a.getActivity(), s, 0).show();
    }

    public void a()
    {
        com.go.weatherex.home.c.c(a);
    }

    public void a(String s, String s1, int i)
    {
        if (com.go.weatherex.home.c.f(a).e() == 1)
        {
            com.go.weatherex.home.c.b(a, s);
            com.go.weatherex.home.c.b(a).b(s1, com.go.weatherex.home.c.f(a).g(s));
            com.go.weatherex.home.c.c(a);
            com.go.weatherex.wear.b.a(a.getActivity()).a(s);
            com.go.weatherex.wear.f.a("--------------------------------------------------------------------");
            com.go.weatherex.wear.f.a("\u6DFB\u52A0\u7B2C\u4E00\u4E2A\u57CE\u5E02\uFF0C\u8FDB\u5165\u53D1\u9001\u5361\u7247\u903B\u8F91");
            b = true;
        }
    }

    public void a(List list, int i)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (!((String)list.next()).equals(com.go.weatherex.wear.b.a(a.getActivity()).a()))
            {
                continue;
            }
            com.go.weatherex.home.c.c(a, "");
            com.go.weatherex.wear.b.a(a.getActivity()).b();
            com.go.weatherex.home.c.g(a);
            break;
        } while (true);
    }

    public void a(List list, w w1)
    {
        com.go.weatherex.home.c.d(a).b();
        if (w1 == null) goto _L2; else goto _L1
_L1:
        w1.a;
        JVM INSTR lookupswitch 3: default 52
    //                   1: 53
    //                   2: 52
    //                   11: 366;
           goto _L2 _L3 _L2 _L4
_L2:
        return;
_L3:
        if (w1.e != null && w1.f != null)
        {
            list = new HashMap();
            int j = w1.e.size();
            for (int i = 0; i < j; i++)
            {
                int k = ((Integer)w1.f.get(i)).intValue();
                if (k != 1 && k != 2)
                {
                    list.put(w1.e.get(i), Integer.valueOf(k));
                }
            }

            w1 = com.go.weatherex.home.c.f(a).a(com.go.weatherex.home.c.e(a).b());
            if (w1 != null)
            {
                com.go.weatherex.home.c.b(a).b(w1.d(), com.go.weatherex.home.c.f(a).g(w1.c()));
            }
            if (!list.isEmpty())
            {
                w1 = new StringBuffer();
                list = list.keySet().iterator();
                for (boolean flag = list.hasNext(); flag;)
                {
                    String s = (String)list.next();
                    w1.append(com.go.weatherex.home.c.f(a).e(s));
                    flag = list.hasNext();
                    if (flag)
                    {
                        w1.append("\u3001");
                    } else
                    {
                        w1.append(" ");
                        w1.append(a.getActivity().getString(0x7f0801d3));
                    }
                }

                a(w1.toString());
            }
            if (b)
            {
                b = false;
                com.go.weatherex.wear.f.a("\u5237\u65B0\u5B8C\u6BD5\uFF0C\u53D1\u9001");
                com.go.weatherex.wear.c.a(a.getActivity()).a();
                return;
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
        switch (w1.b)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 9: // '\t'
        default:
            a(a.getActivity().getString(0x7f0801d4));
            return;

        case 3: // '\003'
            a(a.getActivity().getString(0x7f0801d0));
            return;

        case 6: // '\006'
            a(a.getActivity().getString(0x7f0801d7));
            return;

        case 7: // '\007'
            a(a.getActivity().getString(0x7f0801d8));
            return;

        case 8: // '\b'
            a(a.getActivity().getString(0x7f0801d9));
            return;

        case 10: // '\n'
            a(a.getActivity().getString(0x7f0801da));
            break;
        }
        return;
    }

    public void a(boolean flag)
    {
        com.go.weatherex.home.c.c(a);
    }

    public void a(boolean flag, String s, String s1, int i)
    {
        if (flag && com.go.weatherex.home.c.f(a).a(s1) != null)
        {
            com.go.weatherex.home.c.b(a, s1);
            com.go.weatherex.home.c.c(a);
            if (TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && TextUtils.isEmpty(com.go.weatherex.home.c.h(a)))
            {
                b = true;
                com.go.weatherex.wear.b.a(a.getActivity()).a(s1);
            }
            if (s1.equals(com.go.weatherex.wear.b.a(a.getActivity()).a(s, s1)))
            {
                com.go.weatherex.home.c.c(a, s1);
                com.go.weatherex.home.c.g(a);
                return;
            }
        }
    }

    public void b()
    {
        com.go.weatherex.home.c.c(a);
    }

    public void b(boolean flag)
    {
        if (flag);
    }

    public void c()
    {
        if (com.go.weatherex.home.c.k(a).b() && com.go.weatherex.home.c.l(a) != null)
        {
            a.a(false);
            com.go.weatherex.home.c.c(a);
            com.go.weatherex.home.c.m(a).setVisibility(8);
            com.go.weatherex.home.c.l(a).a(true);
            if (com.go.weatherex.home.c.n(a) != null)
            {
                com.go.weatherex.home.c.n(a).setVisibility(8);
            }
        }
    }

    public void c(boolean flag)
    {
        com.go.weatherex.home.c.a(a, flag);
        if (com.go.weatherex.home.c.i(a))
        {
            com.go.weatherex.home.c.j(a).a();
            return;
        } else
        {
            com.go.weatherex.home.c.j(a).b();
            return;
        }
    }

    public void e(int i)
    {
        com.go.weatherex.home.c.c(a);
    }
}
