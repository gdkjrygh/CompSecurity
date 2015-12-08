// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.globalview.h;

// Referenced classes of package com.go.weatherex.home:
//            r

class u
    implements h
{

    final r a;

    u(r r1)
    {
        a = r1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            com.go.weatherex.home.r.a(a, r.c(a).getPackageName());
            q.a(r.c(a).getApplicationContext()).a(new a(109, "score"));
            return;
        } else
        {
            q.a(r.c(a).getApplicationContext()).a(new a(109, "cancel"));
            return;
        }
    }
}
