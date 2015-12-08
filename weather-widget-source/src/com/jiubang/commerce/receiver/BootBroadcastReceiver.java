// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.service.IntelligentPreloadService;

public class BootBroadcastReceiver extends BroadcastReceiver
{

    public BootBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        while (t.j() || !"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) 
        {
            return;
        }
        context.startService(new Intent(context, com/jiubang/commerce/service/IntelligentPreloadService));
    }
}
