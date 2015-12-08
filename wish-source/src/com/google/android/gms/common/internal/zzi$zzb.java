// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zzj

final class zzTz extends Handler
{

    final zzi zzTz;

    public void handleMessage(Message message)
    {
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !zzTz.isConnecting())
        {
            message = (nnecting)message.obj;
            message.zzma();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(((Integer)message.obj).intValue(), null);
            if (zzi.zza(zzTz))
            {
                zzi.zzb(zzTz).zza(message);
                return;
            } else
            {
                zzi.zzc(zzTz).zzj(message);
                return;
            }
        }
        if (message.what == 4)
        {
            zzi.zza(zzTz, 4, null);
            zzi.zzc(zzTz).zzaP(((Integer)message.obj).intValue());
            zzi.zza(zzTz, 4, 1, null);
            return;
        }
        if (message.what == 2 && !zzTz.isConnected())
        {
            message = (nnected)message.obj;
            message.zzma();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6)
        {
            ((unregister)message.obj).zzmb();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public nt.zza(zzi zzi1, Looper looper)
    {
        zzTz = zzi1;
        super(looper);
    }
}
