// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

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
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.l;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.go.weatherex.j.aa;
import com.go.weatherex.j.c.t;
import com.go.weatherex.j.g;
import com.go.weatherex.themestore.ac;
import com.google.analytics.tracking.android.EasyTracker;
import com.gtp.go.weather.billing.view.k;
import com.jiubang.commerce.ad.a;
import com.jiubang.commerce.ad.h.c;

// Referenced classes of package com.go.weatherex.themeconfig:
//            b, d, p, e, 
//            c

public abstract class GoWidgetThemeConfigHomeActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, e, b
{

    private com.go.weatherex.themeconfig.d a;
    private View b;
    private int c;
    private final int d = g();
    private int e;
    private d f;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.b.b g;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.a h;
    private com.go.weatherex.themeconfig.c i;
    private com.jiubang.commerce.ad.a.b j;
    private f k;

    public GoWidgetThemeConfigHomeActivity()
    {
        c = 0;
        e = 1;
    }

    static com.jiubang.commerce.ad.a.b a(GoWidgetThemeConfigHomeActivity gowidgetthemeconfighomeactivity)
    {
        return gowidgetthemeconfighomeactivity.j;
    }

    static com.jiubang.commerce.ad.a.b a(GoWidgetThemeConfigHomeActivity gowidgetthemeconfighomeactivity, com.jiubang.commerce.ad.a.b b1)
    {
        gowidgetthemeconfighomeactivity.j = b1;
        return b1;
    }

    private void a(int i1)
    {
        finish();
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

    private void i()
    {
        com.jiubang.commerce.ad.a.a((new c(this, 682, null, new com.go.weatherex.themeconfig.b(this))).a(1).b(true).c(true).e(false).a());
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

    public abstract int g();

    public void h()
    {
        if (g != null)
        {
            f.c(c, g);
            aa.a(getApplicationContext(), "widget_theme_ad_ap", "2");
        }
        a(c);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            h();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(null);
        d().a(this, new int[] {
            1
        });
        setContentView(0x7f03010e);
        getWindow().clearFlags(0x8000000);
        i = com.gtp.go.weather.billing.view.k.a();
        k = com.gau.go.launcherex.gowidget.weather.d.f.a(getApplicationContext());
        if (k != null && !k.b())
        {
            i();
        }
        com.gtp.a.a.b.c.a("GoWidgetThemeConfigHomeActivity", (new StringBuilder()).append("GoWidgetThemeConfigHomeActivity: ").append(getIntent().getExtras().keySet()).toString());
        bundle = getIntent();
        if (bundle != null)
        {
            e = bundle.getIntExtra("extra_widget_config_entrance", 1);
            c = bundle.getIntExtra("gowidget_Id", 0);
        }
        if (c == 0)
        {
            finish();
        } else
        {
            ac.a(getApplicationContext());
            f = new d(getApplicationContext());
            h = new l(this);
            h.a();
            h.a(this);
            h.a(false);
            h.b(false);
            bundle = getSupportFragmentManager().beginTransaction();
            Object obj = new p();
            ((p) (obj)).b(this);
            com.go.weatherex.j.c.d d1 = new com.go.weatherex.j.c.d(this, d);
            d1.a(c);
            ((p) (obj)).a(d1);
            ((p) (obj)).a(t.a((com.go.weatherex.j.c.d)d1));
            bundle.add(0x7f090535, ((android.support.v4.app.Fragment) (obj)), com/go/weatherex/themeconfig/p.getName());
            obj = com.go.weatherex.themeconfig.e.a(this, 1, c, d, true);
            ((com.go.weatherex.themeconfig.e) (obj)).b(this);
            bundle.add(0x7f090301, ((android.support.v4.app.Fragment) (obj)), com/go/weatherex/themeconfig/e.getName());
            bundle.commit();
            b = findViewById(0x7f090536);
            b.setOnClickListener(this);
            if (e == 1)
            {
                bundle = new Intent("com.gau.gowidget_action_config_finish");
                bundle.putExtras(getIntent().getExtras());
                sendBroadcast(bundle);
                return;
            }
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
        if (i != null)
        {
            i = null;
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
