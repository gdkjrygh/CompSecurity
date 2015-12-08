// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            j, d

final class e extends BroadcastReceiver
{

    final j a;
    final d b;

    e(d d, j j1)
    {
        b = d;
        a = j1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("com.google.android.youtube.action.controller_notification_prev".equals(intent.getAction()))
        {
            a.e();
        } else
        {
            if ("com.google.android.youtube.action.controller_notification_play_pause".equals(intent.getAction()))
            {
                a.d();
                return;
            }
            if ("com.google.android.youtube.action.controller_notification_next".equals(intent.getAction()))
            {
                a.f();
                return;
            }
            if ("com.google.android.youtube.action.controller_notification_close".equals(intent.getAction()))
            {
                a.g();
                return;
            }
            if ("com.google.android.youtube.action.controller_notification_replay".equals(intent.getAction()))
            {
                a.h();
                return;
            }
        }
    }
}
