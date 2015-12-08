// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.celllocation;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.jiubang.goweather.c.p;
import com.jiubang.goweather.c.s;
import com.jiubang.goweather.c.w;
import com.jiubang.goweather.e.a;
import com.mapbar.android.location.CellLocationProvider;

public class b extends w
    implements LocationListener
{

    private boolean d;
    private s e;
    private CellLocationProvider f;

    public b(Context context, p p1)
    {
        super(context, p1);
        d = false;
    }

    private void b()
    {
        if (f == null)
        {
            f = new CellLocationProvider(a);
        }
        f.addLocationListener(this);
        f.enableLocation();
    }

    public void a()
    {
        d = true;
    }

    public boolean a(int i, s s1)
    {
        e = s1;
        if (!com.jiubang.goweather.e.a.b(a))
        {
            com.gtp.a.a.a.a.a().a("\u7F51\u7EDC\u4E0D\u901A\uFF0C\u653E\u5F03\u56FE\u5427\u57FA\u7AD9\u5B9A\u4F4D", "location.txt");
            c.a();
            e.c(7);
            return false;
        }
        if (i == 3)
        {
            e.b(5);
        } else
        if (i == 2)
        {
            e.b(6);
        }
        if (com.gau.go.launcherex.gowidget.statistics.w.p(a))
        {
            b();
            com.gtp.a.a.a.a.a().a("\u57FA\u7AD9\u5B9A\u4F4D\u5F00\u59CB", "location.txt");
            return true;
        } else
        {
            com.gtp.a.a.a.a.a().a("\u975E\u56FD\u5185\u7528\u6237\uFF0C\u653E\u5F03\u56FE\u5427\u57FA\u7AD9\u5B9A\u4F4D", "location.txt");
            e.c(5);
            return false;
        }
    }

    public void onLocationChanged(Location location)
    {
        if (!d)
        {
            c.a();
            if (location != null)
            {
                com.gtp.a.a.a.a.a().a("\u57FA\u7AD9\u5B9A\u4F4D\u6210\u529F", "location.txt");
                e.a(location);
            } else
            {
                e.c(5);
            }
        }
        f.clearLocationListener();
        f.disableLocation();
    }

    public void onProviderDisabled(String s1)
    {
    }

    public void onProviderEnabled(String s1)
    {
    }

    public void onStatusChanged(String s1, int i, Bundle bundle)
    {
    }
}
