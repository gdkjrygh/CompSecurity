// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.view.DashedLinearLayout;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            a, ForecastHourForm

class b extends BaseAdapter
{

    final ForecastHourForm a;
    private LayoutInflater b;
    private ArrayList c;

    public b(ForecastHourForm forecasthourform, Context context)
    {
        a = forecasthourform;
        super();
        c = new ArrayList();
        b = LayoutInflater.from(context);
    }

    private void a(int j, HourlyBean hourlybean, com.go.weatherex.home.hourforecast.a a1)
    {
        if (j == 0 || a(j - 1).c() != hourlybean.c())
        {
            a1.a.setVisibility(0);
            if (a(hourlybean))
            {
                a1.a.setText(0x7f0802b7);
                return;
            }
            StringBuffer stringbuffer = new StringBuffer();
            j = ForecastHourForm.b(a).a().k;
            String s = String.format(Locale.US, "%02d", new Object[] {
                Integer.valueOf(hourlybean.b())
            });
            hourlybean = String.format(Locale.US, "%02d", new Object[] {
                Integer.valueOf(hourlybean.c())
            });
            if (j == 1 || j == 2)
            {
                a1.a.setText(stringbuffer.append(s).append("/").append(hourlybean));
                return;
            } else
            {
                a1.a.setText(stringbuffer.append(hourlybean).append("/").append(s));
                return;
            }
        } else
        {
            a1.a.setText("");
            a1.a.setVisibility(4);
            return;
        }
    }

    private void a(HourlyBean hourlybean, com.go.weatherex.home.hourforecast.a a1)
    {
        int j = q.a(hourlybean.b(ForecastHourForm.b(a).a().g));
        a1.e.setText(String.format("%d\260", new Object[] {
            Integer.valueOf(j)
        }));
    }

    private boolean a(HourlyBean hourlybean)
    {
        WeatherBean weatherbean = ForecastHourForm.d(a).a(ForecastHourForm.c(a));
        return r.a(hourlybean.a(), hourlybean.b(), hourlybean.c(), com.go.weatherex.home.hourforecast.ForecastHourForm.e(a).b(weatherbean.l.n()));
    }

    private void b(HourlyBean hourlybean, com.go.weatherex.home.hourforecast.a a1)
    {
        a1.c.setImageResource(r.a(i.e, hourlybean.e(), b(hourlybean.d())));
    }

    public HourlyBean a(int j)
    {
        return (HourlyBean)c.get(j);
    }

    public void a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            c = arraylist;
        }
    }

    public boolean b(int j)
    {
        boolean flag = true;
        Object obj = ForecastHourForm.d(a).a(ForecastHourForm.c(a));
        if (obj != null)
        {
            String s = ((WeatherBean) (obj)).l.j();
            obj = ((WeatherBean) (obj)).l.k();
            flag = r.a(j, r.a(true, s), r.a(false, ((String) (obj))));
        }
        return flag;
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int j)
    {
        return a(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        HourlyBean hourlybean;
        if (view == null)
        {
            view = b.inflate(0x7f030073, viewgroup, false);
            viewgroup = new com.go.weatherex.home.hourforecast.a(a, view);
            view.setTag(viewgroup);
            com.go.weatherex.home.hourforecast.ForecastHourForm.a(a).a(view, 4, true);
        } else
        {
            viewgroup = (com.go.weatherex.home.hourforecast.a)view.getTag();
        }
        hourlybean = a(j);
        ((com.go.weatherex.home.hourforecast.a) (viewgroup)).d.setText(hourlybean.g());
        a(j, hourlybean, viewgroup);
        ((com.go.weatherex.home.hourforecast.a) (viewgroup)).b.setText(String.format(Locale.US, "%02d:00", new Object[] {
            Integer.valueOf(hourlybean.d())
        }));
        a(hourlybean, viewgroup);
        b(hourlybean, viewgroup);
        viewgroup = (DashedLinearLayout)view;
        if (j == getCount() - 1)
        {
            viewgroup.a(false);
            return view;
        } else
        {
            viewgroup.a(true);
            return view;
        }
    }
}
