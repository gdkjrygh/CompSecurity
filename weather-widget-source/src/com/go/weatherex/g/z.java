// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.go.weatherex.framework.fragment.a;
import com.jiubang.goweather.c.h;

// Referenced classes of package com.go.weatherex.g:
//            y

class z extends h
{

    final y a;

    z(y y1)
    {
        a = y1;
        super();
    }

    public void a(int i)
    {
        if (!y.e(a)) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 2 5: default 40
    //                   2 148
    //                   3 40
    //                   4 40
    //                   5 164;
           goto _L3 _L4 _L3 _L3 _L5
_L3:
        String s = y.f(a).getString(0x7f08019f);
_L7:
        if (y.g(a) != null)
        {
            y.g(a).cancel();
        }
        com.go.weatherex.g.y.a(a, Toast.makeText(y.f(a).getActivity(), s, 0));
        y.g(a).show();
_L2:
        com.go.weatherex.g.y.a(a).setText(0x7f0801b4);
        y.b(a).setVisibility(8);
        y.d(a).setOnClickListener(com.go.weatherex.g.y.h(a));
        return;
_L4:
        s = y.f(a).getString(0x7f08051a);
        continue; /* Loop/switch isn't completed */
_L5:
        s = y.f(a).getString(0x7f08019a);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(CityBean citybean)
    {
        com.go.weatherex.g.y.a(a, citybean);
        com.go.weatherex.g.y.a(a).setText(y.b(a, citybean));
        y.b(a).setVisibility(8);
        y.d(a).setOnClickListener(y.c(a));
    }
}
