// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.go.weatherex.setting:
//            u, v

class w extends BroadcastReceiver
{

    final u a;

    private w(u u1)
    {
        a = u1;
        super();
    }

    w(u u1, v v)
    {
        this(u1);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals("android.intent.action.PACKAGE_ADDED") || context.equals("android.intent.action.PACKAGE_REMOVED") || context.equals("android.intent.action.PACKAGE_REPLACED"))
        {
            context = intent.getDataString();
            if (context != null && context.startsWith("package:com.gau.go.weatherex.language."))
            {
                u.b(a);
                u.c(a);
            }
        }
    }
}
