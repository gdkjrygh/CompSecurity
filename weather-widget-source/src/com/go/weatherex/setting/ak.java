// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.go.weatherex.setting:
//            aj

class ak extends BroadcastReceiver
{

    final aj a;

    ak(aj aj1)
    {
        a = aj1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_LOADING_FINISH".equals(intent.getAction())) 
        {
            return;
        }
        aj.a(a);
    }
}
