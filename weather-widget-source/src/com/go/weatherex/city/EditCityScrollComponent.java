// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.city;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.g.g;
import com.go.weatherex.g.r;
import com.go.weatherex.viewex.ExtendableButton;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.city:
//            b, e, g, a, 
//            CityLinearLayout, i, f

public class EditCityScrollComponent extends LinearLayout
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, b
{

    private f a;
    private com.go.weatherex.framework.fragment.a b;
    private HorizontalScrollView c;
    private CityLinearLayout d;
    private TextView e;
    private ExtendableButton f;
    private i g;
    private ScaleAnimation h;
    private boolean i;
    private String j;

    public EditCityScrollComponent(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = "1";
        a = com.gau.go.launcherex.gowidget.weather.c.c.a(context).h();
        g = new com.go.weatherex.city.e(this);
        h = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
        h.setDuration(300L);
        h.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    static HorizontalScrollView a(EditCityScrollComponent editcityscrollcomponent)
    {
        return editcityscrollcomponent.c;
    }

    private void a(int k)
    {
        Toast.makeText(getContext(), k, 0).show();
    }

    private void a(int k, com.go.weatherex.city.a a1, boolean flag)
    {
        h.setAnimationListener(new com.go.weatherex.city.g(this, a1, flag));
        a1.startAnimation(h);
    }

    static void a(EditCityScrollComponent editcityscrollcomponent, com.go.weatherex.city.a a1, boolean flag)
    {
        editcityscrollcomponent.a(a1, flag);
    }

    private void a(com.go.weatherex.city.a a1, boolean flag)
    {
        int k = d.indexOfChild(a1);
        d.b(a1);
        if (flag)
        {
            g.b(k, a1);
        }
        i = false;
    }

    static boolean a(EditCityScrollComponent editcityscrollcomponent, boolean flag)
    {
        editcityscrollcomponent.i = flag;
        return flag;
    }

    private com.go.weatherex.city.a b(WeatherBean weatherbean)
    {
        com.go.weatherex.city.a a1 = new com.go.weatherex.city.a(getContext());
        a1.setOnLongClickListener(this);
        a1.a(weatherbean);
        return a1;
    }

    private void c(String s)
    {
        s = new a(93, s);
        s.e(j);
        q.a(getContext().getApplicationContext()).a(s);
    }

    private void f()
    {
        if (e != null)
        {
            b.a(e, 4, true);
        }
    }

    private boolean g()
    {
        return d.d() > 1;
    }

    public com.go.weatherex.city.a a(String s)
    {
label0:
        {
            if (TextUtils.isEmpty(s))
            {
                break label0;
            }
            Iterator iterator = d.c().iterator();
            com.go.weatherex.city.a a1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                a1 = (com.go.weatherex.city.a)iterator.next();
            } while (!s.equals(a1.a));
            return a1;
        }
        return null;
    }

    public void a()
    {
        f.setText(0x7f0801b1);
        e.setText(getResources().getString(0x7f0802fa));
    }

    public void a(View view)
    {
        long l = 0L;
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SharedPreferences sharedpreferences = GoWidgetApplication.c(GoWidgetApplication.b()).a();
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getLong("key_city_fragment_backkey_click_time", 0L);
        }
        long l1 = SystemClock.elapsedRealtime();
        if (l1 > l && l1 - l < 500L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(view instanceof com.go.weatherex.city.a))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!i)
        {
            view = (com.go.weatherex.city.a)view;
            int k = d.indexOfChild(view);
            if (d.a())
            {
                if (g())
                {
                    if (view.b())
                    {
                        r.a(getContext(), a.a(((com.go.weatherex.city.a) (view)).a));
                        com.gau.go.launcherex.gowidget.weather.c.c.a(getContext()).f().b(0, true);
                        a(k, ((com.go.weatherex.city.a) (view)), false);
                        return;
                    } else
                    {
                        a(k, ((com.go.weatherex.city.a) (view)), true);
                        return;
                    }
                } else
                {
                    a(0x7f0801b0);
                    return;
                }
            } else
            {
                g.a(k, view);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        obj = view.getTag();
        l = SystemClock.elapsedRealtime();
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (l - ((Long)obj).longValue() < 500L) goto _L1; else goto _L6
_L6:
        view.setTag(Long.valueOf(l));
_L8:
        c("c000_adcity");
        b.a(com/go/weatherex/g/g, null);
        return;
_L5:
        view.setTag(Long.valueOf(l));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(WeatherBean weatherbean)
    {
        weatherbean = b(weatherbean);
        d.a(weatherbean);
        int k = d.d() + 1;
        if (k > 3)
        {
            k = d.a(k - 3).getLeft();
            c.postDelayed(new com.go.weatherex.city.f(this, k), 50L);
        }
    }

    public void a(com.go.weatherex.city.a a1)
    {
        if (a1 != null)
        {
            d.b(a1);
        }
    }

    public void a(i k)
    {
        g = k;
    }

    public void a(com.go.weatherex.framework.fragment.a a1)
    {
        b = a1;
        f();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            f.a();
        } else
        {
            f.b();
        }
        d.a(flag);
    }

    public void b(String s)
    {
        j = s;
    }

    public boolean b()
    {
        return d.a();
    }

    public void c()
    {
        Iterator iterator = d.c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.go.weatherex.city.a a1 = (com.go.weatherex.city.a)iterator.next();
            WeatherBean weatherbean = a.a(a1.a);
            if (weatherbean != null)
            {
                a1.a(weatherbean);
            }
        } while (true);
    }

    public void d()
    {
        d.b();
    }

    public void e()
    {
        if (d.a())
        {
            a(false);
        }
        c.scrollTo(0, 0);
    }

    public void onClick(View view)
    {
        while (!isEnabled() || !view.equals(f)) 
        {
            return;
        }
        if (!d.a())
        {
            a(true);
            return;
        } else
        {
            a(false);
            return;
        }
    }

    protected void onFinishInflate()
    {
        c = (HorizontalScrollView)findViewById(0x7f090228);
        d = (CityLinearLayout)findViewById(0x7f090229);
        d.a(this);
        e = (TextView)findViewById(0x7f090061);
        f = (ExtendableButton)findViewById(0x7f090227);
        f.setOnClickListener(this);
    }

    public boolean onLongClick(View view)
    {
        boolean flag;
        if (!d.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        return true;
    }
}
