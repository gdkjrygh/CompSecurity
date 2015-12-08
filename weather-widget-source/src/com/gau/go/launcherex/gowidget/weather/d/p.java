// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import android.content.Context;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.googleplay.IabResult;
import com.gau.go.launcherex.gowidget.statistics.w;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.d:
//            f, q

public class p
    implements com.gau.go.launcherex.gowidget.googleplay.IabHelper.OnIabSetupFinishedListener
{

    private static volatile p d;
    private Context a;
    private f b;
    private IabHelper c;
    private boolean e;

    private p(Context context)
    {
        a = context;
        b = GoWidgetApplication.b(context);
    }

    static IabHelper a(p p1)
    {
        return p1.c;
    }

    public static p a(Context context)
    {
        com/gau/go/launcherex/gowidget/weather/d/p;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new p(context);
        }
        context = d;
        com/gau/go/launcherex/gowidget/weather/d/p;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static boolean a(p p1, ArrayList arraylist)
    {
        return p1.a(arraylist);
    }

    static boolean a(p p1, boolean flag)
    {
        p1.e = flag;
        return flag;
    }

    private boolean a(ArrayList arraylist)
    {
        String s = "";
        if (!arraylist.contains("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1")) goto _L2; else goto _L1
_L1:
        s = "com.gau.go.launcherex.gowidget.weatherwidge.billingpay1";
_L4:
        if (!"".equals(s))
        {
            if (b.a(s, true))
            {
                b.b(s);
            }
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (arraylist.contains("go_weather_ex_premium_pack_promotions"))
        {
            s = "go_weather_ex_premium_pack_promotions";
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!b.a("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1", false)) goto _L6; else goto _L5
_L5:
        b.b("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1");
_L8:
        return false;
_L6:
        if (b.a("go_weather_ex_premium_pack_promotions", false))
        {
            b.b("go_weather_ex_premium_pack_promotions");
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static boolean b(p p1, ArrayList arraylist)
    {
        return p1.b(arraylist);
    }

    private boolean b(ArrayList arraylist)
    {
        String s = "";
        if (!arraylist.contains("go_weather_ex_premium_pack_theme_vip")) goto _L2; else goto _L1
_L1:
        s = "go_weather_ex_premium_pack_theme_vip";
_L4:
        if (!"".equals(s))
        {
            if (b.a(s, true))
            {
                b.b(s);
            }
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (arraylist.contains("go_weather_ex_premium_pack_theme_vip_promo"))
        {
            s = "go_weather_ex_premium_pack_theme_vip_promo";
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!b.a("go_weather_ex_premium_pack_theme_vip", false)) goto _L6; else goto _L5
_L5:
        b.b("go_weather_ex_premium_pack_theme_vip");
_L8:
        return false;
_L6:
        if (b.a("go_weather_ex_premium_pack_theme_vip_promo", false))
        {
            b.b("go_weather_ex_premium_pack_theme_vip_promo");
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static boolean c(p p1, ArrayList arraylist)
    {
        return p1.c(arraylist);
    }

    private boolean c(ArrayList arraylist)
    {
        String s = "";
        if (!arraylist.contains("go_weather_ex_premium_pack_vip")) goto _L2; else goto _L1
_L1:
        s = "go_weather_ex_premium_pack_vip";
_L4:
        if (!"".equals(s))
        {
            if (b.a(s, true))
            {
                b.b(s);
            }
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (arraylist.contains("go_weather_ex_premium_pack_vip_promo"))
        {
            s = "go_weather_ex_premium_pack_vip_promo";
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!b.a("go_weather_ex_premium_pack_vip", false)) goto _L6; else goto _L5
_L5:
        b.b("go_weather_ex_premium_pack_vip");
_L8:
        return false;
_L6:
        if (b.a("go_weather_ex_premium_pack_vip_promo", false))
        {
            b.b("go_weather_ex_premium_pack_vip_promo");
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a()
    {
        while (!b.e() && b.a(16) || !w.s(a) || e) 
        {
            return;
        }
        c = new IabHelper(a, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjMLLCo3hpiezV/bPOi83lz3DktmKGQpvsxjE10fF1h+L62vnazigqi+P6m4NFO+jOFT5RX0VPM9SzM6vCGOo9Xjjuk219queZr9SQUKoytfMTsgrtcI1YGDy9maP1owggij0hxWfaBsP4375zP+R89Pzz0R9Ap2tmLLlfIzRZPwqPcnONlQ/8ZqfdxWwCiOOOLHQJ4k1aN6jUPx8ipKWFxo7ORI0TmqgiJvhsFJuBr6QCqoN2BF6QgOfz6fMac1e+EaeJD3/pzUsuzzvvEnh70aoq+6mqZyZmyJb4840OddTGUHX8z3Qeoa/Dti+YQiXtSO3T2ANuF9pzkyBIAQQLwIDAQAB");
        c.enableDebugLogging(true);
        c.startSetup(this);
        e = true;
    }

    public void b()
    {
        d = null;
    }

    public void onIabSetupFinished(IabResult iabresult)
    {
        if (!iabresult.isSuccess())
        {
            while (iabresult.getResponse() == 3 || c == null) 
            {
                return;
            }
            c.logDebug((new StringBuilder()).append("Problem setting up In-app Billing: ").append(iabresult).toString());
            c.dispose();
            return;
        } else
        {
            c.logDebug((new StringBuilder()).append("IAB is fully set up!: ").append(iabresult).toString());
            (new q(this)).c(new IabHelper[] {
                c
            });
            return;
        }
    }
}
