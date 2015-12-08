// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.contextlogic.wish.push:
//            PushNotificationService

public class PushNotificationReceiver extends BroadcastReceiver
{

    public PushNotificationReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        PushNotificationService.runIntentInService(context, intent);
        setResult(-1, null, null);
    }
}
