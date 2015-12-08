// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.x;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            InstalledAppBackgroundPreviewView

class d
    implements Runnable
{

    final InstalledAppBackgroundPreviewView a;

    d(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        a = installedappbackgroundpreviewview;
        super();
    }

    public void run()
    {
        int i = (InstalledAppBackgroundPreviewView.a(a).getHeight() * 480) / 800;
        InstalledAppBackgroundPreviewView.a(a).getLayoutParams().width = i;
        InstalledAppBackgroundPreviewView.a(a).requestLayout();
        android.graphics.Bitmap bitmap = h.a(InstalledAppBackgroundPreviewView.c(a), x.a, null);
        InstalledAppBackgroundPreviewView.d(a).setImageBitmap(bitmap);
    }
}
