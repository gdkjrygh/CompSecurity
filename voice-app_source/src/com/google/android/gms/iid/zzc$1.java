// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.iid:
//            zzc

class zzaxp extends Handler
{

    final zzc zzaxp;

    public void handleMessage(Message message)
    {
        zzaxp.zze(message);
    }

    (zzc zzc1, Looper looper)
    {
        zzaxp = zzc1;
        super(looper);
    }
}
