// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            n

public final class HdmiReceiver extends BroadcastReceiver
{

    private final IntentFilter a = new IntentFilter("android.intent.action.HDMI_PLUGGED");
    private final Context b;
    private final n c;
    private boolean d;
    private boolean e;

    public HdmiReceiver(Context context, n n1)
    {
        d = false;
        e = false;
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        c = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1);
    }

    public final void a()
    {
        if (!d)
        {
            d = true;
            b.registerReceiver(this, a);
        }
    }

    public final void b()
    {
        if (d)
        {
            d = false;
            e = false;
            b.unregisterReceiver(this);
        }
    }

    public final boolean c()
    {
        return e;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.HDMI_PLUGGED".equals(intent.getAction()))
        {
            e = intent.getBooleanExtra("state", false);
            context = c;
            boolean flag = e;
            context.H();
            return;
        } else
        {
            L.c((new StringBuilder("unexpected intent: ")).append(intent).toString());
            return;
        }
    }
}
