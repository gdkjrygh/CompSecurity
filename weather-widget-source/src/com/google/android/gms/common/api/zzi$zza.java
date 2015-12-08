// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api:
//            zzi

final class zzaap extends Handler
{

    final zzi zzaap;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
            return;

        case 1: // '\001'
            zzi.zzd(zzaap);
            return;

        case 2: // '\002'
            zzi.zzc(zzaap);
            return;

        case 3: // '\003'
            ((zzaap)message.obj).zzf(zzaap);
            return;

        case 4: // '\004'
            throw (RuntimeException)message.obj;
        }
    }

    (zzi zzi1, Looper looper)
    {
        zzaap = zzi1;
        super(looper);
    }
}
