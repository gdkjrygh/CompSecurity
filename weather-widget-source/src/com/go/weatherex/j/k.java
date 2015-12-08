// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c;
import com.gau.go.launcherex.gowidget.weather.systemwidget.t;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.j.a.b;
import com.go.weatherex.j.a.f;
import com.go.weatherex.j.a.g;

// Referenced classes of package com.go.weatherex.j:
//            g

public abstract class k
    implements b, f, g
{

    public static final int au[] = {
        0x7f0801bc, 0x7f0801bd, 0x7f0801be, 0x7f0801bf, 0x7f0801c0, 0x7f0801c1, 0x7f0801c2
    };
    public static final int av[] = {
        0x7f08057a, 0x7f08057b, 0x7f08057c, 0x7f08057d, 0x7f08057e, 0x7f08057f, 0x7f080580, 0x7f080581, 0x7f080582, 0x7f080583, 
        0x7f080584, 0x7f080585
    };
    private boolean a;
    protected com.go.weatherex.j.g aw;
    protected final t ax = a();

    public k(com.go.weatherex.j.g g1)
    {
        a = true;
        aw = g1;
    }

    private void a(String s)
    {
        ax.b(s);
        if (ax.a(aw.n()))
        {
            b();
        }
    }

    protected abstract t a();

    protected abstract void a(RemoteViews remoteviews);

    public void a(boolean flag)
    {
        a = flag;
    }

    protected abstract void b();

    protected abstract boolean c();

    protected abstract RemoteViews d();

    public void n()
    {
        String s1 = aw.k();
        String s = s1;
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.c.a(s1))
        {
            s = s1;
            if (!r.a(aw.n(), s1))
            {
                s = "app_widget_theme_default_transparent";
            }
        }
        a(s);
        if (!c())
        {
            a("app_widget_theme_default_transparent");
        }
    }

    public final RemoteViews o()
    {
        RemoteViews remoteviews = d();
        if (remoteviews != null && a)
        {
            a(remoteviews);
        }
        return remoteviews;
    }

}
