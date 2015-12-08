// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.statistics.w;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.d:
//            g

public class f
{

    private static f a;
    private Map b;
    private Context c;
    private int d;

    private f(Context context)
    {
        b = new HashMap();
        c = context;
        j();
    }

    public static f a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/gau/go/launcherex/gowidget/weather/d/f;
        JVM INSTR monitorenter ;
        a = new f(context);
        com/gau/go/launcherex/gowidget/weather/d/f;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/gau/go/launcherex/gowidget/weather/d/f;
        JVM INSTR monitorexit ;
        throw context;
    }

    private boolean c(String s)
    {
        return a(s).a();
    }

    private void j()
    {
        d = d & 0;
        if (k())
        {
            d = d | 0x10;
        }
        if (c("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1") || c("go_weather_ex_premium_pack_promotions"))
        {
            d = d | 2;
        }
        if (c("go_weather_ex_premium_pack_vip") || c("go_weather_ex_premium_pack_vip_promo"))
        {
            d = d | 0x20;
        }
        if (c("go_weather_ex_premium_pack_theme_vip") || c("go_weather_ex_premium_pack_theme_vip_promo"))
        {
            d = d | 0x40;
        }
        if (c("goweatherex_getjar_id"))
        {
            d = d | 1;
        }
        if (c("goweatherex_apk_id"))
        {
            d = d | 8;
        }
        if (c("go_weather_ex_premium_activation"))
        {
            d = d | 0x80;
        }
        if (a())
        {
            d = d | 0x100;
        }
    }

    private boolean k()
    {
        return w.p(c);
    }

    public g a(String s)
    {
        g g2 = (g)b.get(s);
        g g1 = g2;
        if (g2 == null)
        {
            g g3 = new g(c, s);
            g1 = g3;
            if (g3 != null)
            {
                b.put(s, g3);
                g1 = g3;
            }
        }
        return g1;
    }

    public boolean a()
    {
        boolean flag = false;
        String s = w.n(c);
        if ("IN".equalsIgnoreCase(s) || "VN".equalsIgnoreCase(s) || "PK".equalsIgnoreCase(s) || "TH".equalsIgnoreCase(s) || "MY".equalsIgnoreCase(s) || "ID".equalsIgnoreCase(s) || "PH".equalsIgnoreCase(s) || "IR".equalsIgnoreCase(s) || "UA".equalsIgnoreCase(s) || "BR".equalsIgnoreCase(s) || "TR".equalsIgnoreCase(s) || "EG".equalsIgnoreCase(s))
        {
            flag = true;
        }
        return flag;
    }

    public boolean a(int l)
    {
        return (d & l) != 0;
    }

    public boolean a(String s, boolean flag)
    {
        s = a(s);
        if (s.a() != flag)
        {
            s.a(flag);
            j();
            return true;
        } else
        {
            return false;
        }
    }

    public void b(String s)
    {
        if (s.equals("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1") || s.equals("go_weather_ex_premium_pack_promotions") || s.equals("go_weather_ex_premium_pack_vip") || s.equals("go_weather_ex_premium_pack_vip_promo") || s.equals("goweatherex_apk_id") || s.equals("goweatherex_getjar_id") || s.equals("go_weather_ex_premium_activation"))
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
            c.sendBroadcast(intent);
        }
        if (s.equals("go_weather_ex_premium_pack_theme_vip") || s.equals("go_weather_ex_premium_pack_theme_vip_promo") || s.equals("go_weather_ex_premium_pack_vip") || s.equals("go_weather_ex_premium_pack_vip_promo"))
        {
            s = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION");
            c.sendBroadcast(s);
        }
    }

    public boolean b()
    {
        return a(16) || a(2) || a(32) || a(1) || a(8) || a(128) || a(256);
    }

    public boolean c()
    {
        return a(32) || a(64);
    }

    public boolean d()
    {
        return a(32);
    }

    public boolean e()
    {
        return d == 0;
    }

    public boolean f()
    {
        return a(2) && !a(64);
    }

    public boolean g()
    {
        return a(32);
    }

    public void h()
    {
        b.clear();
        j();
    }

    public void i()
    {
        b.clear();
    }
}
