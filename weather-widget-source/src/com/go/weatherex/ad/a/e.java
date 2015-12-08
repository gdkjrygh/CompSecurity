// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.go.weatherex.f.b;
import com.go.weatherex.home.dayforecast.j;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.ad.a:
//            h, b, a, l, 
//            c, j, g, f, 
//            i

public class e
{

    public static boolean a = false;
    private Activity b;
    private i c;
    private FrameLayout d;
    private com.go.weatherex.ad.a.a e;
    private ImageView f;

    public e(Activity activity, FrameLayout framelayout)
    {
        b = activity;
        d = framelayout;
    }

    private com.go.weatherex.ad.a.a a(com.go.weatherex.ad.a.b b1)
    {
        com.go.weatherex.ad.a.h.a[b1.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 55
    //                   2 70
    //                   3 93;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_93;
_L1:
        b1 = null;
_L5:
        if (b1.f())
        {
            b1.a(c);
            return b1;
        } else
        {
            b1.a(false);
            return null;
        }
_L2:
        b1 = new l(b);
          goto _L5
_L3:
        b1 = new com.go.weatherex.ad.a.c(b);
        Log.d("ad_banner", "facebook\u52A0\u8F7D\u5931\u8D25\uFF0C\u52A0\u8F7Dadmob\u5E7F\u544A");
          goto _L5
        b1 = new com.go.weatherex.ad.a.j(b);
          goto _L5
    }

    static com.go.weatherex.ad.a.a a(e e1)
    {
        return e1.e;
    }

    static com.go.weatherex.ad.a.a a(e e1, com.go.weatherex.ad.a.a a1)
    {
        e1.e = a1;
        return a1;
    }

    static com.go.weatherex.ad.a.a a(e e1, com.go.weatherex.ad.a.b b1)
    {
        return e1.a(b1);
    }

    private void a(SharedPreferences sharedpreferences, int i)
    {
        sharedpreferences.edit().putInt("key_adid_enter_1", i).commit();
    }

    private static void a(FrameLayout framelayout)
    {
        j j1 = new j(framelayout, framelayout.getResources().getDimensionPixelSize(0x7f0c01cf), 0);
        j1.setDuration(300L);
        framelayout.startAnimation(j1);
    }

    private void a(FrameLayout framelayout, com.go.weatherex.ad.a.a a1)
    {
        if (a1 != null)
        {
            Log.d("ad_banner", (new StringBuilder()).append("\u5E7F\u544A\u7C7B\u578B\uFF1A").append(a1.a()).toString());
            framelayout.removeAllViews();
            framelayout.addView(a1.b());
            if (a1.g())
            {
                a(a1);
                byte byte0;
                if (a1.h())
                {
                    byte0 = 3;
                } else
                {
                    byte0 = 5;
                }
                a1 = new android.widget.FrameLayout.LayoutParams(-2, -2, byte0 | 0x30);
                framelayout.addView(f, a1);
            }
        }
    }

    private void a(com.go.weatherex.ad.a.a a1)
    {
        if (f == null)
        {
            f = new ImageView(b);
            f.setImageResource(0x7f020017);
        }
        f.setOnClickListener(new g(this, a1));
    }

    static void a(e e1, FrameLayout framelayout, com.go.weatherex.ad.a.a a1)
    {
        e1.a(framelayout, a1);
    }

    static FrameLayout b(e e1)
    {
        return e1.d;
    }

    private void b(com.go.weatherex.ad.a.a a1)
    {
        if (a1 != null && (a1 instanceof l))
        {
            a1 = (l)a1;
            if (a1.i() == 1)
            {
                e();
                return;
            } else
            {
                com.go.weatherex.f.b.a(b, a1.j());
                return;
            }
        } else
        {
            e();
            return;
        }
    }

    static void b(e e1, com.go.weatherex.ad.a.a a1)
    {
        e1.b(a1);
    }

    static i c(e e1)
    {
        return e1.c;
    }

    private boolean d()
    {
        boolean flag = true;
        SharedPreferences sharedpreferences = GoWidgetApplication.c(b.getApplicationContext()).a();
        int i1 = sharedpreferences.getInt("key_adid_enter_1", 1);
        Object obj = sharedpreferences.getString("key_adid_location_1", "");
        String s = com.gau.go.launcherex.gowidget.weather.globaltheme.a.b.a.a(((String) (obj)), 3);
        if (!TextUtils.isEmpty(s) && s.equals("1"))
        {
            int i;
            int k;
            try
            {
                i = Integer.valueOf(com.gau.go.launcherex.gowidget.weather.globaltheme.a.b.a.a(((String) (obj)), 4)).intValue();
            }
            catch (Exception exception)
            {
                i = 1;
            }
            k = i;
            if (i == 0)
            {
                k = 1;
            }
            obj = com.gau.go.launcherex.gowidget.weather.c.c.a(b.getApplicationContext()).e();
            if (((f) (obj)).a(2) || ((f) (obj)).a(1) || ((f) (obj)).a(32) || ((f) (obj)).a(128))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i1 % k != 0 || i != 0)
            {
                flag = false;
            }
            a(sharedpreferences, i1 + 1);
            return flag;
        } else
        {
            return false;
        }
    }

    private void e()
    {
        if (w.h(b) && !com.gau.go.launcherex.gowidget.weather.c.c.a(b.getApplicationContext()).e().a(8))
        {
            Intent intent = new Intent(b, com/gau/go/launcherex/gowidget/billing/BillingActivity);
            intent.putExtra("recommend_type", 0);
            intent.putExtra("recommend_enterance", 11);
            intent.addFlags(0x10000000);
            b.startActivity(intent);
        }
    }

    public void a()
    {
        a = false;
        if (d())
        {
            a(((i) (new com.go.weatherex.ad.a.f(this))));
            Log.d("ad_banner", "\u5F00\u59CB\u52A0\u8F7DGO\u5E7F\u544A");
            a(com.go.weatherex.ad.a.b.a).c();
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public void a(i i)
    {
        c = i;
    }

    public void a(boolean flag)
    {
        if (e != null)
        {
            e.a(flag);
        }
        if (d != null)
        {
            a(d);
        }
    }

    public void b()
    {
        if (e != null)
        {
            e.d();
        }
    }

    public void c()
    {
        if (e != null)
        {
            e.e();
        }
    }

}
