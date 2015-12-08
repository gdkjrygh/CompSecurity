// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.go.weatherex.wear:
//            c, d

class e extends BroadcastReceiver
{

    final c a;

    private e(c c1)
    {
        a = c1;
        super();
    }

    e(c c1, d d)
    {
        this(c1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("com.go.weatherex.wear.ACTION_WEAR_WEATHER_CARD".equals(intent.getAction()))
        {
            c.a(a).sendEmptyMessage(0);
        }
    }
}
