// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg

final class zzQJ extends Handler
{

    final zzg zzQJ;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
            return;

        case 1: // '\001'
            zzg.zzg(zzQJ);
            return;

        case 2: // '\002'
            zzg.zzf(zzQJ);
            break;
        }
    }

    (zzg zzg1, Looper looper)
    {
        zzQJ = zzg1;
        super(looper);
    }
}
