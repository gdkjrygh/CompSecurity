// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.framework.fragment.a;
import com.jiubang.a.a.e;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            b, ForecastHourTrend

public class ForecastHourForm extends FrameLayout
{

    private Context a;
    private ForecastHourTrend b;
    private f c;
    private com.gau.go.launcherex.gowidget.weather.c.e d;
    private g e;
    private String f;
    private boolean g;
    private ListView h;
    private e i;
    private View j;
    private View k;
    private a l;

    public ForecastHourForm(Context context)
    {
        super(context);
        f = "";
        g = false;
        a(context);
    }

    public ForecastHourForm(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = "";
        g = false;
        a(context);
    }

    static a a(ForecastHourForm forecasthourform)
    {
        return forecasthourform.l;
    }

    private void a(Context context)
    {
        a = context;
        context = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        c = context.h();
        d = context.f();
        e = context.g();
        i = new e(new b(this, a));
    }

    static com.gau.go.launcherex.gowidget.weather.c.e b(ForecastHourForm forecasthourform)
    {
        return forecasthourform.d;
    }

    static String c(ForecastHourForm forecasthourform)
    {
        return forecasthourform.f;
    }

    static f d(ForecastHourForm forecasthourform)
    {
        return forecasthourform.c;
    }

    static g e(ForecastHourForm forecasthourform)
    {
        return forecasthourform.e;
    }

    public void a()
    {
        a(f, false, true);
    }

    public void a(a a1)
    {
        l = a1;
    }

    public void a(String s, boolean flag, boolean flag1)
    {
        if (!flag1 && f.equals(s) && g)
        {
            return;
        }
        g = true;
        f = s;
        ArrayList arraylist = com.go.weatherex.i.c.a(a, s);
        if (!arraylist.isEmpty())
        {
            j.setVisibility(8);
            k.setVisibility(0);
            b b1 = (b)i.e();
            b1.a(arraylist);
            if (flag)
            {
                i.a(300L, 130L, 420L, 50F);
            } else
            {
                i.a(0L, 0L, 0L, 0.0F);
            }
            b1.notifyDataSetChanged();
            i.notifyDataSetChanged();
            b.a(s, flag, arraylist);
            return;
        } else
        {
            k.setVisibility(8);
            j.setVisibility(0);
            return;
        }
    }

    public void b()
    {
        a();
    }

    protected void onFinishInflate()
    {
        h = (ListView)findViewById(0x7f0902a3);
        i.a(h);
        h.setAdapter(i);
        j = findViewById(0x7f0901e3);
        k = findViewById(0x7f09029d);
        b = (ForecastHourTrend)findViewById(0x7f0902a1);
        h.setCacheColorHint(0);
    }
}
