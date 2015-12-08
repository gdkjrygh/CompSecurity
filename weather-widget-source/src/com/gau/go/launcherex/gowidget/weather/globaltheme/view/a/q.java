// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.goplay.n;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.globalview.aa;
import com.gau.go.launcherex.gowidget.weather.globalview.e;
import com.gau.go.launcherex.gowidget.weather.globalview.y;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.k;
import com.gau.go.launcherex.gowidget.weather.view.GoWidgetGuideActivity;
import com.gtp.go.weather.billing.view.PayActivity;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            a, s, b, r, 
//            t, v, u

public class q extends com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.a
{

    private d g;
    private SharedPreferences h;
    private com.gau.go.launcherex.gowidget.weather.globalview.b i;
    private y j;
    private v k;
    private b l;
    private boolean m;
    private boolean n;
    private boolean o;
    private u p;

    public q(Activity activity)
    {
        super(activity);
        h = null;
        m = true;
        n = false;
        o = false;
    }

    private String a(int i1)
    {
        return a.getString(i1);
    }

    static void a(q q1)
    {
        q1.d();
    }

    private void a(String s1)
    {
        Intent intent = new Intent(a, com/gtp/go/weather/billing/view/PayActivity);
        intent.putExtra("extra_package_name", l.x());
        intent.putExtra("theme_pay_type", s1);
        intent.putExtra("key_isApkAward", l.b());
        if (l.f() && l.e())
        {
            s1 = new ArrayList();
            a a1;
            for (Iterator iterator = l.d().iterator(); iterator.hasNext(); intent.putExtra(a1.a(), a1.b()))
            {
                a1 = (a)iterator.next();
                s1.add(a1.a());
            }

            intent.putStringArrayListExtra("extra_coupon_ids_arraylist", s1);
        }
        a.startActivity(intent);
    }

    static boolean a(q q1, b b1)
    {
        return q1.b(b1);
    }

    static boolean a(q q1, boolean flag)
    {
        q1.m = flag;
        return flag;
    }

