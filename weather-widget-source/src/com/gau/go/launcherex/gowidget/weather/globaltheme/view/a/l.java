// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.goplay.n;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.gau.go.launcherex.gowidget.weather.globalview.e;
import com.gau.go.launcherex.gowidget.weather.view.AppInSDPromptActivity;
import com.gau.go.launcherex.gowidget.weather.view.ad;
import com.gtp.go.weather.billing.view.PayActivity;
import com.gtp.go.weather.sharephoto.award.k;
import com.jiubang.playsdk.a.y;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            a, b, n, m, 
//            o, p

public class l extends com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.a
{

    private com.gau.go.launcherex.gowidget.weather.globalview.b g;
    private p h;
    private b i;
    private ad j;

    public l(Activity activity)
    {
        super(activity);
    }

    private String a(int i1)
    {
        return a.getString(i1);
    }

    static void a(l l1)
    {
        l1.g();
    }

    private void a(String s)
    {
        Intent intent = new Intent(a, com/gtp/go/weather/billing/view/PayActivity);
        intent.putExtra("extra_package_name", i.x());
        intent.putExtra("theme_pay_type", s);
        intent.putExtra("key_isApkAward", i.b());
        if (i.f() && i.e())
        {
            s = new ArrayList();
            a a1;
            for (Iterator iterator = i.d().iterator(); iterator.hasNext(); intent.putExtra(a1.a(), a1.b()))
            {
                a1 = (a)iterator.next();
                s.add(a1.a());
            }

            intent.putStringArrayListExtra("extra_coupon_ids_arraylist", s);
        }
        a.startActivity(intent);
    }

    static boolean a(l l1, b b1)
    {
        return l1.b(b1);
    }

    private void b(int i1)
    {
        Intent intent = new Intent(a, com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", 8);
        a.startActivity(intent);
    }

    static void b(l l1)
    {
        l1.d();
    }

    static void b(l l1, b b1)
    {
        l1.d(b1);
    }

    private void b(String s)
    {
        Toast.makeText(a, s, 0).show();
    }

    private boolean b(b b1)
    {
        if (b1.B() || com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(a.getApplicationContext(), b1.x())) goto _L2; else goto _L1
_L1:
        b(a.getString(0x7f0804ca));
_L4:
        return false;
_L2:
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext()).e();
        if (((f) (obj)).c())
        {
            break; /* Loop/switch isn't completed */
        }
        if (b1.p() == 2 && !((f) (obj)).b())
        {
            b(1);
            return false;
        }
        if (b1.p() != 3 || b1.h())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.gau.go.launcherex.gowidget.c.g.a(a))
        {
            Toast.makeText(a, a.getString(0x7f080375), 0).show();
            return false;
        }
        if (b1.b())
        {
            c(b1);
            return false;
        }
        obj = com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(a.getApplicationContext(), i.x(), "theme_pay_type");
        com.gtp.a.a.b.c.a("theme_pay", (new StringBuilder()).append("themePayType = ").append(((String) (obj))).toString());
        if (((String) (obj)).equals("0"))
        {
            d(b1);
            return false;
        }
        if (((String) (obj)).equals("2") || ((String) (obj)).equals("1"))
        {
            if (y.a().f(i.x()))
            {
                b1 = new com.go.weatherex.managegood.b.a(i.x(), 2, y.a().g(i.x()));
                com.go.weatherex.managegood.a.c.a().a(a, b1);
            } else
            {
                a(((String) (obj)));
            }
            g();
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(a.getApplicationContext(), b1))
        {
            c();
            return false;
        }
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(a.getApplicationContext()))
        {
            e();
        }
        b1.m(true);
        if (!c);
        if (b != null)
        {
            b.a(i);
        }
        return true;
    }

    static b c(l l1)
    {
        return l1.i;
    }

    private void c()
    {
        if (g == null)
        {
            g = new com.gau.go.launcherex.gowidget.weather.globalview.b(a, e.b);
            g.b(0x7f0801ec);
            g.c(0x7f0804c9);
            g.d(0x7f080267);
            g.a(new com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.n(this));
        }
        if (!a.isFinishing() && !g.isShowing())
        {
            g.a();
        }
    }

    private void c(b b1)
    {
        k k1 = new k(a);
        k1.a(new m(this, b1, k1));
        k.a(a, b1.x());
        f();
    }

    private void d()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.gau.go.launcherex.gowidget.weatherwidget&referrer=utm_source%3Dthemeupdate%26utm_medium%3DHyperlink%26utm_campaign%3Dthemes"));
        intent.setPackage("com.android.vending");
        intent.setFlags(0x10000000);
        try
        {
            a.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.gau.go.launcherex.gowidget.weatherwidget&referrer=utm_source%3Dthemeupdate%26utm_medium%3DHyperlink%26utm_campaign%3Dthemes"));
            intent1.setFlags(0x10000000);
            try
            {
                a.startActivity(intent1);
                return;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                activitynotfoundexception1.printStackTrace();
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void d(b b1)
    {
        Intent intent;
        intent = new Intent();
        intent.setClassName(b1.x(), "com.gau.go.weatherex.framework.billing.PayActivity");
        if (i.f() && i.e())
        {
            b1 = new ArrayList();
            a a1;
            for (Iterator iterator = i.d().iterator(); iterator.hasNext(); intent.putExtra(a1.a(), a1.b()))
            {
                a1 = (a)iterator.next();
                b1.add(a1.a());
            }

            intent.putStringArrayListExtra("extra_coupon_ids_arraylist", b1);
        }
        a.startActivity(intent);
_L1:
        return;
        b1;
        if (com.gtp.a.a.b.c.a())
        {
            b1.printStackTrace();
            return;
        }
          goto _L1
    }

    private void e()
    {
        Intent intent = new Intent(a, com/gau/go/launcherex/gowidget/weather/view/AppInSDPromptActivity);
        a.startActivity(intent);
    }

    private void f()
    {
label0:
        {
            if (!a.isFinishing())
            {
                if (j == null)
                {
                    break label0;
                }
                if (!j.isShowing())
                {
                    j.show();
                }
            }
            return;
        }
        j = ad.a(a);
        j.setCanceledOnTouchOutside(false);
        j.setOnKeyListener(new o(this));
        j.a(a(0x7f0804b3));
        j.show();
    }

    private void g()
    {
        if (!a.isFinishing() && j != null && j.isShowing())
        {
            j.dismiss();
            j = null;
        }
    }

    public void a()
    {
        h = new p(this, null);
        new IntentFilter();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION");
        a(((android.content.BroadcastReceiver) (h)), intentfilter);
    }

    public void a(b b1)
    {
        i = b1;
        boolean flag = b(b1);
        n.a(a).a(i.x(), flag);
    }

    public boolean a(Activity activity)
    {
        boolean flag = super.a(activity);
        if (flag)
        {
            j = null;
            g = null;
        }
        return flag;
    }

    public void b()
    {
        a(h);
    }
}
