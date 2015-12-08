// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfj;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzc, zzf, zzk, zzg

class val.intent
    implements Runnable
{

    final Intent val$intent;
    final zzf zzAI;
    final zzc zzAJ;

    public void run()
    {
        if (zzc.zza(zzAJ).zza(zzAI.zzAS, -1, val$intent))
        {
            zzc.zzc(zzAJ).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzAJ), zzAI.zzAT, true, -1, val$intent, zzAI));
            return;
        }
        try
        {
            zzc.zzc(zzAJ).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzAJ), zzAI.zzAT, false, -1, val$intent, zzAI));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzaC("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (zzf zzf1, Intent intent1)
    {
        zzAJ = final_zzc1;
        zzAI = zzf1;
        val$intent = intent1;
        super();
    }
}
