// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcu

class zzaNP
    implements android.os..Callback
{

    final zzcu zzaNP;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && zzcu.zzzD().equals(message.obj))
        {
            zzaNP.dispatch();
            if (zzcu.zzb(zzaNP) > 0 && !zzcu.zzc(zzaNP))
            {
                zzcu.zzd(zzaNP).sendMessageDelayed(zzcu.zzd(zzaNP).obtainMessage(1, zzcu.zzzD()), zzcu.zzb(zzaNP));
            }
        }
        return true;
    }

    (zzcu zzcu1)
    {
        zzaNP = zzcu1;
        super();
    }
}
