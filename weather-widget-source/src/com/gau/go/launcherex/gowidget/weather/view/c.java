// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedDayAniView, MultiDayScrollView

class c
    implements Runnable
{

    final AdvancedDayAniView a;

    c(AdvancedDayAniView advanceddayaniview)
    {
        a = advanceddayaniview;
        super();
    }

    public void run()
    {
        a.a(AdvancedDayAniView.a(a), AdvancedDayAniView.i(a));
        AdvancedDayAniView.c(a).setText(String.valueOf(25));
        a.a(AdvancedDayAniView.c(a), AdvancedDayAniView.d(a));
        AdvancedDayAniView.e(a).b();
        AdvancedDayAniView.f(a).b();
        a.a(AdvancedDayAniView.g(a), AdvancedDayAniView.j(a));
    }
}
