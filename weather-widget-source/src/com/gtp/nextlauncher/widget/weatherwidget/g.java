// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            e

class g extends BroadcastReceiver
{

    final e a;

    g(e e1)
    {
        a = e1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !intent.getAction().equals("android.intent.action.PACKAGE_DATA_CLEARED") || !intent.getDataString().replace("package:", "").equals(e.p(a).getPackageName())) 
        {
            return;
        }
        e.q(a);
    }
}
