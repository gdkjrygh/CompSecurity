// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.jiubang.commerce.ad.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetApplication

class n
    implements Runnable
{

    final GoWidgetApplication a;

    n(GoWidgetApplication gowidgetapplication)
    {
        a = gowidgetapplication;
        super();
    }

    public void run()
    {
        com.jiubang.commerce.ad.a.a(true);
        com.jiubang.commerce.ad.a.a(com.gau.go.launcherex.gowidget.framework.GoWidgetApplication.e(), "com.gau.go.launcherex.gowidget.weatherwidget", e.b(com.gau.go.launcherex.gowidget.framework.GoWidgetApplication.e()), "12", w.w(com.gau.go.launcherex.gowidget.framework.GoWidgetApplication.e()), "200", "11", "1");
    }
}
