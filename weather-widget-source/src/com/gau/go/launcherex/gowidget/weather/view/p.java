// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.widget.ImageView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AppWidgetGuideActivity

class p
    implements Runnable
{

    final AppWidgetGuideActivity a;

    p(AppWidgetGuideActivity appwidgetguideactivity)
    {
        a = appwidgetguideactivity;
        super();
    }

    public void run()
    {
        ImageView imageview = (ImageView)a.findViewById(0x7f0901ab);
        AppWidgetGuideActivity.a(a, imageview);
        imageview = (ImageView)a.findViewById(0x7f0901ac);
        AppWidgetGuideActivity.a(a, imageview);
        imageview = (ImageView)a.findViewById(0x7f0901ad);
        AppWidgetGuideActivity.a(a, imageview);
        imageview = (ImageView)a.findViewById(0x7f0901af);
        AppWidgetGuideActivity.a(a, imageview);
        imageview = (ImageView)a.findViewById(0x7f0901b0);
        AppWidgetGuideActivity.a(a, imageview);
        imageview = (ImageView)a.findViewById(0x7f0901b1);
        AppWidgetGuideActivity.a(a, imageview);
        int i = imageview.getWidth();
        imageview = (ImageView)a.findViewById(0x7f0901b3);
        int j = (int)((float)i / 0.6033058F);
        imageview.getLayoutParams().height = j;
        imageview.getLayoutParams().width = i;
        imageview.requestLayout();
    }
}
