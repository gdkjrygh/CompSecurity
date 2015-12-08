// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.go.weatherex.j:
//            p, x

class u extends BroadcastReceiver
{

    final p a;

    u(p p1)
    {
        a = p1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        context = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(context))
        {
            a.b();
            p.e(a);
        } else
        {
            if ("android.intent.action.SCREEN_OFF".equals(context))
            {
                a.a();
                p.f(a);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE".equals(context))
            {
                context = a.g;
                if (intent.getIntExtra("extra_new_theme_flag", 0) != 1)
                {
                    flag = false;
                }
                context.b = flag;
                p.a(a, a.g.b);
                return;
            }
        }
    }
}
