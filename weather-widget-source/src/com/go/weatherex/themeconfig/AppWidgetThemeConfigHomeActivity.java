// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.l;
import com.gau.go.launcherex.gowidget.weather.service.AppWidgetService;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget21Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays42Provider;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.go.weatherex.j.aa;
import com.go.weatherex.j.g;
import com.go.weatherex.themestore.ac;
import com.google.analytics.tracking.android.EasyTracker;
import com.gtp.go.weather.billing.view.k;
import com.jiubang.commerce.ad.a;
import com.jiubang.commerce.ad.h.c;

// Referenced classes of package com.go.weatherex.themeconfig:
//            a, d, p, e, 
//            c

public class AppWidgetThemeConfigHomeActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, e, b, com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.b
{

    private com.go.weatherex.themeconfig.d a;
    private View b;
    private int c;
    private int d;
    private int e;
    private d f;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.b.b g;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.a h;
    private boolean i;
    private com.go.weatherex.themeconfig.c j;
    private com.jiubang.commerce.ad.a.b k;
    private f l;

    public AppWidgetThemeConfigHomeActivity()
    {
        c = 0;
        d = 1;
        e = 1;
        i = false;
    }

    public static Intent a(Context context, int i1, int j1, int k1)
    {
        Intent intent = new Intent(context, com/go/weatherex/themeconfig/AppWidgetThemeConfigHomeActivity);
        intent.putExtra("appWidgetId", i1);
        intent.putExtra("extra_widget_config_entrance", k1);
        intent.putExtra("extra_widget_type", j1);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        return intent;
    }

    static com.jiubang.commerce.ad.a.b a(AppWidgetThemeConfigHomeActivity appwidgetthemeconfighomeactivity)
    {
        return appwidgetthemeconfighomeactivity.k;
    }

    static com.jiubang.commerce.ad.a.b a(AppWidgetThemeConfigHomeActivity appwidgetthemeconfighomeactivity, com.jiubang.commerce.ad.a.b b1)
    {
        appwidgetthemeconfighomeactivity.k = b1;
        return b1;
    }

    private void a(int i1)
    {
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", i1);
        setResult(-1, intent);
        finish();
        if (e == 1)
        {
            Intent intent1 = new Intent();
            intent1.putExtra("request_extra_appwidget_type", d);
            AppWidgetService.a(getApplicationContext(), 24, intent1);
            intent1.putExtra("extra_appwidget_ids", new int[] {
                i1
            });
            AppWidgetService.a(getApplicationContext(), 25, intent1);
        }
    }

    private void a(AppWidgetProviderInfo appwidgetproviderinfo)
    {
        if (appwidgetproviderinfo != null && com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider != null && com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider.getName() != null && appwidgetproviderinfo.provider != null)
        {
            if (com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider.getName().equals(appwidgetproviderinfo.provider.getClassName()))
            {
                d = 1;
                return;
            }
            if (com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider.getName().equals(appwidgetproviderinfo.provider.getClassName()))
            {
                d = 2;
                return;
            }
            if (com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider.getName().equals(appwidgetproviderinfo.provider.getClassName()))
            {
                d = 3;
                return;
            }
            if (com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider.getName().equals(appwidgetproviderinfo.provider.getClassName()))
            {
                d = 4;
                return;
            }
            if (com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider.getName().equals(appwidgetproviderinfo.provider.getClassName()))
            {
                d = 5;
                return;
            }
        }
    }

    private boolean b(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        d;
        JVM INSTR tableswitch 4 5: default 36
    //                   4 91
    //                   5 72;
           goto _L1 _L2 _L3
_L1:
        boolean flag = true;
_L5:
        if (!flag)
        {
            Toast.makeText(this, String.format(getString(0x7f080563), new Object[] {
                stringbuffer.toString()
            }), 0).show();
        }
        return flag;
_L3:
        flag = b1.n();
        stringbuffer.append(getString(0x7f080549));
        continue; /* Loop/switch isn't completed */
_L2:
        flag = b1.o();
        stringbuffer.append(getString(0x7f08054a));
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void h()
    {
        com.jiubang.commerce.ad.a.a((new c(this, 682, null, new com.go.weatherex.themeconfig.a(this))).a(1).b(true).c(true).e(false).a());
    }

    public void a(int i1, com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        i = false;
        a(c);
    }

    public void a(com.gau.go.launcherex.gowidget.c.b b1)
    {
        b1.a;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (b(b1 = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)b1.b))
        {
            h.a(b1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null)
        {
            g = b1;
            d().a(2, b1);
        }
    }

    protected com.go.weatherex.framework.fragment.g b()
    {
        a = new com.go.weatherex.themeconfig.d(this);
        return a;
    }

    public void b(int i1, com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
    }

    public void g()
    {
        if (g != null)
        {
            if (i)
            {
                return;
            } else
            {
                i = true;
                f.b(c, g);
                aa.a(getApplicationContext(), "widget_theme_ad_ap", "3");
                return;
            }
        } else
        {
            a(c);
            return;
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            g();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        bundle = null;
        super.onCreate(null);
        l = com.gau.go.launcherex.gowidget.weather.d.f.a(getApplicationContext());
        if (l != null && !l.b())
        {
            h();
        }
        d().a(this, new int[] {
            1
        });
        setResult(0);
        c = 0;
        j = com.gtp.go.weather.billing.view.k.a();
        Bundle bundle1 = getIntent().getExtras();
        if (bundle1 != null)
        {
            e = bundle1.getInt("extra_widget_config_entrance", 1);
            c = bundle1.getInt("appWidgetId", 0);
            bundle = AppWidgetManager.getInstance(getApplicationContext()).getAppWidgetInfo(c);
            if (e == 2)
            {
                d = bundle1.getInt("extra_widget_type", -1);
            } else
            {
                a(bundle);
            }
        }
        if (c == 0 || bundle == null || d == -1)
        {
            finish();
            return;
        } else
        {
            setContentView(0x7f03010e);
            getWindow().clearFlags(0x8000000);
            ac.a(getApplicationContext());
            f = new d(getApplicationContext());
            f.a(this);
            h = new l(this);
            h.a();
            h.a(this);
            h.a(false);
            h.b(false);
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            p p1 = new p();
            p1.b(this);
            com.go.weatherex.j.b.d d1 = new com.go.weatherex.j.b.d(this, d);
            d1.a(c);
            p1.a(d1);
            p1.a(bundle);
            fragmenttransaction.add(0x7f090535, p1, com/go/weatherex/themeconfig/p.getName());
            bundle = com.go.weatherex.themeconfig.e.a(this, 1, c, d, false);
            bundle.b(this);
            fragmenttransaction.add(0x7f090301, bundle, com/go/weatherex/themeconfig/e.getName());
            fragmenttransaction.commit();
            b = findViewById(0x7f090536);
            b.setOnClickListener(this);
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        d().a(this);
        if (f != null)
        {
            f.a();
        }
        if (ac.a())
        {
            ac.l();
        }
        if (h != null)
        {
            h.b();
        }
        if (j != null)
        {
            j = null;
        }
        com.gtp.go.weather.billing.view.k.a().d();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            a(c);
        }
        return super.onKeyDown(i1, keyevent);
    }

    protected void onStart()
    {
        super.onStart();
        EasyTracker.getInstance().activityStart(this);
    }

    protected void onStop()
    {
        super.onStop();
        EasyTracker.getInstance().activityStop(this);
    }
}
