// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedDayAniView, MultiDayScrollView

class b
    implements Runnable
{

    final AdvancedDayAniView a;

    b(AdvancedDayAniView advanceddayaniview)
    {
        a = advanceddayaniview;
        super();
    }

    public void run()
    {
        a.a(AdvancedDayAniView.a(a), AdvancedDayAniView.b(a));
        a.a(AdvancedDayAniView.c(a), AdvancedDayAniView.d(a));
        AdvancedDayAniView.e(a).b();
        AdvancedDayAniView.f(a).b();
        a.a(AdvancedDayAniView.g(a), AdvancedDayAniView.h(a));
    }
}
