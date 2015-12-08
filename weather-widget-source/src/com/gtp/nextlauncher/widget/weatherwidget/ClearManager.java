// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            c

public class ClearManager
{

    private c a;
    private Context b;

    static c a(ClearManager clearmanager)
    {
        return clearmanager.a;
    }

    private void a()
    {
        if (a == null)
        {
            a = new c(this, b.getContentResolver());
        }
        a.a(1, null, WeatherContentProvider.E, null, null);
    }

    static void b(ClearManager clearmanager)
    {
        clearmanager.a();
    }
}
