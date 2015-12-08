// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.widget.FrameLayout;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            InstalledAppBackgroundPreviewView

class c
    implements Runnable
{

    final InstalledAppBackgroundPreviewView a;

    c(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        a = installedappbackgroundpreviewview;
        super();
    }

    public void run()
    {
        int i = (InstalledAppBackgroundPreviewView.a(a).getHeight() * 480) / 800;
        InstalledAppBackgroundPreviewView.a(a).getLayoutParams().width = i;
        InstalledAppBackgroundPreviewView.a(a).requestLayout();
        String s = com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.b(a).x();
        InstalledAppBackgroundPreviewView.a(a, s);
    }
}
