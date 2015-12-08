// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.remote.bk;
import com.google.android.apps.youtube.core.Analytics;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            AutomaticPairingActivity

final class c extends Handler
{

    final AutomaticPairingActivity a;

    c(AutomaticPairingActivity automaticpairingactivity)
    {
        a = automaticpairingactivity;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 10000)
        {
            AutomaticPairingActivity.a(a).a("MDXPushNotificationPairingSuccessful", "NavigateToPostPairing");
            AutomaticPairingActivity.d(a).b(AutomaticPairingActivity.c(a));
            a.n = a.N();
            a.n.a();
            a.n.g();
        }
    }
}
