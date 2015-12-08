// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransfersExecutor

final class u extends BroadcastReceiver
{

    final TransfersExecutor a;
    private final ConnectivityManager b;
    private volatile boolean c;
    private volatile boolean d;

    public u(TransfersExecutor transfersexecutor)
    {
        a = transfersexecutor;
        super();
        b = (ConnectivityManager)TransfersExecutor.b(transfersexecutor).getSystemService("connectivity");
    }

    private boolean e()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        boolean flag;
        boolean flag1;
        if (networkinfo != null)
        {
            flag1 = networkinfo.isConnected();
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            if (networkinfo.getType() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (c == flag1 && d == flag)
        {
            return false;
        } else
        {
            c = flag1;
            d = flag;
            return true;
        }
    }

    public final boolean a()
    {
        return c;
    }

    public final boolean b()
    {
        return d;
    }

    public final void c()
    {
        IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        TransfersExecutor.b(a).registerReceiver(this, intentfilter);
        e();
    }

    public final void d()
    {
        TransfersExecutor.b(a).unregisterReceiver(this);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (e())
        {
            TransfersExecutor.c(a);
        }
    }
}
