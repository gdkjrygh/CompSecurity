// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.rain.CuvetteGraphs;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa, q

public class p extends aa
    implements android.view.View.OnClickListener
{

    private com.gau.go.launcherex.gowidget.weather.util.f b;
    private Context c;
    private String d;
    private View e;
    private TextView f;
    private TextView g;
    private View h;
    private View i;
    private TextView j;
    private Button k;
    private CuvetteGraphs l;
    private boolean m;
    private Time n;

    public p(a a1, int i1)
    {
        super(a1, i1);
        m = false;
        c = a1.getActivity().getApplicationContext();
        b = com.gau.go.launcherex.gowidget.weather.c.c.a(a1.getActivity().getApplicationContext()).h();
        e = a1.getActivity().getLayoutInflater().inflate(0x7f030041, null);
        f = (TextView)e.findViewById(0x7f090202);
        a.a(f, 4, true);
        l = (CuvetteGraphs)e.findViewById(0x7f0901fe);
        g = (TextView)e.findViewById(0x7f0901fd);
        h = e.findViewById(0x7f0901fc);
        i = e.findViewById(0x7f0901ff);
        i.setOnClickListener(this);
        j = (TextView)e.findViewById(0x7f090200);
        k = (Button)e.findViewById(0x7f090201);
        k.setOnClickListener(this);
        n = new Time();
        n.setToNow();
        a.a(g, 3, true);
        m = com.gau.go.launcherex.gowidget.weather.c.c.a(c).e().b();
    }

    static TextView a(p p1)
    {
        return p1.g;
    }

    private void m()
    {
        if (a.getActivity() != null)
        {
            Intent intent = new Intent(a.getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
            intent.putExtra("recommend_type", 2);
            intent.putExtra("recommend_enterance", 1);
            a.getActivity().startActivity(intent);
        }
    }

    private boolean n()
    {
        Time time = new Time();
        time.setToNow();
        if (n.year == time.year && n.month == time.month && n.monthDay == time.monthDay)
        {
            return false;
        } else
        {
            n.setToNow();
            return true;
        }
    }

    public void a()
    {
        super.a();
        if (!n())
        {
            return;
        } else
        {
            a(d);
            return;
        }
    }

    public void a(String s)
    {
        f.setText(c.getResources().getString(0x7f0802df));
        if (TextUtils.isEmpty(s))
        {
            g.setText("--%");
            return;
        }
        d = s;
        if (m)
        {
            h.setVisibility(0);
            i.setVisibility(8);
            Object obj = b.a(s);
            if (obj != null)
            {
                int i1 = ((WeatherBean) (obj)).l.o();
                if (i1 >= 0 && i1 <= 100)
                {
                    obj = (new StringBuilder()).append(i1).append("%").toString();
                } else
                {
                    obj = "--%";
                }
            } else
            {
                obj = "--%";
            }
            g.post(new q(this, ((String) (obj))));
            g.setText(((CharSequence) (obj)));
            l.a(s, com.go.weatherex.i.c.b(c, s), true);
            return;
        } else
        {
            h.setVisibility(8);
            i.setVisibility(0);
            return;
        }
    }

    public void a(List list, w w)
    {
        super.a(list, w);
        a(d);
    }

    public void b()
    {
        super.b();
        if (!n())
        {
            return;
        } else
        {
            a(d);
            return;
        }
    }

    public void c()
    {
        super.c();
        m = com.gau.go.launcherex.gowidget.weather.c.c.a(c).e().b();
        a(d);
    }

    public View f()
    {
        return e;
    }

    public void g()
    {
    }

    public void h()
    {
        j.setText(c.getResources().getString(0x7f080368));
        k.setText(c.getResources().getString(0x7f080369));
        a(d);
    }

    public void i()
    {
        l.a();
    }

    public void onClick(View view)
    {
        if (view.equals(k) || view.equals(i))
        {
            m();
        }
    }
}
