// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.jiubang.commerce.ad.d:
//            e, f

class j extends BroadcastReceiver
{

    final e a;

    private j(e e1)
    {
        a = e1;
        super();
    }

    j(e e1, f f)
    {
        this(e1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.TIME_SET".equals(intent.getAction()) && System.currentTimeMillis() < e.f(a))
        {
            if (com.jiubang.commerce.utils.j.a)
            {
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("TimeSetReceiver id=").append(Thread.currentThread().getId()).toString());
            }
            e.e(a);
            e.d(a);
        }
    }
}
