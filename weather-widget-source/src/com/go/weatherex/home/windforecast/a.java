// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.windforecast;

import android.content.Context;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.home.view.DashedLinearLayout;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.windforecast:
//            b, WeatherWindViewHolder, c

class a extends BaseAdapter
{

    final WeatherWindViewHolder a;
    private LayoutInflater b;
    private ArrayList c;
    private ForecastBean d;
    private b e;
    private Time f;

    public a(WeatherWindViewHolder weatherwindviewholder, Context context, ArrayList arraylist, Time time)
    {
        a = weatherwindviewholder;
        super();
        c = new ArrayList();
        b = LayoutInflater.from(context);
        c = arraylist;
        f = time;
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        return c.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j;
        int k;
        int l;
        int i1;
        if (view == null)
        {
            view = b.inflate(0x7f030075, null);
            e = new b(a);
            e.a = (TextView)view.findViewById(0x7f0902ae);
            e.b = (TextView)view.findViewById(0x7f0902af);
            e.c = (LinearLayout)view.findViewById(0x7f0902b0);
            e.d = (ImageView)view.findViewById(0x7f0902b1);
            e.e = (TextView)view.findViewById(0x7f0902b2);
            e.f = (TextView)view.findViewById(0x7f0902b3);
            e.g = (TextView)view.findViewById(0x7f0902b4);
            view.setTag(e);
            WeatherWindViewHolder.a(a).a(view, 4, true);
        } else
        {
            e = (b)view.getTag();
        }
        d = (ForecastBean)c.get(i);
        j = d.e();
        k = d.f();
        l = d.g();
        i1 = r.b(j, k, l);
        if (i1 == 7)
        {
            view.setVisibility(8);
            return view;
        }
        int j1 = WeatherWindViewHolder.b(a).a().k;
        float f1;
        if (r.a(j, k, l, f))
        {
            viewgroup = WeatherWindViewHolder.c(a);
        } else
        {
            viewgroup = WeatherWindViewHolder.d(a)[i1];
        }
        e.a.setText((new StringBuilder()).append(viewgroup).append("\n").append(r.a(j, k, l, false, j1)).toString());
        viewgroup = (DashedLinearLayout)view;
        if (i == getCount() - 1)
        {
            viewgroup.a(false);
        } else
        {
            viewgroup.a(true);
        }
        f1 = d.l();
        if (f1 == -10000F)
        {
            e.b.setVisibility(0);
            e.c.setVisibility(8);
            return view;
        }
        e.b.setVisibility(8);
        e.c.setVisibility(0);
        i = q.a(f1);
        j = WeatherWindViewHolder.a(a, i);
        e.d.setImageResource(j);
        i = WeatherWindViewHolder.b(a, i);
        e.e.setText(i);
        viewgroup = WeatherWindViewHolder.a(a, f1);
        e.f.setText(viewgroup);
        i = WeatherWindViewHolder.c(a, d.k());
        if (i != 0)
        {
            e.g.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        } else
        {
            e.g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        if (r.a(d.j()))
        {
            e.g.setText(d.j());
            return view;
        } else
        {
            e.g.setText(0x7f0801e2);
            return view;
        }
    }
}
