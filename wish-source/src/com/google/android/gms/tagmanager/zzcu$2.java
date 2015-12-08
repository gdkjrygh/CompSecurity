// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcu

class zzaFB
    implements android.os..Callback
{

    final zzcu zzaFB;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && zzcu.zzxH().equals(message.obj))
        {
            zzaFB.dispatch();
            if (zzcu.zzb(zzaFB) > 0 && !zzcu.zzc(zzaFB))
            {
                zzcu.zzd(zzaFB).sendMessageDelayed(zzcu.zzd(zzaFB).obtainMessage(1, zzcu.zzxH()), zzcu.zzb(zzaFB));
            }
        }
        return true;
    }

    (zzcu zzcu1)
    {
        zzaFB = zzcu1;
        super();
    }
}
