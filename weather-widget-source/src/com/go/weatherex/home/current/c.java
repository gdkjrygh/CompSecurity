// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.fragment.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa, WeatherDetailInfo

public class c extends aa
    implements android.view.View.OnClickListener
{

    private String b;
    private View c;
    private TextView d;
    private WeatherDetailInfo e;

    public c(a a1, int j)
    {
        super(a1, j);
        c = LayoutInflater.from(a1.getActivity()).inflate(0x7f03003b, null);
        e = (WeatherDetailInfo)c.findViewById(0x7f0901e5);
        e.a(a1);
        d = (TextView)c.findViewById(0x7f090202);
        d.setText(0x7f0802a8);
        a.a(d, 4, true);
        c.setOnClickListener(this);
    }

    private void m()
    {
        e.a(b);
    }

    public void a()
    {
        super.a();
        m();
    }

    public void a(int j)
    {
        super.a(j);
        m();
    }

    public void a(String s)
    {
        b = s;
        m();
    }

    public void a(List list, w w)
    {
        super.a(list, w);
        m();
    }

    public void b()
    {
        super.b();
        m();
    }

    public void c()
    {
        super.c();
        m();
    }

    public void c(int j)
    {
        super.c(j);
        m();
    }

    public void d(int j)
    {
        super.d(j);
        m();
    }

    public void d(boolean flag)
    {
        super.d(flag);
    }

    public void e(int j)
    {
        m();
    }

    public View f()
    {
        return c;
    }

    public void g()
    {
    }

    public void h()
    {
        d.setText(0x7f0802a8);
        m();
    }

    public void i()
    {
    }

    public void onClick(View view)
    {
        if (!view.equals(c));
    }
}
