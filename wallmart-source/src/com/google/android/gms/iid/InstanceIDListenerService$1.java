// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.iid:
//            InstanceIDListenerService, MessengerCompat

class zzaBb extends Handler
{

    final InstanceIDListenerService zzaBb;

    public void handleMessage(Message message)
    {
        InstanceIDListenerService.zza(zzaBb, message, MessengerCompat.zzc(message));
    }

    (InstanceIDListenerService instanceidlistenerservice, Looper looper)
    {
        zzaBb = instanceidlistenerservice;
        super(looper);
    }
}
