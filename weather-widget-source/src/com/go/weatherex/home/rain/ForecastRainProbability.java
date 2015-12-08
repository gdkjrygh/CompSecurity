// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.a.d;
import com.a.a.s;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
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
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.home.rain:
//            c, ForecastRainProbabilityGraphs

public class ForecastRainProbability extends RelativeLayout
{

    private Context a;
    private ArrayList b;
    private f c;
    private g d;
    private e e;
    private Time f;
    private ForecastRainProbabilityGraphs g;
    private View h;
    private TextView i;
    private TextView j;
    private View k;
    private android.widget.LinearLayout.LayoutParams l;
    private DisplayMetrics m;
    private LinearLayout n;
    private int o;
    private String p;
    private boolean q;
    private int r;
    private String s[];
    private String t;
    private TextView u;
    private TextView v;
    private TextView w;
    private boolean x;
    private a y;

    public ForecastRainProbability(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = null;
        p = "";
        q = false;
        r = -1;
        x = false;
        a(context);
    }

    static View a(ForecastRainProbability forecastrainprobability)
    {
        return forecastrainprobability.h;
    }

    private String a(int i1, int j1, int k1)
    {
        f.setToNow();
        f.set(k1, j1 - 1, i1);
        f.normalize(false);
        return s[f.weekDay];
    }

    private void a(Context context)
    {
        a = context;
        b = new ArrayList();
        context = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext());
        c = context.h();
        e = context.f();
        d = c.a();
        f = new Time();
        s = com.gau.go.launcherex.gowidget.weather.util.c.h(a);
        for (int i1 = s.length - 1; i1 > -1; i1--)
        {
            s[i1] = com.gau.go.launcherex.gowidget.weather.util.r.e(s[i1]);
        }