    private void b(int i1)
    {
        com.gau.go.launcherex.gowidget.weather.globalview.b b1;
        b1 = new com.gau.go.launcherex.gowidget.weather.globalview.b(a, e.c);
        b1.b(0x7f0804e4);
        b1.a(true);
        b1.b(false);
        b1.a(new s(this, i1));
        i1;
        JVM INSTR tableswitch 3 4: default 68
    //                   3 73
    //                   4 113;
           goto _L1 _L2 _L3
_L1:
        b1.a();
        return;
_L2:
        b1.c(0x7f080562);
        b1.d(0x7f080534);
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a))
        {
            b1.e(0x7f08032d);
        } else
        {
            b1.e(0x7f08032b);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        b1.c(0x7f080560);
        b1.d(0x7f080561);
        b1.e(0x7f08032b);
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void b(q q1)
    {
        q1.g();
    }

    static void b(q q1, b b1)
    {
        q1.d(b1);
    }

    private void b(String s1)
    {
        if (j == null)
        {
            j = new y(a, aa.b);
            j.a(0x7f0801ec);
            j.c(0x7f08032b);
        }
        j.a(s1);
        if (!a.isFinishing() && !j.isShowing())
        {
            j.show();
        }
    }

    private boolean b(b b1)
    {
        boolean flag = false;
        if (b1.B() || com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(a.getApplicationContext(), b1.x())) goto _L2; else goto _L1
_L1:
        c(a.getString(0x7f0804ca));
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
            c(1);
            return false;
        }
        if (b1.p() != 3 || b1.h())
        {
            break; /* Loop/switch isn't completed */
        }
        if (b1.b())
        {
            c(b1);
            return false;
        }
        obj = com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(a.getApplicationContext(), l.x(), "theme_pay_type");
        com.gtp.a.a.b.c.a("theme_pay", (new StringBuilder()).append("themePayType = ").append(((String) (obj))).toString());
        if (((String) (obj)).equals("0"))
        {
            d(b1);
            return false;
        }
        if (((String) (obj)).equals("2") || ((String) (obj)).equals("1"))
        {
            if (com.jiubang.playsdk.a.y.a().f(l.x()))
            {
                b1 = new com.go.weatherex.managegood.b.a(l.x(), 2, com.jiubang.playsdk.a.y.a().g(l.x()));
                com.go.weatherex.managegood.a.c.a().a(a, b1);
                return false;
            } else
            {
                a(((String) (obj)));
                return false;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(a.getApplicationContext(), b1))
        {
            e();
            return false;
        }
        if (!com.gau.go.launcherex.gowidget.weather.util.k.a(a.getApplicationContext()))
        {
            b(4);
            return false;
        }
        if (e)
        {
            flag = c();
        }
        if (d && !flag)
        {
            e(l);
        }
        b1.m(true);
        if (c)
        {
            g.a(2, b1);
        }
        if (b != null)
        {
            b.a(l);
        }
        return true;
    }

    static boolean b(q q1, boolean flag)
    {
        q1.n = flag;
        return flag;
    }

    static SharedPreferences c(q q1)
    {
        return q1.h;
    }

    private void c(int i1)
    {
        Intent intent = new Intent(a, com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", 8);
        a.startActivity(intent);
    }

    private void c(b b1)
    {
        com.gtp.go.weather.sharephoto.award.k k1 = new com.gtp.go.weather.sharephoto.award.k(a);
        k1.a(new r(this, b1, k1));
        com.gtp.go.weather.sharephoto.award.k.a(a, b1.x());
    }

    private void c(String s1)
    {
        Toast.makeText(a, s1, 0).show();
    }

    private boolean c()
    {
        if (h.getBoolean("show_widget_tip_dialog", true) && !m)
        {
            b(3);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean c(q q1, boolean flag)
    {
        q1.o = flag;
        return flag;
    }

    private void d()
    {
        Intent intent = new Intent(a, com/gau/go/launcherex/gowidget/weather/view/GoWidgetGuideActivity);
        a.startActivity(intent);
    }

    private void d(b b1)
    {
        Intent intent;
        intent = new Intent();
        intent.setClassName(b1.x(), "com.gau.go.weatherex.framework.billing.PayActivity");
        if (l.f() && l.e())
        {
            b1 = new ArrayList();
            a a1;
            for (Iterator iterator = l.d().iterator(); iterator.hasNext(); intent.putExtra(a1.a(), a1.b()))
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

    static void d(q q1)
    {
        q1.f();
    }

    static b e(q q1)
    {
        return q1.l;
    }

    private void e()
    {
        if (i == null)
        {
            i = new com.gau.go.launcherex.gowidget.weather.globalview.b(a, e.b);
            i.b(0x7f0801ec);
            i.c(0x7f0804c9);
            i.d(0x7f080267);
            i.a(new t(this));
        }
        if (!a.isFinishing() && !i.isShowing())
        {
            i.a();
        }
    }

    private boolean e(b b1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        boolean flag;
        boolean flag1;
        if (n && !b1.i())
        {
            stringbuffer.append(a(0x7f08052b));
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (o)
        {
            flag1 = flag;
            if (!b1.j())
            {
                if (flag)
                {
                    stringbuffer.append(", ");
                }
                stringbuffer.append(a(0x7f08052d));
                flag1 = true;
            }
        }
        if (flag1)
        {
            b(String.format(a(0x7f080564), new Object[] {
                stringbuffer.toString()
            }));
        }
        return flag1;
    }

    private void f()
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

    static boolean f(q q1)
    {
        return q1.m;
    }

    private void g()
    {
        com.gau.go.launcherex.gowidget.weather.util.k.a(a.getApplicationContext(), 2);
    }

    public void a()
    {
        g = new d(a.getApplicationContext());
        h = GoWidgetApplication.c(a.getApplicationContext()).a();
        k = new v(this, null);
        new IntentFilter();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION");
        a(((android.content.BroadcastReceiver) (k)), intentfilter);
        p = new u(a.getContentResolver(), this);
        if (com.gau.go.launcherex.gowidget.weather.util.k.a(a.getApplicationContext()))
        {
            p.a(-1, null, WeatherContentProvider.l, new String[] {
                "go_widget_type"
            }, null, null, null);
            return;
        } else
        {
            n = false;
            o = false;
            m = false;
            p.a(-1, null, WeatherContentProvider.l, null, null);
            return;
        }
    }

    public void a(b b1)
    {
        l = b1;
        boolean flag = b(b1);
        com.gau.go.launcherex.goweather.goplay.n.a(a).a(l.x(), flag);
    }

    public boolean a(Activity activity)
    {
        boolean flag = super.a(activity);
        if (flag)
        {
            i = null;
            j = null;
        }
        return flag;
    }

    public void b()
    {
        g.a();
        a(k);
    }
}
