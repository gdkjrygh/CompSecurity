// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.dayforecast;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.view.DashedLinearLayout;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.dayforecast:
//            ForecastDaysForm, f

class e extends BaseAdapter
{

    final ForecastDaysForm a;

    e(ForecastDaysForm forecastdaysform)
    {
        a = forecastdaysform;
        super();
    }

    public int getCount()
    {
        return com.go.weatherex.home.dayforecast.ForecastDaysForm.a(a).size();
    }

    public Object getItem(int j)
    {
        return com.go.weatherex.home.dayforecast.ForecastDaysForm.a(a).get(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        ForecastBean forecastbean = null;
        if (view == null)
        {
            view = ForecastDaysForm.b(a).inflate(0x7f03006f, viewgroup, false);
            viewgroup = new f(a, null);
            viewgroup.a = (TextView)view.findViewById(0x7f090261);
            viewgroup.b = (TextView)view.findViewById(0x7f0900b5);
            viewgroup.c = (ImageView)view.findViewById(0x7f090262);
            viewgroup.d = (TextView)view.findViewById(0x7f09029b);
            viewgroup.e = (TextView)view.findViewById(0x7f09029c);
            view.setTag(viewgroup);
            ForecastDaysForm.c(a).a(view, 4, true);
        } else
        {
            viewgroup = (f)view.getTag();
        }
        if (j < com.go.weatherex.home.dayforecast.ForecastDaysForm.a(a).size())
        {
            forecastbean = (ForecastBean)com.go.weatherex.home.dayforecast.ForecastDaysForm.a(a).get(j);
        }
        if (forecastbean != null)
        {
            float f1;
            float f2;
            String s;
            int k;
            if (r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), ForecastDaysForm.d(a)))
            {
                s = ForecastDaysForm.e(a);
            } else
            {
                s = com.go.weatherex.home.dayforecast.ForecastDaysForm.a(a, forecastbean.e(), forecastbean.f(), forecastbean.g());
            }
            ((f) (viewgroup)).a.setText(s);
            k = ForecastDaysForm.f(a).a().k;
            ((f) (viewgroup)).b.setText(r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), false, k));
            ((f) (viewgroup)).c.setImageResource(r.a(i.e, forecastbean.i(), true));
            if (forecastbean.d() == "--" || TextUtils.isEmpty(forecastbean.d()))
            {
                ((f) (viewgroup)).d.setText(0x7f0801e2);
            } else
            {
                ((f) (viewgroup)).d.setText(forecastbean.d());
            }
            k = ForecastDaysForm.f(a).a().g;
            f1 = forecastbean.b(k);
            f2 = forecastbean.a(k);
            if (f1 == -10000F || f2 == -10000F)
            {
                ((f) (viewgroup)).e.setText("--\260/--\260");
            } else
            {
                ((f) (viewgroup)).e.setText(String.format("%d\260/%d\260", new Object[] {
                    Integer.valueOf(q.a(f1)), Integer.valueOf(q.a(f2))
                }));
            }
        }
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
