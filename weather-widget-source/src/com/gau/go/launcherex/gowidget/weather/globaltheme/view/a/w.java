// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            c, g, l, q, 
//            b

public class w
{

    private c a;
    private g b;
    private l c;
    private q d;

    public w(Activity activity)
    {
        a = new c(activity);
        b = new g(activity);
        c = new l(activity);
        d = new q(activity);
    }

    public void a()
    {
        b.a();
        c.a();
        d.a();
    }

    public void a(Activity activity, b b1)
    {
        if ("com.gau.go.weatherex.nextwidget.style.one".equals(b1.x()))
        {
            a.a(activity);
            a.a();
        } else
        {
            if (b1.a() == 1 || b1.a() == 2)
            {
                c.a(activity);
                c.a(b1);
                return;
            }
            if (b1.a() == 3 || b1.a() == 4)
            {
                b.a(activity);
                b.a(b1);
                return;
            }
        }
    }

    public void a(com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.b b1)
    {
        b.a(b1);
        c.a(b1);
        d.a(b1);
    }

    public void b()
    {
        b.b();
        c.b();
        d.b();
    }
}
