// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.common.network:
//            a

public class ConnectivityReceiver extends BroadcastReceiver
{

    private final IntentFilter a = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private final a b;
    private boolean c;

    public ConnectivityReceiver(Context context, a a1)
    {
        c = false;
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        context.registerReceiver(this, a);
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()))
        {
            if (!intent.getBooleanExtra("noConnectivity", false))
            {
                flag = true;
            }
            c = flag;
            b.c(new com.google.android.apps.youtube.common.network.a(c));
            return;
        } else
        {
            L.c((new StringBuilder("unexpected intent.  Received action does not match CONNECTIVITY_ACTION. ")).append(intent).toString());
            return;
        }
    }
}
