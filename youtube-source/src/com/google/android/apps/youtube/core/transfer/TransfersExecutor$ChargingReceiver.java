// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.youtube.core.utils.Util;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransfersExecutor

public class a extends BroadcastReceiver
{

    final TransfersExecutor a;
    private volatile boolean b;

    public final void a()
    {
        b = Util.b(TransfersExecutor.b(a));
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentfilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        TransfersExecutor.b(a).registerReceiver(this, intentfilter);
    }

    public final void b()
    {
        TransfersExecutor.b(a).unregisterReceiver(this);
    }

    public final boolean c()
    {
        return b;
    }

    public void onReceive(Context context, Intent intent)
    {
        b = "android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction());
        TransfersExecutor.c(a);
    }

    public (TransfersExecutor transfersexecutor)
    {
        a = transfersexecutor;
        super();
    }
}
