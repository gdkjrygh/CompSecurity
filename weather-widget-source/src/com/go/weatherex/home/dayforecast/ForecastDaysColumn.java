// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.dayforecast;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.globalview.GoWeatherEXTextView;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.dayforecast:
//            ColumnGraphs

public class ForecastDaysColumn extends LinearLayout
{

    private Context a;
    private String b;
    private String c[];
    private Time d;
    private f e;
    private e f;
    private g g;
    private LinearLayout h;
    private ColumnGraphs i;
    private LinearLayout j;
    private a k;
    private float l;

    public ForecastDaysColumn(Context context)
    {
        super(context);
        a(context);
    }

    public ForecastDaysColumn(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    private ImageView a(int i1)
    {
        ImageView imageview = new ImageView(a);
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        imageview.setImageResource(r.a(i.e, i1, true));
        imageview.setPadding(Math.round(l * 4F), 0, Math.round(l * 4F), 0);
        return imageview;
    }

    private String a(int i1, int j1, int k1)
    {
        d.setToNow();
        d.set(k1, j1 - 1, i1);
        d.normalize(false);
        return c[d.weekDay];
    }

    private void a(Context context)
    {
        a = context;
        c c1 = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        e = c1.h();
        f = c1.f();
        g = c1.g();
        d = new Time();
        l = context.getResources().getDisplayMetrics().density;
    }

    private void a(String s, Context context, ArrayList arraylist)
    {
        h.removeAllViews();
        j.removeAllViews();
        int k1 = arraylist.size();
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(q.a(((float)Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) - a.getResources().getDimension(0x7f0c014d) * 2.0F) / (float)k1), -2);
        s = e.a(s);
        Time time;
        int i1;
        int j1;
        if (s != null)
        {
            i1 = ((WeatherBean) (s)).l.n();
        } else
        {
            i1 = 0;
        }
        time = g.c(i1);
        i1 = 0;
        j1 = 0;
        while (j1 < k1) 
        {
            ForecastBean forecastbean = (ForecastBean)arraylist.get(j1);
            if (forecastbean != null)
            {
                GoWeatherEXTextView goweatherextextview = b();
                int l1 = f.a().k;
                if (j1 == 0 || forecastbean.g() == 1)
                {
                    s = r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), false, l1);
                } else
                if (forecastbean.g() < 10)
                {
                    s = (new StringBuilder()).append("0").append(forecastbean.g()).toString();
                } else
                {
                    s = String.valueOf(forecastbean.g());
                }
                if (i1 == 0 && r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), time))
                {
                    i1 = 1;
                    context = b;
                    goweatherextextview.setTypeface(Typeface.defaultFromStyle(1));
                    goweatherextextview.getPaint().setFakeBoldText(true);
                } else
                {
                    context = a(forecastbean.e(), forecastbean.f(), forecastbean.g());
                    goweatherextextview.setTypeface(Typeface.defaultFromStyle(0));
                    goweatherextextview.getPaint().setFakeBoldText(false);
                }
                goweatherextextview.setText((new StringBuilder()).append(context).append("\n").append(s).toString());
                goweatherextextview.setVisibility(0);
                h.addView(goweatherextextview, layoutparams);
                s = a(forecastbean.i());
                j.addView(s, layoutparams);
            }
            j1++;
        }
    }

    private GoWeatherEXTextView b()
    {
        GoWeatherEXTextView goweatherextextview = new GoWeatherEXTextView(a);
        goweatherextextview.setGravity(17);
        goweatherextextview.setTextColor(-1);
        goweatherextextview.setMaxLines(2);
        goweatherextextview.setTextSize(0, a.getResources().getDimension(0x7f0c014e));
        if (k != null)
        {
            k.a(goweatherextextview, 4, true);
        }
        return goweatherextextview;
    }

    public void a()
    {
        h.removeAllViews();
        i.a();
    }

    public void a(a a1)
    {
        k = a1;
    }

    public void a(String s, boolean flag, ArrayList arraylist)
    {
        b = r.e(a.getResources().getString(0x7f0802b7));
        c = com.gau.go.launcherex.gowidget.weather.util.c.h(a);
        for (int i1 = c.length - 1; i1 > -1; i1--)
        {
            c[i1] = r.e(c[i1]);
        }

        a(s, a, arraylist);
        i.a(s, arraylist, flag);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        i = (ColumnGraphs)findViewById(0x7f09029a);
        h = (LinearLayout)findViewById(0x7f090298);
        j = (LinearLayout)findViewById(0x7f090299);
    }
}
