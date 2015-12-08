// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            ClearManager

public class Q extends BroadcastReceiver
{

    final ClearManager a;

    private void a(String s)
    {
        if (s.equals("com.gtp.nextlauncher"))
        {
            ClearManager.b(a);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED"))
        {
            context = intent.getDataString().replace("package:", "");
            boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (!TextUtils.isEmpty(context) && !flag)
            {
                a(context);
            }
        }
    }
}
