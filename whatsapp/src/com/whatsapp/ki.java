// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            LogRotationBroadcastReceiver

class ki
    implements Runnable
{

    final LogRotationBroadcastReceiver a;

    ki(LogRotationBroadcastReceiver logrotationbroadcastreceiver)
    {
        a = logrotationbroadcastreceiver;
        super();
    }

    public void run()
    {
        if (Log.a())
        {
            Log.i();
        }
        Log.h();
    }
}
