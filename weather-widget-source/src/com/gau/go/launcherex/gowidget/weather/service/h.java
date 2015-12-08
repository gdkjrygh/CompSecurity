// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.weather.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            NotifyService

class h
    implements Runnable
{

    final NotifyService a;

    h(NotifyService notifyservice)
    {
        a = notifyservice;
        super();
    }

    public void run()
    {
        if (g.a(a.getApplicationContext()))
        {
            c.a(a.getApplicationContext()).a();
        }
    }
}
