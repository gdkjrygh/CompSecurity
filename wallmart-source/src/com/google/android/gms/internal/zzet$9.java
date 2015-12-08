// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzet, zzej

class zzze
    implements Runnable
{

    final zzet zzze;

    public void run()
    {
        try
        {
            zzet.zza(zzze).onAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdClosed.", remoteexception);
        }
    }

    l.client.zzb(zzet zzet1)
    {
        zzze = zzet1;
        super();
    }
}
