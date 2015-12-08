// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            n, o

class p extends BroadcastReceiver
{

    final n a;

    private p(n n1)
    {
        a = n1;
        super();
    }

    p(n n1, o o)
    {
        this(n1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED"))
        {
            context = intent.getDataString();
            boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (!TextUtils.isEmpty(context) && !flag)
            {
                context = context.replace("package:", "");
                n.a(a, context);
            }
        }
    }
}
