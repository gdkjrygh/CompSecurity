// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedRainAniView

class e
    implements Runnable
{

    final AdvancedRainAniView a;

    e(AdvancedRainAniView advancedrainaniview)
    {
        a = advancedrainaniview;
        super();
    }

    public void run()
    {
        a.a(AdvancedRainAniView.a(a), AdvancedRainAniView.b(a));
        a.a(AdvancedRainAniView.c(a), AdvancedRainAniView.d(a));
    }
}
