// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.windforecast.WindInfoBase;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa

public class r extends aa
{

    private String b;
    private View c;
    private TextView d;
    private WindInfoBase e;

    public r(a a1, int j)
    {
        super(a1, j);
        c = LayoutInflater.from(a1.getActivity()).inflate(0x7f030043, null);
        e = (WindInfoBase)c.findViewById(0x7f090206);
        e.a(a);
        d = (TextView)c.findViewById(0x7f090202);
        a.a(d, 4, true);
        d.setText(0x7f0802de);
        e.setBackgroundResource(0x7f0202df);
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

    public void b(int j)
    {
        super.b(j);
        m();
    }

    public void d(boolean flag)
    {
        super.d(flag);
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
        d.setText(0x7f0802de);
        m();
    }

    public void i()
    {
        e.a();
    }
}
