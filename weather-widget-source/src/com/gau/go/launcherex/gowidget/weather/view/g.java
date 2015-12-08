// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedWidgetAnimView

class g
    implements Runnable
{

    final AdvancedWidgetAnimView a;

    g(AdvancedWidgetAnimView advancedwidgetanimview)
    {
        a = advancedwidgetanimview;
        super();
    }

    public void run()
    {
        a.a(AdvancedWidgetAnimView.a(a), AdvancedWidgetAnimView.b(a));
        a.a(AdvancedWidgetAnimView.c(a), AdvancedWidgetAnimView.d(a));
    }
}
