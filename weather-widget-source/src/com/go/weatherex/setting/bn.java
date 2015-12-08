// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.go.weatherex.setting:
//            bl, bm

class bn extends BroadcastReceiver
{

    final bl a;

    private bn(bl bl1)
    {
        a = bl1;
        super();
    }

    bn(bl bl1, bm bm)
    {
        this(bl1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION".equals(context = intent.getAction()) || "com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION_FAILED".equals(context))
            {
                bl.a(a, true);
                return;
            }
        }
    }
}
