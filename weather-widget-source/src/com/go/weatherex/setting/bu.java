// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.w;
import com.gau.go.launcherex.gowidget.weather.model.v;

// Referenced classes of package com.go.weatherex.setting:
//            bo

class bu
    implements w
{

    final bo a;

    bu(bo bo1)
    {
        a = bo1;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            t = (v)a1.c;
            a.h = ((v) (t)).a;
            bo.f(a).setText(((v) (t)).b);
            a.i = ((v) (t)).c;
            com.go.weatherex.setting.bo.a(a).a(a.h, a.i);
        }
    }
}
