// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.d;

// Referenced classes of package com.go.weatherex.home:
//            x

class y
    implements d
{

    final Activity a;
    final c b;
    final x c;

    y(x x1, Activity activity, c c1)
    {
        c = x1;
        a = activity;
        b = c1;
        super();
    }

    public void a()
    {
        x.a(c, a);
        b.b(this);
    }
}
