// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            e, ForecastHourForm

public class c extends a
{

    private f a;
    private String b;
    private e c;
    private Time d;
    private ForecastHourForm e;

    public c()
    {
        b = "";
        c = new e(this, null);
    }

    static ForecastHourForm a(c c1)
    {
        return c1.e;
    }

    private void a(boolean flag)
    {
        ArrayList arraylist = a.d();
        int i = 0;
        do
        {
label0:
            {
                if (i < arraylist.size())
                {
                    String s;
                    if (arraylist.get(i) != null)
                    {
                        s = ((WeatherBean)arraylist.get(i)).c();
                    } else
                    {
                        s = "";
                    }
                    if (!s.equals(b))
                    {
                        break label0;
                    }
                    e.a(s, flag, false);
                }
                return;
            }
            i++;
        } while (true);
    }

    private boolean b()
    {
        Time time = new Time();
        time.setToNow();
        if (d.year == time.year && d.month == time.month && d.monthDay == time.monthDay)
        {
            return false;
        } else
        {
            d.setToNow();
            return true;
        }
    }

    static boolean b(c c1)
    {
        return c1.b();
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle = bundle.getString("cityId");
        } else
        {
            bundle = "";
        }
        if (!TextUtils.isEmpty(bundle) && !bundle.equals(b))
        {
            b = bundle;
        }
    }

    protected void f()
    {
        super.f();
        e.b();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03007f, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDestroyView()
    {
        b(c);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext()).h();
        e = (ForecastHourForm)c(0x7f0902df);
        e.a(this);
        d = new Time();
        d.setToNow();
        view = getArguments();
        if (view != null)
        {
            view = view.getString("cityId");
        } else
        {
            view = "";
        }
        b = view;
        a(true);
        a(c);
    }
}
