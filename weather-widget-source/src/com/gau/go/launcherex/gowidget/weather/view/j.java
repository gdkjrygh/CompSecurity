// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            n, AppListActivity

class j
    implements Runnable
{

    final AppListActivity a;

    j(AppListActivity applistactivity)
    {
        a = applistactivity;
        super();
    }

    public void run()
    {
        (new n(a, null)).execute(new String[0]);
    }
}
