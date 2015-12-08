// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.apps.youtube.medialib.player.x;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ae, aj

final class ai extends BroadcastReceiver
{

    final ae a;
    private Handler b;
    private boolean c;

    private ai(ae ae1)
    {
        a = ae1;
        super();
    }

    ai(ae ae1, byte byte0)
    {
        this(ae1);
    }

    public final void a()
    {
        if (b == null)
        {
            b = new Handler();
        }
        if (!c)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            intentfilter.addAction("android.intent.action.SCREEN_ON");
            ae.e(a).registerReceiver(this, intentfilter);
            c = true;
        }
    }

    public final void b()
    {
        if (c)
        {
            ae.e(a).unregisterReceiver(this);
            c = false;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            if (!ae.d(a).j() && ae.d(a).f() > 0)
            {
                b.postDelayed(new aj(this), 0x2bf20L);
            }
            return;
        } else
        {
            b.removeCallbacksAndMessages(null);
            return;
        }
    }
}
