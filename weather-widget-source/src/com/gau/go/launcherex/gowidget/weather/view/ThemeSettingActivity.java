// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import com.gau.go.launcherex.goweather.goplay.l;
import com.gau.go.launcherex.goweather.goplay.n;
import com.gau.go.launcherex.goweather.goplay.q;
import com.gau.go.launcherex.gowidget.c.b;
import com.gau.go.launcherex.gowidget.c.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a.d;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.go.weatherex.framework.fragment.g;
import com.go.weatherex.themestore.ac;
import com.go.weatherex.themestore.v;
import com.google.analytics.tracking.android.EasyTracker;
import com.gtp.a.a.b.c;
import com.jiubang.core.b.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            as, WeatherDetailActivity

public class ThemeSettingActivity extends BaseFragmentActivity
    implements e
{

    private v a;
    private final as b = new as();
    private boolean c;
    private boolean d;
    private final l e = new l();

    public ThemeSettingActivity()
    {
        c = false;
        d = false;
    }

    public static Intent a(Context context, int k, int i1, int j1)
    {
        return a(context, k, i1, j1, "");
    }

    public static Intent a(Context context, int k, int i1, int j1, String s)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/view/ThemeSettingActivity);
        intent.putExtra("extra_theme_entrance", k);
        intent.putExtra("first_level_tab_id", i1);
        intent.putExtra("second_level_tab_id", j1);
        intent.putExtra("cityId", s);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        return intent;
    }

    private boolean a(String s)
    {
        SharedPreferences sharedpreferences = GoWidgetApplication.c(getApplicationContext()).b();
        boolean flag = sharedpreferences.getBoolean(s, false);
        if (flag)
        {
            sharedpreferences.edit().putBoolean(s, false).commit();
        }
        return flag;
    }

    private void g()
    {
        if (c || isFinishing())
        {
            return;
        } else
        {
            Log.i("wss", "ThemeSettingActivity_onCreate");
            com.go.weatherex.b.a.a.a(this).c();
            h();
            a.a(b);
            return;
        }
    }

    private void h()
    {
        b.c;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 306
    //                   2: 114
    //                   6: 280
    //                   7: 280
    //                   20: 171
    //                   31: 254
    //                   32: 228
    //                   35: 254
    //                   36: 228;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6 _L7 _L6 _L7
_L1:
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.d.b(this, false);
        n.a(getApplicationContext()).a(n.a(b.c));
        return;
_L3:
        d = true;
        if (a("key_systemwidget_isfirst_open_theme"))
        {
            b.a = 999;
            b.b = 40;
        } else
        {
            b.a = 40;
            b.b = 40;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = true;
        if (a("key_gowidget_isfirst_open_theme"))
        {
            b.a = 999;
            b.b = 39;
        } else
        {
            b.a = 39;
            b.b = 39;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        d = true;
        b.a = 40;
        b.b = 40;
        continue; /* Loop/switch isn't completed */
_L6:
        d = true;
        b.a = 39;
        b.b = 39;
        continue; /* Loop/switch isn't completed */
_L4:
        d = true;
        b.a = 39;
        b.b = 39;
        continue; /* Loop/switch isn't completed */
_L2:
        ac.d();
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void i()
    {
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "restartActivity");
        finish();
        startActivity(a(this, b.c, b.a, b.b, b.d));
    }

    private void j()
    {
        if (d)
        {
            Intent intent = com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity.a(this, b.d, true, 16, "", -1);
            intent.addFlags(0x4000000);
            startActivity(intent);
        }
    }

    public void a(b b1)
    {
        switch (b1.a)
        {
        default:
            return;

        case 5: // '\005'
            j();
            break;
        }
        finish();
    }

    protected g b()
    {
        a = new v(this);
        return a;
    }

    protected void onActivityResult(int k, int i1, Intent intent)
    {
        super.onActivityResult(k, i1, intent);
    }

    public void onBackPressed()
    {
        if (a != null && a.b())
        {
            return;
        } else
        {
            j();
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        com.gtp.a.a.b.c.a("ThemeSettingActivity", (new StringBuilder()).append("onCreate: ").append(bundle).toString());
        boolean flag;
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        super.onCreate(null);
        e.a(this);
        ac.a(getApplicationContext());
        ac.h().a(e);
        d().a(this, new int[] {
            5
        });
        b.a(getIntent());
        if (c)
        {
            i();
            return;
        } else
        {
            setContentView(0x7f03010f);
            getWindow().setFormat(-3);
            getWindow().clearFlags(0x8000000);
            g();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onDestroy: ");
        d().a(this);
        ac.h().b(e);
        e.c();
        ac.l();
        com.go.weatherex.b.a.a.a(this).f();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b.a(intent);
        if (a != null)
        {
            a.b(b);
        }
        h();
    }

    protected void onPause()
    {
        super.onPause();
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onPause: ");
    }

    protected void onRestart()
    {
        super.onRestart();
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onRestart: ");
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        com.gtp.a.a.b.c.a("ThemeSettingActivity", (new StringBuilder()).append("onRestoreInstanceState: ").append(bundle).toString());
    }

    protected void onResume()
    {
        super.onResume();
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onResume: ");
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onResumeFragments: ");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onSaveInstanceState: ");
        c = true;
    }

    protected void onStart()
    {
        super.onStart();
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onStart: ");
        EasyTracker.getInstance().activityStart(this);
    }

    protected void onStop()
    {
        super.onStop();
        com.gtp.a.a.b.c.a("ThemeSettingActivity", "onStop: ");
        EasyTracker.getInstance().activityStop(this);
    }
}
