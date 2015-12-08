// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.util:
//            w

public class v
{

    public v()
    {
    }

    public w a(Intent intent)
    {
        Object obj = null;
        w w1 = obj;
        if (intent != null)
        {
            intent = intent.getExtras();
            w1 = obj;
            if (intent != null)
            {
                w1 = new w(this);
                w1.a = intent.getInt("weather_update_status", 1);
                w1.b = intent.getInt("weather_update_errorcode", -10000);
                w1.c = intent.getInt("weather_update_way", 1);
                w1.d = intent.getInt("request", 21);
                w1.e = intent.getStringArrayList("update_weather_data");
                w1.f = intent.getIntegerArrayList("weather_status");
            }
        }
        return w1;
    }
}
