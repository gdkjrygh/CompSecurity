// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcu

class zzaSj
    implements android.os..Callback
{

    final zzcu zzaSj;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && zzcu.zzAT().equals(message.obj))
        {
            zzaSj.dispatch();
            if (zzcu.zzb(zzaSj) > 0 && !zzcu.zzc(zzaSj))
            {
                zzcu.zzd(zzaSj).sendMessageDelayed(zzcu.zzd(zzaSj).obtainMessage(1, zzcu.zzAT()), zzcu.zzb(zzaSj));
            }
        }
        return true;
    }

    (zzcu zzcu1)
    {
        zzaSj = zzcu1;
        super();
    }
}
