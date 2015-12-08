// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            e, b

public class GoWeatherEXAppWidgetProvider extends AppWidgetProvider
{

    private static b a;

    public GoWeatherEXAppWidgetProvider()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        if (a == null)
        {
            a = e.a(context).a();
        }
    }
}
