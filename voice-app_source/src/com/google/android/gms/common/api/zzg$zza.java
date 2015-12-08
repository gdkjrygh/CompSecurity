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

final class zzXE extends Handler
{

    final zzg zzXE;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
            return;

        case 1: // '\001'
            zzg.zzd(zzXE);
            return;

        case 2: // '\002'
            zzg.zzc(zzXE);
            break;
        }
    }

    (zzg zzg1, Looper looper)
    {
        zzXE = zzg1;
        super(looper);
    }
}
