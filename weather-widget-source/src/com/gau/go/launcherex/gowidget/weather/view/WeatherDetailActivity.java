// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.gau.go.launcherex.goweather.goplay.ThemeDetailActivity;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.common.e;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.go.weatherex.framework.fragment.g;
import com.go.weatherex.home.n;
import com.go.weatherex.home.o;
import com.go.weatherex.home.p;
import com.go.weatherex.home.r;
import com.go.weatherex.home.v;
import com.go.weatherex.home.x;
import com.go.weatherex.i.b;
import com.go.weatherex.recommendvip.RecommendVipActivity;
import com.google.analytics.tracking.android.EasyTracker;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.takephoto.ab;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            bd, bc

public class WeatherDetailActivity extends BaseFragmentActivity
{

    private n a;
    private final bd b = new bd();
    private o c;
    private x d;
    private r e;
    private p f;
    private v g;
    private boolean h;

    public WeatherDetailActivity()
    {
        h = false;
    }

    public static Intent a(Context context, String s, boolean flag, int l, String s1, int i1)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/view/WeatherDetailActivity);
        intent.putExtra("cityId", s);
        intent.putExtra("EXTRA_BG_LOADING_IMMEDIATELY_", flag);
        intent.putExtra("detailSrc", l);
        intent.putExtra("extra_src_app_package_name", s1);
        intent.putExtra("detail_goto", i1);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        return intent;
    }

    public static void a(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        InputMethodManager inputmethodmanager;
        return;
_L2:
        if ((inputmethodmanager = (InputMethodManager)context.getSystemService("input_method")) == null) goto _L1; else goto _L3
_L3:
        String as[];
        int l;
        as = new String[3];
        as[0] = "mCurRootView";
        as[1] = "mServedView";
        as[2] = "mNextServedView";
        l = 0;
_L6:
        if (l >= as.length) goto _L1; else goto _L4
_L4:
        Object obj = as[l];
        Object obj1;
        obj = inputmethodmanager.getClass().getDeclaredField(((String) (obj)));
        if (!((Field) (obj)).isAccessible())
        {
            ((Field) (obj)).setAccessible(true);
        }
        obj1 = ((Field) (obj)).get(inputmethodmanager);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (!(obj1 instanceof View))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (((View)obj1).getContext() != context) goto _L1; else goto _L5
_L5:
        ((Field) (obj)).set(inputmethodmanager, null);
_L7:
        l++;
          goto _L6
        Throwable throwable;
        throwable;
        throwable.printStackTrace();
          goto _L7
    }

    static void a(WeatherDetailActivity weatherdetailactivity)
    {
        weatherdetailactivity.g();
    }

    private void g()
    {
        if (h || isFinishing())
        {
            return;
        }
        if (TextUtils.isEmpty(b.a))
        {
            f f1 = com.gau.go.launcherex.gowidget.weather.util.f.a(getApplicationContext());
            if (!f1.c().isEmpty())
            {
                b.a = ((WeatherBean)f1.d().get(0)).c();
            }
        }
        a.a(b);
        h();
    }

    private void h()
    {
        Object obj;
        String s;
        s = "go_in_detail";
        obj = s;
        b.c;
        JVM INSTR tableswitch 0 13: default 84
    //                   0 129
    //                   1 86
    //                   2 86
    //                   3 183
    //                   4 135
    //                   5 141
    //                   6 147
    //                   7 153
    //                   8 159
    //                   9 165
    //                   10 171
    //                   11 177
    //                   12 239
    //                   13 245;
           goto _L1 _L2 _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        obj = s;
_L16:
        w.a(((String) (obj)), this);
        obj = new a(93, "g001");
        ((a) (obj)).d(q.a(b.c));
        q.a(getApplicationContext()).a(((a) (obj)));
        return;
_L2:
        obj = "enter_to_detail";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "widget42_to_detail";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "widget41_to_detail";
        continue; /* Loop/switch isn't completed */
_L7:
        obj = "widget21_to_detail";
        continue; /* Loop/switch isn't completed */
_L8:
        obj = "widget11_to_detail";
        continue; /* Loop/switch isn't completed */
_L9:
        obj = "appwidget42_to_detail";
        continue; /* Loop/switch isn't completed */
_L10:
        obj = "appwidget41_to_detail";
        continue; /* Loop/switch isn't completed */
_L11:
        obj = "appwidget21_to_detail";
        continue; /* Loop/switch isn't completed */
_L12:
        obj = "notification_to_detail";
        continue; /* Loop/switch isn't completed */
_L4:
        String s1 = "skin_to_detail";
        String s2 = b.d;
        obj = s1;
        if (!TextUtils.isEmpty(s2))
        {
            obj = s1;
            if (!"--".equals(s2))
            {
                obj = ThemeDetailActivity.a(this, 2, 2, s2);
                ((Intent) (obj)).addFlags(0x4000000);
                startActivity(((Intent) (obj)));
                obj = s1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L13:
        obj = "language_to_detail";
        continue; /* Loop/switch isn't completed */
_L14:
        obj = "camera_to_detail";
        if (true) goto _L16; else goto _L15
_L15:
    }

    private void i()
    {
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "restartActivity");
        finish();
        startActivity(a(this, b.a, b.b, b.c, b.d, b.e));
    }

    private void j()
    {
        boolean flag = ab.b();
        if (ab.a() && (com.go.weatherex.i.b.a() || com.go.weatherex.i.b.b()) && !flag)
        {
            try
            {
                if (ab.b("http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip"))
                {
                    k();
                }
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        ab.a(false);
    }

    private void k()
    {
        Intent intent = new Intent(this, com/go/weatherex/recommendvip/RecommendVipActivity);
        intent.addFlags(0x10000000);
        startActivity(intent);
    }

    protected g b()
    {
        a = new n(this);
        return a;
    }

    protected com.go.weatherex.framework.b c()
    {
        return new com.go.weatherex.framework.c(this);
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        c.a(this, l, i1, intent);
    }

    public void onBackPressed()
    {
        if (a == null || !a.b())
        {
            boolean flag;
            if (getSupportFragmentManager().getBackStackEntryCount() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag || c == null || !c.f(this))
            {
                super.onBackPressed();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        com.gtp.a.a.b.c.a("WeatherDetailActivity", (new StringBuilder()).append("onCreate: ").append(bundle).toString());
        boolean flag;
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        super.onCreate(null);
        b.a(getIntent());
        if (h)
        {
            i();
            return;
        }
        setContentView(0x7f0300b9);
        getWindow().setFormat(-3);
        getWindow().clearFlags(0x8000000);
        c = new o();
        c.a(this, null);
        d = new x();
        d.a(this, null);
        e = new r();
        e.a(this, null);
        f = new p();
        f.a(this, null);
        g = new v();
        g.a(this, null);
        bundle = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext());
        if (bundle.b())
        {
            g();
        } else
        {
            bundle.a(new bc(this, bundle));
        }
        Log.i("wss", "WeatherDetailActivity_onCreate");
        j();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.go.weatherex.common.e.a(this).a();
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onDestroy: ");
        if (c != null)
        {
            c.e(this);
        }
        if (e != null)
        {
            e.a(this);
        }
        a(this);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b.a(intent);
        if (!com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).b())
        {
            return;
        }
        switch (b.e)
        {
        case 6: // '\006'
        default:
            if (c != null)
            {
                c.a(this, intent);
            }
            if (a != null)
            {
                a.b(b);
            }
            if (f != null)
            {
                f.a(this, intent);
            }
            h();
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        case 8: // '\b'
            i();
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onPause: ");
        if (c != null)
        {
            c.c(this);
        }
    }

    protected void onRestart()
    {
        super.onRestart();
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onRestart: ");
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        com.gtp.a.a.b.c.a("WeatherDetailActivity", (new StringBuilder()).append("onRestoreInstanceState: ").append(bundle).toString());
    }

    protected void onResume()
    {
        super.onResume();
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onResume: ");
        if (c != null)
        {
            c.b(this);
        }
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onResumeFragments: ");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onSaveInstanceState: ");
        h = true;
    }

    protected void onStart()
    {
        super.onStart();
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onStart: ");
        EasyTracker.getInstance().activityStart(this);
        if (c != null)
        {
            c.a(this);
        }
    }

    protected void onStop()
    {
        super.onStop();
        com.gtp.a.a.b.c.a("WeatherDetailActivity", "onStop: ");
        EasyTracker.getInstance().activityStop(this);
        if (c != null)
        {
            c.d(this);
        }
    }
}
