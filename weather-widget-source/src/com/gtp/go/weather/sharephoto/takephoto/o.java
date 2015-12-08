// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            m, q

class o extends BroadcastReceiver
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED".equals(intent.getAction())) 
        {
            return;
        }
        m.a(a, 0L);
        q.a(m.a(a), null);
        m.b(a);
    }
}
