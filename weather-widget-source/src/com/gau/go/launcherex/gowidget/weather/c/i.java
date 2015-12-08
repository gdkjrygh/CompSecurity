// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.c:
//            g, h

class i extends BroadcastReceiver
{

    final g a;

    private i(g g1)
    {
        a = g1;
        super();
    }

    i(g g1, h h)
    {
        this(g1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            a.a();
        }
    }
}
