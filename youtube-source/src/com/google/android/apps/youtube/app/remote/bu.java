// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bk

final class bu extends BroadcastReceiver
{

    final bk a;

    private bu(bk bk1)
    {
        a = bk1;
        super();
    }

    bu(bk bk1, byte byte0)
    {
        this(bk1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        bk.a(a, (new StringBuilder("Recieved intent ")).append(intent.getAction()).toString());
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            if (a.b() != RemoteControl.State.OFFLINE)
            {
                a.a(RemoteControl.State.SLEEP);
                bk.s(a).sendEmptyMessage(1);
            }
        } else
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()))
        {
            a.d();
            return;
        }
    }
}
