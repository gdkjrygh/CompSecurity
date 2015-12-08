// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.goplay.n;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.weather.b.v;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.view.ad;
import com.go.weatherex.managegood.a.c;
import com.go.weatherex.managegood.b.a;
import com.gtp.go.weather.billing.view.PayActivity;
import com.gtp.go.weather.sharephoto.award.k;
import com.gtp.go.weather.sharephoto.x;
import com.jiubang.playsdk.a.y;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            a, k, j, b, 
//            i, h

public class g extends com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.a
{

    private d g;
    private ad h;
    private com.gau.go.launcherex.gowidget.weather.globalview.b i;
    private b j;
    private boolean k;
    private BroadcastReceiver l;

    public g(Activity activity)
    {
        super(activity);
        l = new com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.k(this);
    }

    private void a(int i1)
    {
        Intent intent = new Intent(a, com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", 8);
        a.startActivity(intent);
    }

    private void a(b b1, String s)
    {
        if (f.a(2))
        {
            return;
        }
        if (y.a().f(j.x()))
        {
            b1 = new a(j.x(), 2, y.a().g(j.x()));
            com.go.weatherex.managegood.a.c.a().a(a, b1);
        } else
        {
            a(s);
        }
        e();
    }

    static void a(g g1)
    {
        g1.e();
    }

    private void a(String s)
    {
        Intent intent = new Intent(a, com/gtp/go/weather/billing/view/PayActivity);
        intent.putExtra("extra_package_name", j.x());
        intent.putExtra("theme_pay_type", s);
        intent.putExtra("key_isApkAward", j.b());
        if (j.f() && j.e())
        {
            s = new ArrayList();
            com.gau.go.launcherex.gowidget.weather.globaltheme.b.a a1;
            for (Iterator iterator = j.d().iterator(); iterator.hasNext(); intent.putExtra(a1.a(), a1.b()))
            {
                a1 = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.a)iterator.next();
                s.add(a1.a());
            }

            intent.putStringArrayListExtra("extra_coupon_ids_arraylist", s);
        }
        a.startActivity(intent);
    }

    static boolean a(g g1, b b1)
    {
        return g1.b(b1);
    }

    private void b(int i1)
    {
label0:
        {
            if (!a.isFinishing())
            {
                if (h == null)
                {
                    break label0;
                }
                if (!h.isShowing())
                {
                    h.show();
                }
            }
            return;
        }
        h = ad.a(a);
        h.setCanceledOnTouchOutside(false);
        h.setOnKeyListener(new j(this));
        h.a(c(i1));
        h.show();
    }

    static void b(g g1)
    {
        g1.d();
    }

    static void b(g g1, b b1)
    {
        g1.e(b1);
    }

    private boolean b(b b1)
    {
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(b1.x())) goto _L2; else goto _L1
_L1:
        if (com.gtp.go.weather.sharephoto.d.h.b(x.a)) goto _L4; else goto _L3
_L3:
        Toast.makeText(a, 0x7f0804a5, 0).show();
_L10:
        return false;
_L4:
        f(b1);
        if (b != null)
        {
            b.a(b1);
        }
        return true;
_L2:
        f f1 = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext()).e();
        if (f1.c()) goto _L6; else goto _L5
_L5:
        b1.p();
        JVM INSTR tableswitch 2 3: default 104
    //                   2 130
    //                   3 147;
           goto _L6 _L7 _L8
_L6:
        boolean flag = false;
_L12:
        if (flag) goto _L10; else goto _L9
_L7:
        if (f1.b()) goto _L6; else goto _L11
_L11:
        a(1);
        flag = true;
          goto _L12
_L8:
        if (b1.h()) goto _L6; else goto _L13
_L13:
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
        e(b1);
        flag = true;
          goto _L12
_L9:
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(a.getApplicationContext(), b1))
        {
            c();
            return false;
        }
        if (b1 != null && (b1.a() == 3 || b1.a() == 4) && com.go.weatherex.b.a.a.a(a).d())
        {
            com.go.weatherex.b.a.a.a(a).e();
        }
        f(b1);
        return true;
    }

    static b c(g g1)
    {
        return g1.j;
    }

    static b c(g g1, b b1)
    {
        g1.j = b1;
        return b1;
    }

    private String c(int i1)
    {
        return a.getString(i1);
    }

    private void c()
    {
        if (i == null)
        {
            i = new com.gau.go.launcherex.gowidget.weather.globalview.b(a);
            i.b(0x7f0801ec);
            i.c(0x7f0804c9);
            i.d(0x7f080266);
            i.a(new i(this));
        }
        if (!a.isFinishing() && !i.isShowing())
        {
            i.a();
        }
    }

    private void c(b b1)
    {
        k k1 = new k(a);
        k1.a(new com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.h(this, b1, k1));
        com.gtp.go.weather.sharephoto.award.k.a(a, b1.x());
        b(0x7f0804b3);
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
        if (!f.a(1))
        {
            Intent intent = new Intent();
            intent.setClassName(b1.x(), "com.gau.go.weatherex.framework.billing.PayActivity");
            if (j.f() && j.e())
            {
                b1 = new ArrayList();
                com.gau.go.launcherex.gowidget.weather.globaltheme.b.a a1;
                for (Iterator iterator = j.d().iterator(); iterator.hasNext(); intent.putExtra(a1.a(), a1.b()))
                {
                    a1 = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.a)iterator.next();
                    b1.add(a1.a());
                }

                intent.putStringArrayListExtra("extra_coupon_ids_arraylist", b1);
            }
            try
            {
                a.startActivity(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b b1) { }
            if (com.gtp.a.a.b.c.a())
            {
                b1.printStackTrace();
                return;
            }
        }
    }

    static void d(g g1)
    {
        g1.f();
    }

    private void e()
    {
        if (!a.isFinishing() && h != null && h.isShowing())
        {
            h.dismiss();
            h = null;
        }
    }

    private void e(b b1)
    {
        String s = com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(a.getApplicationContext(), j.x(), "theme_pay_type");
        com.gtp.a.a.b.c.a("theme_pay", (new StringBuilder()).append("themePayType = ").append(s).toString());
        if (s.equals("0"))
        {
            d(b1);
        } else
        if (s.equals("2") || s.equals("1"))
        {
            a(b1, s);
            return;
        }
    }

    private void f()
    {
        if (j != null && a != null && !a.isFinishing() && !"com.gtp.go.weather.phototheme".equals(j.x()))
        {
            boolean flag = j.g();
            if (flag != k)
            {
                k = flag;
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("dynamic_bg_switch", Boolean.valueOf(k));
                v.a(a, contentvalues);
                return;
            }
        }
    }

    private void f(b b1)
    {
        b1.m(true);
        if (c)
        {
            g.a(1, b1);
            b(0x7f0804bf);
        } else
        if (b != null)
        {
            b.a(j);
            return;
        }
    }

    public void a()
    {
        g = new d(a.getApplicationContext());
        k = v.a(a);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_PREVIEW_DONE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_ALL_SCRIPT_DONE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION");
        a(l, intentfilter);
    }

    public void a(b b1)
    {
        j = b1;
        boolean flag = b(b1);
        n.a(a).a(j.x(), flag);
    }

    public boolean a(Activity activity)
    {
        boolean flag = super.a(activity);
        if (flag)
        {
            h = null;
            i = null;
        }
        return flag;
    }

    public void b()
    {
        g.a();
        a(l);
        com.go.weatherex.b.a.a.a(a).f();
    }
}
