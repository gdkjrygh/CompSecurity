// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, aoz, LogRotationBroadcastReceiver

class nm
    implements Runnable
{

    final LogRotationBroadcastReceiver a;

    nm(LogRotationBroadcastReceiver logrotationbroadcastreceiver)
    {
        a = logrotationbroadcastreceiver;
        super();
    }

    public void run()
    {
        App.ah.B();
    }
}
