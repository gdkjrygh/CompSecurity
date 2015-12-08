// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.d:
//            e, f

class i extends BroadcastReceiver
{

    final e a;

    private i(e e1)
    {
        a = e1;
        super();
    }

    i(e e1, f f)
    {
        this(e1);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (j.a)
        {
            j.a("IntelligentPreloadService", (new StringBuilder()).append("ScreenBrocastReceiver id=").append(Thread.currentThread().getId()).toString());
        }
        if ("android.intent.action.SCREEN_ON".equals(context))
        {
            e.d(a);
        } else
        if ("android.intent.action.SCREEN_OFF".equals(context))
        {
            e.e(a);
            return;
        }
    }
}
