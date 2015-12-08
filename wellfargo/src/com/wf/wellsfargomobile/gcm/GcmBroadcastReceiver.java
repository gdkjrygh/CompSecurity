// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

// Referenced classes of package com.wf.wellsfargomobile.gcm:
//            GcmIntentService

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver
{

    public GcmBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        startWakefulService(context, intent.setComponent(new ComponentName(context.getPackageName(), com/wf/wellsfargomobile/gcm/GcmIntentService.getName())));
        setResultCode(-1);
    }
}
