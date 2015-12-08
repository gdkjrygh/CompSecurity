// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzdw, zzec, zzeg

class zzxq
    implements Runnable
{

    final zzec zzxq;
    final zzdw zzxr;

    public void run()
    {
        try
        {
            zzxq.zzya.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not destroy mediation adapter.", remoteexception);
        }
    }

    l.client.zzb(zzdw zzdw1, zzec zzec1)
    {
        zzxr = zzdw1;
        zzxq = zzec1;
        super();
    }
}
