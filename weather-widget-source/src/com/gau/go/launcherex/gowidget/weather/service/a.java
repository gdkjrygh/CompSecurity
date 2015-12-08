// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            AppWidgetService

class a
    implements Runnable
{

    final AppWidgetService a;

    a(AppWidgetService appwidgetservice)
    {
        a = appwidgetservice;
        super();
    }

    public void run()
    {
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a.getApplicationContext()))
        {
            a.stopSelfResult(AppWidgetService.a(a));
        }
    }
}
