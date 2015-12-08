// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.weather.globalview.b;
import com.gau.go.launcherex.gowidget.weather.globalview.e;
import com.gau.go.launcherex.gowidget.weather.view.ThemeSettingActivity;
import com.go.weatherex.themestore.ac;
import com.jiubang.playsdk.a.a;
import com.jiubang.playsdk.main.o;
import com.jiubang.playsdk.views.m;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            i, q, g, ThemeDataHandler, 
//            h

public class ThemeDetailActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, o, m
{

    private com.go.weatherex.themestore.detail.e a;
    private Object b;
    private h c;
    private PackageChangeReceiver d;
    private int e;
    private int f;
    private final i g = new i();
    private String h;

    public ThemeDetailActivity()
    {
        e = 1;
        f = 40;
    }

    public static Intent a(Context context, int j, int k, String s)
    {
        context = new Intent(context, com/gau/go/launcherex/goweather/goplay/ThemeDetailActivity);
        context.putExtra("extra_src_app_package_name", s);
        context.putExtra("extra_key_from", j);
        context.putExtra("extra_key_type", k);
        return context;
    }

    static String a(ThemeDetailActivity themedetailactivity, a a1)
    {
        return themedetailactivity.a(a1);
    }

    private String a(a a1)
    {
        if (a1 != null)
        {
            return a1.a();
        } else
        {
            return "";
        }
    }

    private ArrayList a(String s)
    {
        ArrayList arraylist = new ArrayList();
        int j;
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.h(s, this))
        {
            f = 40;
            j = 1;
        } else
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.i(s, this))
        {
            f = 39;
            j = 2;
        } else
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.f(s, this) || com.gau.go.launcherex.gowidget.weather.globaltheme.a.g(s, this))
        {
            f = 41;
            j = 3;
        } else
        {
            j = -1;
        }
        if (-1 != j)
        {
            s = ac.h().a(this, j);
            if (s != null)
            {
                arraylist.addAll(s);
            }
        }
        return arraylist;
    }

    private void a(int j)
    {
        Intent intent = ThemeSettingActivity.a(this, 33, 999, j);
        intent.setFlags(0x4000000);
        startActivity(intent);
        finish();
    }

    static void a(ThemeDetailActivity themedetailactivity)
    {
        themedetailactivity.g();
    }

    static void a(ThemeDetailActivity themedetailactivity, int j)
    {
        themedetailactivity.a(j);
    }

    static Object b(ThemeDetailActivity themedetailactivity)
    {
        return themedetailactivity.b;
    }

    private void f()
    {
        b b1 = new b(this, e.b);
        b1.b(0x7f0804e4);
        b1.c(0x7f0804e6);
        b1.a(new g(this));
        b1.a();
    }

    private void g()
    {
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.e(this, a((a)b));
    }

    private void h()
    {
        if (e == 2)
        {
            Intent intent = ThemeSettingActivity.a(this, 33, 999, f);
            intent.setFlags(0x4000000);
            startActivity(intent);
        }
    }

    public void a()
    {
        h();
        finish();
    }

    public Context b()
    {
        return this;
    }

    protected void onActivityResult(int j, int k, Intent intent)
    {
        if (intent != null && intent.getIntExtra("operation", 2) == 1)
        {
            a.b();
        }
    }

    public void onBackPressed()
    {
        h();
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f020261 && (b instanceof a))
        {
            ac.h().i(b(), (a)b);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        int j;
        super.onCreate(bundle);
        ac.a(getApplicationContext());
        g.a(this);
        ac.h().a(g);
        com.go.weatherex.b.a.a.a(this).c();
        bundle = getIntent();
        h = bundle.getStringExtra("cityId");
        e = bundle.getIntExtra("extra_key_from", 1);
        j = bundle.getIntExtra("extra_key_type", 1);
        if (e != 2) goto _L2; else goto _L1
_L1:
label0:
        {
            bundle = bundle.getStringExtra("extra_src_app_package_name");
            Iterator iterator = a(bundle).iterator();
            a a1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                a1 = (a)iterator.next();
            } while (!a1.a().equals(bundle));
            b = a1;
        }
_L4:
        if (b == null)
        {
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        b = getIntent().getSerializableExtra("extra_key_bean");
        if (true) goto _L4; else goto _L3
_L3:
        if (b instanceof a)
        {
            if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(getApplicationContext()).a((a)b) == null)
            {
                a(((a)b).a());
            }
            if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(getApplicationContext()).a((a)b) == null)
            {
                finish();
                return;
            }
        }
        int ai[];
        if (j == 2)
        {
            ai = new int[1];
            ai[0] = 0x7f020261;
            bundle = new int[1];
            bundle[0] = 0x7f0804f4;
        } else
        {
            bundle = null;
            ai = null;
        }
        a = new com.go.weatherex.themestore.detail.e(this, b, ac.h());
        a.a(this, this, this);
        setContentView(a.a(bundle, ai));
        getWindow().clearFlags(0x8000000);
        c = new h(this, null);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_SCROLL_CHANGE");
        registerReceiver(c, bundle);
        d = new PackageChangeReceiver();
        bundle = new IntentFilter();
        bundle.addAction("android.intent.action.PACKAGE_REMOVED");
        bundle.addDataScheme("package");
        registerReceiver(d, bundle);
        return;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (c != null)
        {
            unregisterReceiver(c);
        }
        if (d != null)
        {
            unregisterReceiver(d);
        }
        if (a != null)
        {
            a.a();
            a = null;
        }
        ac.h().b(g);
        g.c();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
label0:
        {
            if (view.getId() == 0x7f0804f4 && (b instanceof a))
            {
                adapterview = (a)b;
                if (ac.h().d(this, adapterview))
                {
                    break label0;
                }
                g();
            }
            return;
        }
        f();
    }

    protected void onStart()
    {
        super.onStart();
    }

    private class PackageChangeReceiver extends BroadcastReceiver
    {

        final ThemeDetailActivity a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED"))
            {
                context = intent.getDataString();
                boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (context != null && !flag)
                {
                    context = context.replace("package:", "");
                    if ((com.gau.go.launcherex.goweather.goplay.ThemeDetailActivity.b(a) instanceof a) && com.gau.go.launcherex.goweather.goplay.ThemeDetailActivity.a(a, (a)com.gau.go.launcherex.goweather.goplay.ThemeDetailActivity.b(a)).equals(context))
                    {
                        a.finish();
                    }
                }
            }
        }

        public PackageChangeReceiver()
        {
            a = ThemeDetailActivity.this;
            super();
        }
    }

}
