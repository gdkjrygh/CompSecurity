// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.d;

import android.content.Context;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.statistics.i;
import com.gtp.a.a.a.a;
import com.jiubang.goweather.a.h;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import com.jiubang.goweather.b.g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.jiubang.goweather.d:
//            a

public class b
{

    private boolean a;
    private Context b;
    private ArrayList c;
    private h d;
    private com.jiubang.goweather.d.a e;
    private int f;
    private e g;

    public b(Context context, ArrayList arraylist, com.jiubang.goweather.d.a a1)
    {
        f = 0;
        b = context;
        c = arraylist;
        e = a1;
        d = new h(arraylist);
    }

    private f a(String s)
    {
        f f1;
        Time time;
        time = new Time();
        f1 = new f();
        Object obj;
        long l;
        long l1;
        long l2;
        if (g.h().equalsIgnoreCase("GET"))
        {
            obj = com.jiubang.goweather.b.d.a(true);
        } else
        {
            obj = com.jiubang.goweather.b.d.a(true);
        }
        if (!((c) (obj)).a(f1, b))
        {
            break MISSING_BLOCK_LABEL_402;
        }
        f1.d(1);
        time.setToNow();
        l2 = time.toMillis(true);
        f1.a(l2);
        com.gtp.a.a.a.a.a().a("\n -----------------", "weather_statistics_log.txt");
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u5F00\u59CB\u5237\u65B0\u5929\u6C14\uFF1A").append(time.format2445()).toString(), "weather_statistics_log.txt");
        obj = ((c) (obj)).b(s, g, f1);
        com.gtp.a.a.a.a.a().a(s, "weather_request.txt");
        time.setToNow();
        l1 = time.toMillis(true);
        l = l1;
        if (l1 == l2)
        {
            l = l1 + 1000L;
        }
        f1.b(l);
        if (obj == null) goto _L2; else goto _L1
_L1:
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u7ED3\u675F\u5237\u65B0\u5929\u6C14\uFF1A").append(time.format2445()).toString(), "weather_statistics_log.txt");
        if (f1.j() != null)
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u9519\u8BEF\u65E5\u5FD7\uFF1A").append(f1.j()).toString(), "weather_statistics_log.txt");
        }
        f1.b(((String) (obj)));
        time.setToNow();
        l2 = time.toMillis(true);
        f1.c(l2);
        d.a(((String) (obj)), f1, s, b);
        time.setToNow();
        l1 = time.toMillis(true);
        l = l1;
        if (l1 == l2)
        {
            l = l1 + 1000L;
        }
        f1.d(l);
_L4:
        return f1;
_L2:
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u7ED3\u675F\u5237\u65B0\u5929\u6C14\uFF1A").append(time.format2445()).toString(), "weather_statistics_log.txt");
        if (f1.j() == null) goto _L4; else goto _L3
_L3:
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u9519\u8BEF\u65E5\u5FD7\uFF1A").append(f1.j()).toString(), "weather_statistics_log.txt");
        return f1;
        for (s = c.iterator(); s.hasNext(); ((com.jiubang.goweather.a.a)s.next()).h(3)) { }
        f1.b(11);
        f1.c(3);
        return f1;
    }

    private String a()
    {
        StringBuffer stringbuffer = new StringBuffer();
        int k = c.size();
        for (int j = 0; j < k; j++)
        {
            stringbuffer.append(((com.jiubang.goweather.a.a)c.get(j)).c);
            if (j != k - 1)
            {
                stringbuffer.append(",");
            }
        }

        return stringbuffer.toString();
    }

    private e b(int j)
    {
        e e1 = new e("http://goweatherex.3g.cn/goweatherex/weather/getWeather");
        com.jiubang.goweather.b.g.a(b, e1);
        e1.a("w", a());
        Object obj;
        if (a)
        {
            obj = "12";
        } else
        {
            obj = "24";
        }
        e1.a("h", ((String) (obj)));
        e1.a("timestamp", String.valueOf(b()));
        e1.a("sce", Integer.toString(j));
        obj = com.gau.go.launcherex.gowidget.weather.c.c.a(b.getApplicationContext()).e();
        if (((com.gau.go.launcherex.gowidget.weather.d.f) (obj)).a(2) || ((com.gau.go.launcherex.gowidget.weather.d.f) (obj)).a(32) || ((com.gau.go.launcherex.gowidget.weather.d.f) (obj)).a(1) || ((com.gau.go.launcherex.gowidget.weather.d.f) (obj)).a(128))
        {
            e1.a("payment", "1");
            return e1;
        } else
        {
            e1.a("payment", "0");
            return e1;
        }
    }

    private String b()
    {
        StringBuffer stringbuffer = new StringBuffer();
        int k = c.size();
        for (int j = 0; j < k; j++)
        {
            stringbuffer.append(((com.jiubang.goweather.a.a)c.get(j)).p());
            if (j != k - 1)
            {
                stringbuffer.append(",");
            }
        }

        return stringbuffer.toString();
    }

    public void a(int j)
    {
        com.gau.go.launcherex.gowidget.statistics.g g1;
        g = b(j);
        f = 1;
        g1 = new com.gau.go.launcherex.gowidget.statistics.g(b);
_L5:
        if (f > 2) goto _L2; else goto _L1
_L1:
        g.c(f);
        String s = g.i();
        com.gtp.a.a.b.c.a("goweatherex", (new StringBuilder()).append("requestUrl - ").append(s).toString());
_L4:
        Object obj;
        int k;
        obj = a(s);
        ((f) (obj)).f(j);
        g1.a(s, ((f) (obj)));
        k = ((f) (obj)).c();
        if (k != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        i.a(b).a(((f) (obj)));
        e.c(c, ((f) (obj)));
_L2:
        return;
        obj;
        s = null;
_L6:
        ((UnsupportedEncodingException) (obj)).printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
        if (k == 2)
        {
            i.a(b).a(((f) (obj)));
            e.d(c, ((f) (obj)));
            return;
        }
        if (k == 11)
        {
            int l = ((f) (obj)).e();
            if (l == 3)
            {
                e.b(c, ((f) (obj)));
                return;
            }
            i.a(b).a(((f) (obj)));
            if (l == -1 || f > 1)
            {
                e.a(c, ((f) (obj)));
                return;
            }
            f = f + 1;
        }
          goto _L5
        obj;
          goto _L6
    }

    public void a(boolean flag)
    {
        a = flag;
    }
}
