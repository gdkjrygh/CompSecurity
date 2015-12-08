// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzgw;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zzc, zzb

public class zzf extends zzg
{

    public zzf()
    {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    private com.google.android.gms.ads.internal.reward.client.zzb zzb(Context context, zzeg zzeg)
    {
        com.google.android.gms.dynamic.zzd zzd1 = zze.zzx(context);
        context = com.google.android.gms.ads.internal.reward.client.zzb.zza.zzZ(((zzc)zzar(context)).zza(zzd1, zzeg, 0x7877d8));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get remote RewardedVideoAd.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public com.google.android.gms.ads.internal.reward.client.zzb zza(Context context, zzeg zzeg)
    {
        Object obj;
label0:
        {
            if (zzk.zzcE().zzR(context))
            {
                com.google.android.gms.ads.internal.reward.client.zzb zzb1 = zzb(context, zzeg);
                obj = zzb1;
                if (zzb1 != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Using RewardedVideoAd from the client jar.");
            obj = new zzgw(context, zzeg, new VersionInfoParcel(0x7877d8, 0x7877d8, true));
        }
        return ((com.google.android.gms.ads.internal.reward.client.zzb) (obj));
    }

    protected zzc zzac(IBinder ibinder)
    {
        return zzc.zza.zzaa(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzac(ibinder);
    }
}
