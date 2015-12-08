// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.b;

import android.content.Context;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.go.weatherex.ad.b:
//            a, d

public class c
{

    private Context a;
    private a b;

    public c(Context context)
    {
        a = context;
        b = new a(context);
    }

    public void a()
    {
        if (!e())
        {
            b.a();
        }
    }

    public void a(d d1)
    {
        b.a(d1);
    }

    public boolean b()
    {
        return b.b();
    }

    public void c()
    {
        if (!e())
        {
            b.c();
        }
    }

    public void d()
    {
    }

    public boolean e()
    {
        return GoWidgetApplication.b(a.getApplicationContext()).b();
    }
}
