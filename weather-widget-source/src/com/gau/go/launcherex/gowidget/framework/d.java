// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import com.gau.go.launcherex.gowidget.weather.service.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetApplication, GoWidgetActivity, e, m

class d extends a
{

    final GoWidgetActivity a;

    d(GoWidgetActivity gowidgetactivity)
    {
        a = gowidgetactivity;
        super();
    }

    protected void a()
    {
        com.gau.go.launcherex.gowidget.framework.GoWidgetActivity.a(a, new com.jiubang.ggheart.analytic.a(GoWidgetApplication.b(), 0x7f060026));
        GoWidgetActivity.b(a).a();
        GoWidgetActivity.b(a).b();
        com.gau.go.launcherex.gowidget.framework.GoWidgetActivity.a(a).postDelayed(new e(this), 0x124f80L);
    }
}
