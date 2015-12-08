// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.jiubang.goweather.c:
//            e

class f extends BroadcastReceiver
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED".equals(intent.getAction())) 
        {
            return;
        }
        e.a(a, null);
    }
}
