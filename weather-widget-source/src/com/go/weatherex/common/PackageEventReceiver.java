// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.common:
//            d

public class PackageEventReceiver extends BroadcastReceiver
{

    private d a;

    public PackageEventReceiver()
    {
    }

    public void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentfilter.addDataScheme("package");
        context.registerReceiver(this, intentfilter);
    }

    public void a(d d1)
    {
        a = d1;
    }

    public void b(Context context)
    {
        context.unregisterReceiver(this);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!"android.intent.action.PACKAGE_ADDED".equals(context)) goto _L2; else goto _L1
_L1:
        context = intent.getDataString().replace("package:", "");
        boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!TextUtils.isEmpty(context) && !flag)
        {
            c.a("PackageEventReceiver", (new StringBuilder()).append("ACTION_PACKAGE_ADDED: ").append(context).toString());
            if (a != null)
            {
                a.d(context);
            }
        }
_L4:
        return;
_L2:
        if (!"android.intent.action.PACKAGE_REMOVED".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        context = intent.getDataString().replace("package:", "");
        boolean flag1 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!TextUtils.isEmpty(context) && !flag1)
        {
            c.a("PackageEventReceiver", (new StringBuilder()).append("ACTION_PACKAGE_REMOVED: ").append(context).toString());
            if (a != null)
            {
                a.b(context);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"android.intent.action.PACKAGE_REPLACED".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = intent.getDataString().replace("package:", "");
        boolean flag2 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!TextUtils.isEmpty(context) && flag2)
        {
            c.a("PackageEventReceiver", (new StringBuilder()).append("ACTION_PACKAGE_REPLACED: ").append(context).toString());
            if (a != null)
            {
                a.a(context);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!context.equals("android.intent.action.PACKAGE_DATA_CLEARED")) goto _L4; else goto _L5
_L5:
        context = intent.getDataString().replace("package:", "");
        if (!TextUtils.isEmpty(context))
        {
            c.a("PackageEventReceiver", (new StringBuilder()).append("ACTION_PACKAGE_DATA_CLEARED: ").append(context).toString());
            if (a != null)
            {
                a.c(context);
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }
}
