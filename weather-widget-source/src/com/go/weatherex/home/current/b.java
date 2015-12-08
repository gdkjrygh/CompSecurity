// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.dayforecast.ForecastDaysColumn;
import com.go.weatherex.i.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa

public class b extends aa
{

    private Context b;
    private ForecastDaysColumn c;
    private View d;
    private TextView e;
    private String f;
    private View g;
    private Time h;

    public b(a a1, int j)
    {
        super(a1, j);
        b = a1.getActivity().getApplicationContext();
        d = a1.getActivity().getLayoutInflater().inflate(0x7f03003a, null);
        c = (ForecastDaysColumn)d.findViewById(0x7f0901e2);
        e = (TextView)d.findViewById(0x7f090202);
        a.a(e, 4, true);
        g = d.findViewById(0x7f0901e3);
        h = new Time();
        h.setToNow();
    }

    private boolean m()
    {
        Time time = new Time();
        time.setToNow();
        if (h.year == time.year && h.month == time.month && h.monthDay == time.monthDay)
        {
            return false;
        } else
        {
            h.setToNow();
            return true;
        }
    }

    public void a()
    {
        super.a();
        if (!m())
        {
            return;
        } else
        {
            a(f);
            return;
        }
    }

    public void a(int j)
    {
        super.a(j);
        a(f);
    }

    public void a(String s)
    {
        e.setText(b.getResources().getString(0x7f0802dd));
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        f = s;
        ArrayList arraylist = com.go.weatherex.i.c.b(b, s);
        if (arraylist != null && !arraylist.isEmpty())
        {
            c.setVisibility(0);
            g.setVisibility(8);
            c.a(s, false, arraylist);
            return;
        } else
        {
            c.setVisibility(8);
            g.setVisibility(0);
            return;
        }
    }

    public void a(List list, w w)
    {
        super.a(list, w);
        a(f);
    }

    public void b()
    {
        super.b();
        if (!m())
        {
            return;
        } else
        {
            a(f);
            return;
        }
    }

    public void c()
    {
        super.c();
        a(f);
    }

    public void e(int j)
    {
        super.e(j);
        a(f);
    }

    public View f()
    {
        return d;
    }

    public void g()
    {
    }

    public void h()
    {
        a(f);
    }

    public void i()
    {
        c.a();
    }
}
