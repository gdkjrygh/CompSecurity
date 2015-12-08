// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.jiubang.commerce.ad.c:
//            a, b

class d extends BroadcastReceiver
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b)
    {
        this(a1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()))
        {
            String s = intent.getDataString();
            int i = s.indexOf("package:");
            context = s;
            if (i >= 0)
            {
                context = s.substring(i + "package:".length());
            }
            com.jiubang.commerce.ad.c.a.a(a, context, intent);
        }
    }
}