        t = com.gau.go.launcherex.gowidget.weather.util.r.e(a.getResources().getString(0x7f0802b7));
        m = a.getResources().getDisplayMetrics();
    }

    private void a(String s1)
    {
        s1 = c(s1);
        Object obj = c.a(s1);
        if (obj != null)
        {
            NowBean nowbean = ((WeatherBean) (obj)).l;
            String s2 = nowbean.e();
            int i1;
            if (!com.gau.go.launcherex.gowidget.weather.util.r.a(s2))
            {
                u.setText(a.getText(0x7f0801e2).toString());
            } else
            {
                u.setText(b(s2));
            }
            i1 = com.gau.go.launcherex.gowidget.weather.util.r.a(i.e, nowbean.d(), a(((WeatherBean) (obj))));
            u.setCompoundDrawablesWithIntrinsicBounds(i1, 0, 0, 0);
            i1 = nowbean.o();
            if (i1 >= 0 && i1 <= 100)
            {
                v.setText(String.valueOf(i1));
            } else
            {
                v.setText("--");
            }
            if (((WeatherBean) (obj)).g != null)
            {
                b.clear();
                q = true;
                r = -1;
                obj = d.c(((WeatherBean) (obj)).l.n());
                s1 = com.go.weatherex.i.c.b(a, s1).iterator();
                int j1 = 0;
                while (s1.hasNext()) 
                {
                    ForecastBean forecastbean = (ForecastBean)s1.next();
                    ForecastBean forecastbean1 = new ForecastBean();
                    forecastbean1.a(forecastbean.e(), forecastbean.f(), forecastbean.g());
                    forecastbean1.e(forecastbean.m());
                    forecastbean1.d(forecastbean.d());
                    forecastbean1.c(forecastbean.i());
                    forecastbean1.f(forecastbean.h());
                    if (forecastbean1.m() < 0 || forecastbean1.m() > 100)
                    {
                        forecastbean1.e(-10000);
                    } else
                    {
                        q = false;
                    }
                    if (com.gau.go.launcherex.gowidget.weather.util.r.a(forecastbean1.e(), forecastbean1.f(), forecastbean1.g(), ((Time) (obj))))
                    {
                        r = j1;
                    }
                    b.add(forecastbean1);
                    j1++;
                }
            }
        }
    }

    private String b(String s1)
    {
        String s2;
label0:
        {
            if (s1 != null)
            {
                s2 = s1;
                if (!"--".equals(s1))
                {
                    break label0;
                }
            }
            s2 = getResources().getString(0x7f0801e2);
        }
        return s2;
    }

    static boolean b(ForecastRainProbability forecastrainprobability)
    {
        return forecastrainprobability.q;
    }

    static TextView c(ForecastRainProbability forecastrainprobability)
    {
        return forecastrainprobability.j;
    }

    private String c(String s1)
    {
        WeatherBean weatherbean = c.a(s1);
        s1 = weatherbean;
        if (weatherbean == null)
        {
            ArrayList arraylist = c.d();
            s1 = weatherbean;
            if (arraylist != null)
            {
                s1 = weatherbean;
                if (arraylist.size() > 0)
                {
                    s1 = (WeatherBean)arraylist.get(0);
                }
            }
        }
        if (s1 != null)
        {
            return s1.c();
        } else
        {
            return null;
        }
    }

    private GoWeatherEXTextView d()
    {
        GoWeatherEXTextView goweatherextextview = new GoWeatherEXTextView(a);
        goweatherextextview.setGravity(17);
        goweatherextextview.setTextColor(-1);
        goweatherextextview.setMaxLines(2);
        goweatherextextview.setTextSize(0, a.getResources().getDimension(0x7f0c014e));
        goweatherextextview.setVisibility(4);
        if (y != null)
        {
            y.a(goweatherextextview, 4, true);
        }
        return goweatherextextview;
    }

    static ArrayList d(ForecastRainProbability forecastrainprobability)
    {
        return forecastrainprobability.b;
    }

    static ForecastRainProbabilityGraphs e(ForecastRainProbability forecastrainprobability)
    {
        return forecastrainprobability.g;
    }

    public void a()
    {
        WeatherBean weatherbean;
        if (!TextUtils.isEmpty(p))
        {
            if ((weatherbean = c.a(p)) != null && weatherbean.l != null)
            {
                int i1 = com.gau.go.launcherex.gowidget.weather.util.r.a(i.e, weatherbean.l.d(), a(weatherbean));
                u.setCompoundDrawablesWithIntrinsicBounds(i1, 0, 0, 0);
                return;
            }
        }
    }

    public void a(View view)
    {
        view = com.a.a.s.a(view, "alpha", new float[] {
            0.0F
        });
        d d1 = new d();
        d1.a(view);
        d1.c(0L);
        d1.a();
    }

    public void a(View view, int i1)
    {
        s s1 = com.a.a.s.a(view, "translationY", new float[] {
            100F, 0.0F
        });
        view = com.a.a.s.a(view, "alpha", new float[] {
            0.0F, 1.0F
        });
        d d1 = new d();
        d1.a(new com.a.a.a[] {
            s1, view
        });
        d1.b((long)(i1 * 150) + 450L);
        d1.c(420L);
        d1.a();
    }

    public void a(a a1)
    {
        y = a1;
    }

    public void a(String s1, boolean flag, boolean flag1)
    {
        if (!flag1 && p.equals(s1) && x)
        {
            return;
        }
        p = s1;
        if (!x)
        {
            x = true;
            if (y != null)
            {
                y.a(v, 3, true);
                y.a(w, 3, true);
                y.a(u, 4, true);
            }
        }
        if (flag)
        {
            a(k);
            a(k, 0);
        }
        a(s1);
        if (b.size() == 0)
        {
            i.setVisibility(0);
            j.setVisibility(8);
            h.setVisibility(8);
        } else
        {
            int i1;
            int j1;
            if (flag)
            {
                h.setVisibility(4);
            } else
            {
                h.setVisibility(0);
            }
            n.removeAllViews();
            j1 = b.size();
            if (j1 < 10)
            {
                i1 = j1;
            } else
            {
                i1 = 10;
            }
            l = new android.widget.LinearLayout.LayoutParams((Math.min(m.widthPixels, m.heightPixels) - (n.getPaddingLeft() + n.getPaddingRight())) / i1, -2);
            i1 = 0;
            while (i1 < j1) 
            {
                Object obj = (ForecastBean)b.get(i1);
                if (obj != null)
                {
                    GoWeatherEXTextView goweatherextextview = d();
                    int k1 = e.a().k;
                    if (i1 == 0 || ((ForecastBean) (obj)).g() == 1)
                    {
                        s1 = com.gau.go.launcherex.gowidget.weather.util.r.a(((ForecastBean) (obj)).e(), ((ForecastBean) (obj)).f(), ((ForecastBean) (obj)).g(), false, k1);
                    } else
                    if (((ForecastBean) (obj)).g() < 10)
                    {
                        s1 = (new StringBuilder()).append("0").append(((ForecastBean) (obj)).g()).toString();
                    } else
                    {
                        s1 = String.valueOf(((ForecastBean) (obj)).g());
                    }
                    if (r == i1)
                    {
                        obj = t;
                        goweatherextextview.setTypeface(Typeface.defaultFromStyle(1));
                        goweatherextextview.getPaint().setFakeBoldText(true);
                    } else
                    {
                        obj = a(((ForecastBean) (obj)).e(), ((ForecastBean) (obj)).f(), ((ForecastBean) (obj)).g());
                        goweatherextextview.setTypeface(Typeface.defaultFromStyle(0));
                        goweatherextextview.getPaint().setFakeBoldText(false);
                    }
                    goweatherextextview.setText((new StringBuilder()).append(((String) (obj))).append("\n").append(s1).toString());
                    goweatherextextview.setVisibility(0);
                    n.addView(goweatherextextview, l);
                }
                i1++;
            }
            i.setVisibility(8);
            if (flag)
            {
                h.postDelayed(new com.go.weatherex.home.rain.c(this, flag), 870L);
            } else
            if (q)
            {
                j.setVisibility(0);
                g.a(b, false, q, false);
            } else
            {
                j.setVisibility(8);
                g.a(b, flag, q, false);
            }
        }
        invalidate();
    }

    public boolean a(WeatherBean weatherbean)
    {
        if (weatherbean == null)
        {
            return true;
        }
        String s1 = weatherbean.l.j();
        String s2 = weatherbean.l.k();
        if (GoWidgetApplication.b(a.getApplicationContext()).b() && d.d())
        {
            int i1 = weatherbean.l.n();
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2, d.b(i1));
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2);
        }
    }

    public void b()
    {
        a(p, false, true);
    }

    public void c()
    {
        Resources resources = a.getResources();
        s = com.gau.go.launcherex.gowidget.weather.util.c.a(resources);
        for (int i1 = s.length - 1; i1 > -1; i1--)
        {
            s[i1] = com.gau.go.launcherex.gowidget.weather.util.r.e(s[i1]);
        }

        t = com.gau.go.launcherex.gowidget.weather.util.r.e(resources.getString(0x7f0802b7));
        i.setText(resources.getString(0x7f0802b6));
        j.setText(resources.getString(0x7f0802f6));
        b();
    }

    protected void onFinishInflate()
    {
        h = findViewById(0x7f0902aa);
        i = (TextView)findViewById(0x7f0902a9);
        j = (TextView)findViewById(0x7f0902ac);
        u = (TextView)findViewById(0x7f0902a6);
        v = (TextView)findViewById(0x7f0902a7);
        w = (TextView)findViewById(0x7f0902a8);
        k = findViewById(0x7f0902a5);
        g = (ForecastRainProbabilityGraphs)findViewById(0x7f0902ab);
        n = (LinearLayout)findViewById(0x7f0902ad);
        int i1 = n.getPaddingLeft();
        o = (Math.min(a.getResources().getDisplayMetrics().widthPixels, a.getResources().getDisplayMetrics().heightPixels) - h.getPaddingLeft() - h.getPaddingRight() - i1) / 10;
        g.a(o);
        g.b(i1);
    }
}
