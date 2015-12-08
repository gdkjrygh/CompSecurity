// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.j.a;
import com.jiubang.commerce.b.b;

public class AppBroadcastReceiver extends BroadcastReceiver
{

    public AppBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
_L2:
        return;
        if (t.j() || intent == null) goto _L2; else goto _L1
_L1:
        String s;
        String s1 = intent.getDataString();
        int i = s1.indexOf("package:");
        s = s1;
        if (i >= 0)
        {
            s = s1.substring(i + "package:".length());
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) goto _L2; else goto _L3
_L3:
        if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!b.b(context, s) || !t.a().h()) goto _L2; else goto _L4
_L4:
        a.a(context).a(context, s);
        return;
        if (!"android.intent.action.PACKAGE_REPLACED".equals(intent.getAction())) goto _L2; else goto _L5
_L5:
    }
}
