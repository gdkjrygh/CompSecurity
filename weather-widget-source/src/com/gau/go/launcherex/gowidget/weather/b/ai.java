// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ah

class ai extends BroadcastReceiver
{

    final ah a;

    ai(ah ah1)
    {
        a = ah1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        context = intent.getAction();
        if (context != null)
        {
            if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY"))
            {
                a.a();
                return;
            }
            if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
            {
                c.a("Remind Handler", "\u6536\u5230\u4ED8\u8D39\u72B6\u6001\u6539\u53D8\u5E7F\u64AD");
                context = com.gau.go.launcherex.gowidget.weather.c.c.a(a.a.getApplicationContext());
                boolean flag1 = context.e().b();
                context = context.f().a();
                intent = a;
                if (((u) (context)).u != 1 || !flag1)
                {
                    flag = false;
                }
                ah.a(intent, flag);
                return;
            }
        }
    }
}
