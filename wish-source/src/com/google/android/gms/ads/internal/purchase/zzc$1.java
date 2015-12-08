// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdv;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzc, zzf, zzk, zzg

class zzxx
    implements Runnable
{

    final zzf zzxw;
    final Intent zzxx;
    final zzc zzxy;

    public void run()
    {
        if (zzc.zza(zzxy).zza(zzxw.zzxH, -1, zzxx))
        {
            zzc.zzc(zzxy).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzxy), zzxw.zzxI, true, -1, zzxx, zzxw));
            return;
        }
        try
        {
            zzc.zzc(zzxy).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzxy), zzxw.zzxI, false, -1, zzxx, zzxw));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzan("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (zzc zzc1, zzf zzf1, Intent intent)
    {
        zzxy = zzc1;
        zzxw = zzf1;
        zzxx = intent;
        super();
    }
}
