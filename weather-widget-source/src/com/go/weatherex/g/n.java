// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;

// Referenced classes of package com.go.weatherex.g:
//            l

class n extends b
{

    final l a;
    private TextView b;
    private CityBean c;

    public n(l l1)
    {
        a = l1;
        super();
        e = com.go.weatherex.g.l.b(l1).i().a(0x7f0300f2, null);
        b = (TextView)b(0x7f0904de);
        e.setTag(this);
    }

    static CityBean a(n n1)
    {
        return n1.c;
    }

    void a(CityBean citybean)
    {
        c = citybean;
        b.setText(c.f());
    }
}
