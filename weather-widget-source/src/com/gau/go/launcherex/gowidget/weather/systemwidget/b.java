// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.Context;
import android.widget.RemoteViews;
import com.go.weatherex.j.m;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            a

class b
    implements m
{

    final int a;
    final a b;

    b(a a1, int i)
    {
        b = a1;
        a = i;
        super();
    }

    public void onViewUpdate(boolean flag, RemoteViews remoteviews)
    {
        if (flag)
        {
            b.a(a, new RemoteViews(com.gau.go.launcherex.gowidget.weather.systemwidget.a.a(b).getPackageName(), 0x7f030139));
        }
        b.a(a, remoteviews);
    }
}
