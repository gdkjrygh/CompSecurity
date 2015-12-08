// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWeatherWidget41Style2

class e extends BroadcastReceiver
{

    final GLWeatherWidget41Style2 a;

    e(GLWeatherWidget41Style2 glweatherwidget41style2)
    {
        a = glweatherwidget41style2;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        for (context = intent.getAction(); context == null || GLWeatherWidget41Style2.access$500(a) == null || !context.equals("android.intent.action.PACKAGE_DATA_CLEARED") || !intent.getDataString().replace("package:", "").equals(GLWeatherWidget41Style2.access$1700(a).getPackageName());)
        {
            return;
        }

        GLWeatherWidget41Style2.access$1800(a);
    }
}
