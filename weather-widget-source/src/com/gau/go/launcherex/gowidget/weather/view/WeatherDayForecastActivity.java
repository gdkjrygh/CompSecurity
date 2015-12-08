// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.scroller.WeatherDetailScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.l;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherForecastView, WeatherDetailActivity, Indicator, az, 
//            ba, bb

public class WeatherDayForecastActivity extends GoWeatherEXActivity
    implements l
{

    private TextView a;
    private View b;
    private View c;
    private f d;
    private e e;
    private LayoutInflater f;
    private Indicator g;
    private WeatherDetailScrollGroup h;
    private String i;
    private Notification j;
    private NotificationManager k;
    private int l;
    private int m;
    private int n;

    public WeatherDayForecastActivity()
    {
        a = null;
        d = null;
        f = null;
        g = null;
        h = null;
        i = null;
        l = 1;
        m = 2;
        n = 2;
    }

    private WeatherForecastView a(String s, String s1, ForecastBean forecastbean)
    {
        String s2;
        String s3;
        String s4;
        s2 = null;
        s4 = forecastbean.a();
        s3 = forecastbean.b();
        if (r.a(s4)) goto _L2; else goto _L1
_L1:
        forecastbean = s2;
        if (!r.a(s3)) goto _L3; else goto _L2
_L2:
        WeatherForecastView weatherforecastview = (WeatherForecastView)f.inflate(0x7f030132, null);
        weatherforecastview.c(s1);
        weatherforecastview.d(s);
        if (m == 1)
        {
            s2 = q.g(s4);
            forecastbean = q.g(s3);
        } else
        {
            forecastbean = s3;
            s2 = s4;
            if (m == 2)
            {
                s2 = q.f(s4);
                forecastbean = q.f(s3);
            }
        }
        s = forecastbean;
        s1 = s2;
        n;
        JVM INSTR tableswitch 1 6: default 128
    //                   1 181
    //                   2 133
    //                   3 195
    //                   4 209
    //                   5 223
    //                   6 237;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        s1 = s2;
        s = forecastbean;
_L12:
        weatherforecastview.a(s1);
        weatherforecastview.b(s);
        forecastbean = weatherforecastview;
_L3:
        return forecastbean;
_L5:
        s1 = q.h(s2);
        s = q.h(forecastbean);
        continue; /* Loop/switch isn't completed */
_L7:
        s1 = q.i(s2);
        s = q.i(forecastbean);
        continue; /* Loop/switch isn't completed */
_L8:
        s1 = q.j(s2);
        s = q.j(forecastbean);
        continue; /* Loop/switch isn't completed */
_L9:
        s1 = q.k(s2);
        s = q.k(forecastbean);
        continue; /* Loop/switch isn't completed */
_L10:
        s1 = q.l(s2);
        s = q.l(forecastbean);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void a()
    {
        String s = "";
        if (h.getChildCount() > 0)
        {
            s = ((WeatherForecastView)h.getChildAt(h.b())).b();
        }
        startActivity(WeatherDetailActivity.a(this, s, true, 15, "", 2));
    }

    private void a(int i1, int j1)
    {
        if (i1 == 0)
        {
            b.setVisibility(4);
        } else
        {
            b.setVisibility(0);
        }
        if (i1 == j1 - 1)
        {
            c.setVisibility(4);
            return;
        } else
        {
            c.setVisibility(0);
            return;
        }
    }

    static void a(WeatherDayForecastActivity weatherdayforecastactivity)
    {
        weatherdayforecastactivity.a();
    }

    private boolean a(String s)
    {
        boolean flag = false;
        if (i.equals(s))
        {
            flag = true;
        }
        return flag;
    }

    private void b()
    {
        Iterator iterator = d.d().iterator();
label0:
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (WeatherBean)iterator.next();
            Iterator iterator1 = ((WeatherBean) (obj)).g.iterator();
            ForecastBean forecastbean;
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label0;
                }
                forecastbean = (ForecastBean)iterator1.next();
            } while (!a(forecastbean.c()));
            obj = a(((WeatherBean) (obj)).c(), ((WeatherBean) (obj)).d(), forecastbean);
            if (obj != null)
            {
                h.addView(((View) (obj)));
            }
        } while (true);
        h.a();
    }

    static void b(WeatherDayForecastActivity weatherdayforecastactivity)
    {
        weatherdayforecastactivity.g();
    }

    static void c(WeatherDayForecastActivity weatherdayforecastactivity)
    {
        weatherdayforecastactivity.f();
    }

    private void f()
    {
        int i1 = h.b();
        int j1 = h.getChildCount();
        if (j1 <= 1 || i1 == j1 - 1)
        {
            return;
        } else
        {
            h.a(i1 + 1);
            return;
        }
    }

    private void g()
    {
        int i1 = h.b();
        if (i1 == 0)
        {
            return;
        } else
        {
            h.a(i1 - 1);
            return;
        }
    }

    public void a(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
    }

    public void b(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
        weatherdetailscrollgroup = (WeatherForecastView)weatherdetailscrollgroup.getChildAt(i1);
        if (weatherdetailscrollgroup != null)
        {
            a.setText(weatherdetailscrollgroup.a());
        }
        g.b(i1);
    }

    public void c(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
        a(i1, weatherdetailscrollgroup.getChildCount());
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        super.dispatchKeyEvent(keyevent);
        if (k != null)
        {
            k.cancel(l);
            k = null;
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        super.dispatchTouchEvent(motionevent);
        if (k != null)
        {
            k.cancel(l);
            k = null;
        }
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030131);
        getWindow().clearFlags(0x8000000);
        int i1 = e().getDisplayMetrics().widthPixels;
        int j1 = (int)e().getDimension(0x7f0c0095);
        bundle = getWindow().getAttributes();
        bundle.width = i1 - j1 * 2;
        getWindow().setAttributes(bundle);
        d = com.gau.go.launcherex.gowidget.weather.util.f.a(getApplicationContext());
        e = com.gau.go.launcherex.gowidget.weather.c.e.a(getApplicationContext());
        f = getLayoutInflater();
        bundle = Calendar.getInstance();
        bundle.add(5, 1);
        i = (new SimpleDateFormat("yyyy/MM/dd")).format(bundle.getTime());
        m = e.a().g;
        n = e.a().q;
        bundle = (TextView)findViewById(0x7f090588);
        bundle.setVisibility(0);
        bundle.setText(0x7f0801fd);
        bundle.setOnClickListener(new az(this));
        a = (TextView)findViewById(0x7f090231);
        g = (Indicator)findViewById(0x7f090586);
        g.a(0x7f020628, 0x7f020627);
        h = (WeatherDetailScrollGroup)findViewById(0x7f090587);
        h.a(this);
        b = findViewById(0x7f090584);
        b.setOnClickListener(new ba(this));
        c = findViewById(0x7f090585);
        c.setOnClickListener(new bb(this));
        b();
        i1 = h.getChildCount();
        if (i1 == 0)
        {
            finish();
            return;
        } else
        {
            g.a(i1);
            g.c((int)(10F * e().getDisplayMetrics().density));
            g.b(0);
            a(0, i1);
            bundle = (WeatherForecastView)h.getChildAt(0);
            a.setText(bundle.a());
            j = new Notification();
            k = (NotificationManager)getSystemService("notification");
            j.defaults = 1;
            k.notify(l, j);
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (k != null)
        {
            k.cancel(l);
            k = null;
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        h.removeAllViews();
        b();
        int i1 = h.getChildCount();
        if (i1 == 0)
        {
            finish();
            return;
        } else
        {
            g.a(i1);
            g.c((int)(10F * e().getDisplayMetrics().density));
            g.b(0);
            a(0, i1);
            intent = (WeatherForecastView)h.getChildAt(0);
            a.setText(intent.a());
            return;
        }
    }
}
