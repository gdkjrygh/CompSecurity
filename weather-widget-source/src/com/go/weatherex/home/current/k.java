// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;

// Referenced classes of package com.go.weatherex.home.current:
//            aa, w

public class k extends aa
    implements android.view.View.OnClickListener
{

    private View b;
    private Context c;
    private WeatherBean d;
    private TextView e;

    public k(a a1, int l)
    {
        super(a1, l);
        c = a.getActivity();
        b = a1.i().a(0x7f03003f, null);
        b.setClickable(true);
        b.setOnClickListener(this);
        e = (TextView)b.findViewById(0x7f090202);
        a.a(e, 4, true);
        o();
    }

    private Context m()
    {
        return c.getApplicationContext();
    }

    private void n()
    {
        if (d == null)
        {
            return;
        } else
        {
            ((w)a).f(d.c());
            return;
        }
    }

    private void o()
    {
        e.setText(c.getString(0x7f0802e0));
    }

    public void a(String s)
    {
        d = com.gau.go.launcherex.gowidget.weather.util.f.a(m()).a(s);
    }

    public View f()
    {
        return b;
    }

    public void g()
    {
    }

    public void h()
    {
        o();
    }

    public void i()
    {
    }

    public void j()
    {
        super.j();
    }

    public void k()
    {
        super.k();
    }

    public void onClick(View view)
    {
        n();
        l();
    }
}
