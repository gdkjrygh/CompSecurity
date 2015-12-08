// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedHourAniView, Clock

class d
    implements Runnable
{

    final AdvancedHourAniView a;

    d(AdvancedHourAniView advancedhouraniview)
    {
        a = advancedhouraniview;
        super();
    }

    public void run()
    {
        AdvancedHourAniView.b(a).startAnimation(AdvancedHourAniView.a(a));
    }
}
